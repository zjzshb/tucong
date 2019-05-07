package com.dao;

import com.bo.PicLikeRel;
import com.bo.PicLikeRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PicLikeRelMapper {
    long countByExample(PicLikeRelExample example);

    int deleteByExample(PicLikeRelExample example);

    int deleteByPrimaryKey(Integer picId);

    int insert(PicLikeRel record);

    int insertSelective(PicLikeRel record);

    List<PicLikeRel> selectByExample(PicLikeRelExample example);

    PicLikeRel selectByPrimaryKey(Integer picId);

    int updateByExampleSelective(@Param("record") PicLikeRel record, @Param("example") PicLikeRelExample example);

    int updateByExample(@Param("record") PicLikeRel record, @Param("example") PicLikeRelExample example);

    int updateByPrimaryKeySelective(PicLikeRel record);

    int updateByPrimaryKey(PicLikeRel record);
}