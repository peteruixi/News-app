package com.news.app.service.impl;

import com.news.app.common.api.CommonResult;
import com.news.app.controller.NewsController;
import com.news.app.mbg.mapper.UserMapper;
import com.news.app.mbg.model.User;
import com.news.app.mbg.model.UserExample;

import com.news.app.mbg.model.Userrole;
import com.news.app.mbg.model.UserroleExample;
import com.news.app.mbg.mapper.UserroleMapper;

import com.news.app.mbg.model.Userinfo;
import com.news.app.mbg.mapper.UserinfoMapper;
import com.news.app.mbg.model.UserinfoExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.news.app.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.news.app.service.UserService;

import java.util.Random;
/**
 * 会员管理Service实现类
 * Created by macro on 2020/4/18.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private RedisService redisService;

    private static final Logger LOGGER = LoggerFactory.getLogger(NewsController.class);

    @Value("${redis.key.prefix.authCode}")
    private String REDIS_KEY_PREFIX_AUTH_CODE;
    @Value("${redis.key.expire.authCode}")
    private Long AUTH_CODE_EXPIRE_SECONDS;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserinfoMapper userinfoMapper;
    @Autowired
    private UserroleMapper uroleMapper;


    @Override
    public CommonResult generateAuthCode(String telephone) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            sb.append(random.nextInt(10));
        }
        //验证码绑定手机号并存储到redis
        redisService.set(REDIS_KEY_PREFIX_AUTH_CODE + telephone, sb.toString());
        redisService.expire(REDIS_KEY_PREFIX_AUTH_CODE + telephone, AUTH_CODE_EXPIRE_SECONDS);
        return CommonResult.success(sb.toString(), "获取验证码成功");
    }


    //对输入的验证码进行校验
    @Override
    public CommonResult verifyAuthCode(String telephone, String authCode) {
        if (StringUtils.isEmpty(authCode)) {
            return CommonResult.failed("请输入验证码");
        }
        String realAuthCode = redisService.get(REDIS_KEY_PREFIX_AUTH_CODE + telephone);
        boolean result = authCode.equals(realAuthCode);
        if (result) {
            return CommonResult.success(null, "验证码校验成功");
        } else {
            return CommonResult.failed("验证码不正确");
        }
    }

    @Override
    public int registerUser(User user){

        //按照已有用户数量设置id
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserIdIsNotNull();
        int count = userMapper.countByExample(userExample);
        user.setUserId(count+=1);

        //按照已有用户详情数量设置设置用户详情id
        Userinfo userinfo = new Userinfo();
        UserinfoExample userinfoExample = new UserinfoExample();
        userinfoExample.createCriteria().andUserinfoIdIsNotNull();
        String info_count = String.valueOf((userinfoMapper.countByExample(userinfoExample))+1);
        user.setUserInfodm(info_count);

        Userrole userrole = new Userrole();
        userrole.setUserId(count);
        userrole.setRoleId(4);
        uroleMapper.insert(userrole);

        userinfo.setUseridDm(String.valueOf(user.getUserId()));
        userinfoMapper.insert(userinfo);
        return  userMapper.insertSelective(user);
    }

}
