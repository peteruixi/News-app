package com.news.app.mbg.mapper;

import com.news.app.mbg.model.Permit;
import com.news.app.mbg.model.PermitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermitMapper {
    int countByExample(PermitExample example);

    int deleteByExample(PermitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Permit record);

    int insertSelective(Permit record);

    List<Permit> selectByExample(PermitExample example);

    Permit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Permit record, @Param("example") PermitExample example);

    int updateByExample(@Param("record") Permit record, @Param("example") PermitExample example);

    int updateByPrimaryKeySelective(Permit record);

    int updateByPrimaryKey(Permit record);
}