package com.service.impl;

import com.bo.PicCommentRel;
import com.bo.QryCommentBean;
import com.dao.PicCommentRelMapper;
import com.service.interfaces.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by John on 2019/5/8.
 */
@Service("commentService")
public class CommentServiceImpl implements CommentService {
    @Autowired
    PicCommentRelMapper picCommentRelMapper;
    @Override
    public List<QryCommentBean> QryCommentByCondition(QryCommentBean qryCommentBean) throws Exception {
        return picCommentRelMapper.qryCommentByCondition(qryCommentBean);
    }

    @Override
    public void banComment(QryCommentBean qryCommentBean) throws Exception {
        PicCommentRel result = picCommentRelMapper.selectByPrimaryKey(qryCommentBean.getCommentId());
        result.setCommState("0");
        picCommentRelMapper.updateByPrimaryKey(result);
    }

    @Override
    public Integer QryCommentByConditionCount(QryCommentBean qryCommentBean) throws Exception {
        return picCommentRelMapper.qryCommentByConditionCount(qryCommentBean);
    }

    @Override
    public PicCommentRel insetComment(PicCommentRel picCommentRel) throws Exception {

         picCommentRelMapper.insert(picCommentRel);
        return picCommentRel;
    }
}
