package com.news.app.service.impl;

import com.news.app.mbg.mapper.LikesMapper;
import com.news.app.mbg.model.*;
import com.news.app.service.LikesService;

import com.news.app.mbg.mapper.NewsMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LikesServiceImpl implements LikesService {
    @Autowired
    private LikesMapper likesMapper;

    @Autowired
    private NewsMapper newsMapper;


    public int like(int news_id, int user_id){

        News tmp = newsMapper.selectByPrimaryKey(news_id);
        tmp.setLikes(tmp.getLikes()+1);
        newsMapper.updateByPrimaryKey(tmp);

        Likes like = new Likes();
        like.setLikeNewsdm(String.valueOf(news_id));
        like.setLikeUserdm(String.valueOf(news_id));
        return likesMapper.insert(like);
    }

    public int unlike(int news_id, int user_id){
        News tmp = newsMapper.selectByPrimaryKey(news_id);
        tmp.setLikes(tmp.getLikes()-1);
        newsMapper.updateByPrimaryKey(tmp);

        Likes like = new Likes();
        LikesExample example = new LikesExample();
        example.createCriteria().andLikeNewsdmEqualTo(String.valueOf(news_id)).andLikeUserdmEqualTo(String.valueOf(user_id));
        return likesMapper.deleteByExample(example);
    }
}
