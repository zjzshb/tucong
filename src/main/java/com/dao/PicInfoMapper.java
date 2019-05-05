package com.dao;

import com.bo.PicInfo;
import com.bo.PicInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PicInfoMapper {
    long countByExample(PicInfoExample example);

    int deleteByExample(PicInfoExample example);

    int deleteByPrimaryKey(Integer picId);

    int insert(PicInfo record);

    int insertSelective(PicInfo record);

    List<PicInfo> selectByExample(PicInfoExample example);

    PicInfo selectByPrimaryKey(Integer picId);

    int updateByExampleSelective(@Param("record") PicInfo record, @Param("example") PicInfoExample example);

    int updateByExample(@Param("record") PicInfo record, @Param("example") PicInfoExample example);

    int updateByPrimaryKeySelective(PicInfo record);

    int updateByPrimaryKey(PicInfo record);
}