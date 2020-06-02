package com.news.app.service.impl;

import com.news.app.mbg.mapper.NewsMapper;
import com.news.app.mbg.model.News;
import com.news.app.mbg.model.NewsExample;

import com.github.pagehelper.PageHelper;
import com.news.app.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * News Service 实现类
 * Created by petardation on 2020/5/19.
 */
@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsMapper newsMapper;

    @Override
    public List<News> listAllArticle() {
        return newsMapper.selectByExample(new NewsExample());
    }

    @Override
    public int createArticle(News news) {
        return  newsMapper.insertSelective(news);
    }

    @Override
    public int updateArticle(int id, News news) {
        news.setNewsId(id);
        return newsMapper.updateByPrimaryKeySelective(news);
    }

    @Override
    public int deleteArticle(int id) {
        return newsMapper.deleteByPrimaryKey(id);
        //return newsMapper.deleteByPrimaryKey(Integer.valueOf(id));
    }

    @Override
    public List<News> listArticle(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return newsMapper.selectByExample(new NewsExample());
    }

    @Override
    public News getArticle(int id) {
        return newsMapper.selectByPrimaryKey(id);
        //return newsMapper.selectByPrimaryKey(Integer.valueOf(id));
    }

    @Override
    public int incrementRead(int id, int read,News news){
        news.setNewsId(id);
        news.setNewsRead(read);
        return newsMapper.updateByPrimaryKeySelective(news);
    }

    @Override
    public int showRead(News news){
        return news.getNewsRead();
    }
}

