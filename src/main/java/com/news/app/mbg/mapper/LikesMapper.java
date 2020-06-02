package com.news.app.mbg.mapper;

import com.news.app.mbg.model.Likes;
import com.news.app.mbg.model.LikesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LikesMapper {
    int countByExample(LikesExample example);

    int deleteByExample(LikesExample example);

    int deleteByPrimaryKey(Integer likeId);

    int insert(Likes record);

    int insertSelective(Likes record);

    List<Likes> selectByExample(LikesExample example);

    Likes selectByPrimaryKey(Integer likeId);

    int updateByExampleSelective(@Param("record") Likes record, @Param("example") LikesExample example);

    int updateByExample(@Param("record") Likes record, @Param("example") LikesExample example);

    int updateByPrimaryKeySelective(Likes record);

    int updateByPrimaryKey(Likes record);
}