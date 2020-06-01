package com.news.app.service.impl;

import com.news.app.nosql.mongodb.document.UserReadHistory;
import com.news.app.nosql.mongodb.repository.UserReadHistoryRepository;
import com.news.app.service.UserReadHistoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class UserReadHistoryServiceImpl implements UserReadHistoryService{

    /**
     * 生成浏览记录
     */
    @Autowired
    private UserReadHistoryRepository userReadHistoryRepository;
    @Override
    public int create(UserReadHistory userReadHistory){
        userReadHistory.setId(null);
        userReadHistory.setCreateTime(new Date());
        userReadHistoryRepository.save(userReadHistory);
        return 1;
    }

    /**
     * 批量删除浏览记录
     */
    @Override
    public int delete(List<String> ids){
        List<UserReadHistory> deleteList = new ArrayList<>();
        for(String id:ids){
            UserReadHistory memberReadHistory = new UserReadHistory();
            memberReadHistory.setId(id);
            deleteList.add(memberReadHistory);
        }
        userReadHistoryRepository.deleteAll(deleteList);
        return ids.size();
    }

    /**
     * 获取用户浏览历史记录
     */
    @Override
    public List<UserReadHistory> list(Long userId){
        return userReadHistoryRepository.findByUserIdOrderByCreateTimeDesc(userId);
    }
}
