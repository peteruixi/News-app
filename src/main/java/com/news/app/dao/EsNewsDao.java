package com.news.app.dao;

import org.apache.ibatis.annotations.Param;
import com.news.app.nosql.elasticsearch.document.EsNews;
import java.util.List;


public interface EsNewsDao {
    List<EsNews> getAllEsNewsList(@Param("id") Long id);
}
