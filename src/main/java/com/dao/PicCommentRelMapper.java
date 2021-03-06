package com.dao;

import com.bo.PicCommentRel;
import com.bo.PicCommentRelExample;
import java.util.List;

import com.bo.QryCommentBean;
import com.bo.QryPhotoBean;
import org.apache.ibatis.annotations.Param;

public interface PicCommentRelMapper {
    long countByExample(PicCommentRelExample example);

    int deleteByExample(PicCommentRelExample example);

    int deleteByPrimaryKey(Integer picGroupId);

    int insert(PicCommentRel record);

    int insertSelective(PicCommentRel record);

    List<PicCommentRel> selectByExample(PicCommentRelExample example);

    PicCommentRel selectByPrimaryKey(Integer picGroupId);

    int updateByExampleSelective(@Param("record") PicCommentRel record, @Param("example") PicCommentRelExample example);

    int updateByExample(@Param("record") PicCommentRel record, @Param("example") PicCommentRelExample example);

    int updateByPrimaryKeySelective(PicCommentRel record);

    int updateByPrimaryKey(PicCommentRel record);

    List<QryCommentBean> qryCommentByCondition(QryCommentBean qryCommentBean);
}