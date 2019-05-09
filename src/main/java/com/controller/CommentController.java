package com.controller;

import com.bo.PicCommentRel;
import com.service.interfaces.CommentService;
import com.utils.DateUtils;
import com.vo.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

import static com.vo.BaseCode.BUSI_FAILURE_CODE;
import static com.vo.BaseCode.BUSI_SUCCESS_CODE;
import static com.vo.BaseCode.BUSI_SUCCESS_MESSAGE;

/**
 * Created by John on 2019/5/8.
 */
@Controller
public class CommentController {
    @Autowired
    CommentService commentService;
    @ResponseBody
    @RequestMapping(value = "/insertComment",method = RequestMethod.POST)
    public BaseResponse<PicCommentRel> insertComment(@RequestBody PicCommentRel picCommentRel,HttpSession session){
        BaseResponse response = new BaseResponse(true,BUSI_SUCCESS_CODE,BUSI_SUCCESS_MESSAGE);
        System.out.println(session.getAttribute("userId"));
        String userId = String.valueOf(session.getAttribute("userId"));
        if(userId =="null"){
            response.setSuccess(false);
            response.setResultCode(BUSI_FAILURE_CODE);
            response.setResultMessage("请登录");
            return response;
        }

        picCommentRel.setUserId(Integer.valueOf(userId));
        picCommentRel.setCommState("1");
        picCommentRel.setCommDate(DateUtils.getNowDate());
        try {
            PicCommentRel result = commentService.insetComment(picCommentRel);
            response.setResult(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return response;

    }
}
