package com.news.app.service;

import com.news.app.mbg.model.Likes;
import com.news.app.mbg.model.LikesExample;
import com.news.app.mbg.mapper.LikesMapper;

/**
 * Like Services
 */
public interface LikesService {

    /**
     * Implementation of like button
     */
    int like(int news_id, int user_id);

    /**
     * Implementation of unlike
     */
    int unlike (int news_id, int user_id);
}
