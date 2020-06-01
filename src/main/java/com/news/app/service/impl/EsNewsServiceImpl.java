package com.news.app.service.impl;


import com.news.app.dao.EsNewsDao;
import com.news.app.nosql.elasticsearch.document.EsNews;
import com.news.app.nosql.elasticsearch.repository.EsNewsRepository;
import com.news.app.service.EsNewsService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * 新闻搜索
 *
 */
@Service
public class EsNewsServiceImpl implements EsNewsService {
    private static final Logger LOGGER = LoggerFactory.getLogger(EsNewsServiceImpl.class);
    @Autowired
    private EsNewsDao newsDao;
    @Autowired
    private EsNewsRepository newsRepository;

    @Override
    public int importAll() {

        List<EsNews> esNewsList = newsDao.getAllEsNewsList(null);
        //LOGGER.info(String.valueOf(esNewsList));
        Iterable<EsNews> esNewsIterable = newsRepository.saveAll(esNewsList);
        Iterator<EsNews> iterator = esNewsIterable.iterator();
        int result = 0;
        while (iterator.hasNext()) {
            result++;
            iterator.next();
        }
        return result;
    }

    @Override
    public void delete(Long id) {
        newsRepository.deleteById(id);
    }

    @Override
    public EsNews create(Long id) {
        EsNews result = null;
        List<EsNews> esNewsList = newsDao.getAllEsNewsList(id);
        if (esNewsList.size() > 0) {
            EsNews esProduct = esNewsList.get(0);
            result = newsRepository.save(esProduct);
        }
        return result;
    }

    @Override
    public void delete(List<Long> ids) {
        if (!CollectionUtils.isEmpty(ids)) {
            List<EsNews> esNewsList = new ArrayList<>();
            for (Long id : ids) {
                EsNews esNews = new EsNews();
                esNews.setId(Long.toString(id));
                esNewsList.add(esNews);
            }
            newsRepository.deleteAll(esNewsList);
        }
    }

    @Override
    public Page<EsNews> search(String title, Integer pageNum, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNum, pageSize);
        return newsRepository.findBytitle(title, pageable);
    }

    /*@Override
    public Page<EsNews> searchByKeywords(String keywords, Integer pageNum, Integer pageSize){
        Pageable pageable = PageRequest.of(pageNum, pageSize);
        return newsRepository.findByPic_Name(keywords,pageable);
    }*/

}
