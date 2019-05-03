package com.dao;

import com.bo.PicGroupInfo;
import com.bo.PicGroupInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PicGroupInfoMapper {
    long countByExample(PicGroupInfoExample example);

    int deleteByExample(PicGroupInfoExample example);

    int deleteByPrimaryKey(Byte picGroupId);

    int insert(PicGroupInfo record);

    int insertSelective(PicGroupInfo record);

    List<PicGroupInfo> selectByExample(PicGroupInfoExample example);

    PicGroupInfo selectByPrimaryKey(Byte picGroupId);

    int updateByExampleSelective(@Param("record") PicGroupInfo record, @Param("example") PicGroupInfoExample example);

    int updateByExample(@Param("record") PicGroupInfo record, @Param("example") PicGroupInfoExample example);

    int updateByPrimaryKeySelective(PicGroupInfo record);

    int updateByPrimaryKey(PicGroupInfo record);
}