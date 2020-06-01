package com.news.app.service;



import com.news.app.nosql.elasticsearch.document.EsNews;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * 商品搜索管理Service
 * Created by macro on 2018/6/19.
 */
public interface EsNewsService {
    /**
     * 从数据库中导入所有商品到ES
     */
    int importAll();

    /**
     * 根据id删除商品
     */
    void delete(Long id);

    /**
     * 根据id创建商品
     */
    EsNews create(Long id);

    /**
     * 批量删除商品
     */
    void delete(List<Long> ids);

    /**
     * 根据标题搜索文章
     */
    Page<EsNews> search(String title, Integer pageNum, Integer pageSize);

    /*
     * 根据关键词搜索文章
     */
    //Page<EsNews> searchByKeywords(String keywords, Integer pageNum, Integer pageSize);

}
