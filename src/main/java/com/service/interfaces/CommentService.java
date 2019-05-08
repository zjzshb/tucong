package com.service.interfaces;

import com.bo.PicCommentRel;
import com.bo.QryCommentBean;

import java.util.List;

/**
 * Created by John on 2019/5/8.
 */
public interface CommentService {
    public List<QryCommentBean> QryCommentByCondition(QryCommentBean qryCommentBean)throws Exception;

    public PicCommentRel insetComment(PicCommentRel picCommentRel) throws  Exception;
}
