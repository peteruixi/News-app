package com.news.app.dao;

import com.news.app.mbg.model.Function;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface AdminRoleRelationDao {
    List<Function> getFunctionList(@Param("adminId") String adminId);
}
