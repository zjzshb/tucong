package com.dao;

import com.bo.PicLabelInfo;
import com.bo.PicLabelInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PicLabelInfoMapper {
    long countByExample(PicLabelInfoExample example);

    int deleteByExample(PicLabelInfoExample example);

    int deleteByPrimaryKey(Integer picLabelId);

    int insert(PicLabelInfo record);

    int insertSelective(PicLabelInfo record);

    List<PicLabelInfo> selectByExampleWithBLOBs(PicLabelInfoExample example);

    List<PicLabelInfo> selectByExample(PicLabelInfoExample example);

    PicLabelInfo selectByPrimaryKey(Integer picLabelId);

    int updateByExampleSelective(@Param("record") PicLabelInfo record, @Param("example") PicLabelInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") PicLabelInfo record, @Param("example") PicLabelInfoExample example);

    int updateByExample(@Param("record") PicLabelInfo record, @Param("example") PicLabelInfoExample example);

    int updateByPrimaryKeySelective(PicLabelInfo record);

    int updateByPrimaryKeyWithBLOBs(PicLabelInfo record);

    int updateByPrimaryKey(PicLabelInfo record);
}