package com.news.app.service;

import com.news.app.mbg.mapper.NewsMapper;
import com.news.app.mbg.model.News;
import com.news.app.mbg.model.NewsExample;


import java.util.List;

/**
 * PmsBrandService
 * Created by macro on 2019/4/19.
 */
public interface NewsService {
    List<News> listAllArticle();

    int createArticle(News news);

    int updateArticle(int id, News news);

    int deleteArticle(int id);

    List<News> listArticle(int pageNum, int pageSize);

    News getArticle(int id);


    int incrementRead(int id, int read,News news);

    int showRead(News news);
}
