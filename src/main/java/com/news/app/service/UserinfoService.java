package com.news.app.service;

import com.news.app.mbg.mapper.UserinfoMapper;
import com.news.app.mbg.model.UserinfoExample;
import com.news.app.mbg.model.Userinfo;

import java.util.List;
public interface UserinfoService {

    int updateUserinfo(String id, Userinfo userinfo);

    List <Userinfo> getUserinfo(String id);



}
