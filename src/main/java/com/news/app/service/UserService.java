package com.news.app.service;

import com.news.app.common.api.CommonResult;
import com.news.app.mbg.model.User;
import java.util.Date;
/**
 * 会员管理Service
 * Created by Petardation 5/28/2020
 */
public interface UserService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

    /*
     * 用户提供用户名密码和个人描述进行注册
     */
    int registerUser( User user);
}
