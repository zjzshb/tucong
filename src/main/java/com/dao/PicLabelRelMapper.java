package com.dao;

import com.bo.PicLabelRel;
import com.bo.PicLabelRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PicLabelRelMapper {
    long countByExample(PicLabelRelExample example);

    int deleteByExample(PicLabelRelExample example);

    int insert(PicLabelRel record);

    int insertSelective(PicLabelRel record);

    List<PicLabelRel> selectByExample(PicLabelRelExample example);

    int updateByExampleSelective(@Param("record") PicLabelRel record, @Param("example") PicLabelRelExample example);

    int updateByExample(@Param("record") PicLabelRel record, @Param("example") PicLabelRelExample example);
}