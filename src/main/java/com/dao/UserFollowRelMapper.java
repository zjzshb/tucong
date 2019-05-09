package com.dao;

import com.bo.UserFollowRel;
import com.bo.UserFollowRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFollowRelMapper {
    long countByExample(UserFollowRelExample example);

    int deleteByExample(UserFollowRelExample example);

    int insert(UserFollowRel record);

    int insertSelective(UserFollowRel record);

    List<UserFollowRel> selectByExample(UserFollowRelExample example);

    int updateByExampleSelective(@Param("record") UserFollowRel record, @Param("example") UserFollowRelExample example);

    int updateByExample(@Param("record") UserFollowRel record, @Param("example") UserFollowRelExample example);
}