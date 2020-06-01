package com.news.app.service;

import com.news.app.nosql.mongodb.document.UserReadHistory;
import java.util.List;

public interface UserReadHistoryService {
    /**
     * 生成浏览记录
     */
    int create(UserReadHistory memberReadHistory);

    /**
     * 批量删除浏览记录
     */
    int delete(List<String> ids);

    /**
     * 获取用户浏览历史记录
     */
    List<UserReadHistory> list(Long userId);
}
