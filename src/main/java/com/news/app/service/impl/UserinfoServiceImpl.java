package com.news.app.service.impl;

import com.news.app.mbg.mapper.UserinfoMapper;
import com.news.app.mbg.model.Userinfo;
import com.news.app.mbg.model.UserinfoExample;

import com.news.app.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
* UserinfoService 的实现类
* Created by petardation on 2020/5/27
 */
@Service
public class UserinfoServiceImpl implements UserinfoService {
    @Autowired
    private UserinfoMapper userinfoMapper;


    @Override
    public int updateUserinfo(String id, Userinfo userinfo){

        userinfo.setUserinfoId(Integer.valueOf(id));
        return userinfoMapper.updateByPrimaryKeySelective(userinfo);
    }

    @Override
    public List<Userinfo> getUserinfo(String id){
        /*UmsAdminExample example = new UmsAdminExample();
        example.createCriteria().andUsernameEqualTo(umsAdmin.getUsername());
        List<UmsAdmin> umsAdminList = adminMapper.selectByExample(example);*/

        UserinfoExample example = new UserinfoExample();
        example.createCriteria().andUseridDmEqualTo(id);
        List<Userinfo> UserinfoList = userinfoMapper.selectByExample(example);
        return UserinfoList;
    }


}
