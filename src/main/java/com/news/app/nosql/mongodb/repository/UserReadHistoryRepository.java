package com.news.app.nosql.mongodb.repository;

import com.news.app.nosql.mongodb.document.UserReadHistory;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface UserReadHistoryRepository extends MongoRepository<UserReadHistory,String> {
    /**
     * 根据会员id按时间倒序获取浏览记录
     * @param userId 会员id
     */
    List<UserReadHistory> findByUserIdOrderByCreateTimeDesc(Long userId);

}
