package com.news.app.nosql.elasticsearch.repository;

import com.news.app.nosql.elasticsearch.document.EsNews;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 商品ES操作类
 * Created by macro on 2018/6/19.
 */
public interface EsNewsRepository extends ElasticsearchRepository<EsNews, Long> {
    /**
     * 搜索查询
     *
     * @param title         新闻名称
     * @param page          分页信息
     * @return
     */
    Page<EsNews> findBytitle(String title, Pageable page);

    /**
     * 搜索查询
     *
     * @param pic_name      新闻关键词
     * @param page          分页信息
     * @return

    Page<EsNews> findByPic_Name(String pic_name, Pageable page);
    */
}
