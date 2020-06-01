package com.news.app.mbg.mapper;

import com.news.app.mbg.model.Adminrole;
import com.news.app.mbg.model.AdminroleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminroleMapper {
    int countByExample(AdminroleExample example);

    int deleteByExample(AdminroleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Adminrole record);

    int insertSelective(Adminrole record);

    List<Adminrole> selectByExample(AdminroleExample example);

    Adminrole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Adminrole record, @Param("example") AdminroleExample example);

    int updateByExample(@Param("record") Adminrole record, @Param("example") AdminroleExample example);

    int updateByPrimaryKeySelective(Adminrole record);

    int updateByPrimaryKey(Adminrole record);
}