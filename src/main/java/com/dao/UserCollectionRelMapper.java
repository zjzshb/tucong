package com.dao;

import com.bo.UserCollectionRel;
import com.bo.UserCollectionRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCollectionRelMapper {
    long countByExample(UserCollectionRelExample example);

    int deleteByExample(UserCollectionRelExample example);

    int insert(UserCollectionRel record);

    int insertSelective(UserCollectionRel record);

    List<UserCollectionRel> selectByExample(UserCollectionRelExample example);

    int updateByExampleSelective(@Param("record") UserCollectionRel record, @Param("example") UserCollectionRelExample example);

    int updateByExample(@Param("record") UserCollectionRel record, @Param("example") UserCollectionRelExample example);
}