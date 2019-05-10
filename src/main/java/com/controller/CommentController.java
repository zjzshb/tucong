package com.controller;

import com.bo.PicCommentRel;
import com.bo.QryCommentBean;
import com.bo.UserInfoDetail;
import com.service.interfaces.CommentService;
import com.utils.DateUtils;
import com.vo.BaseResponse;
import com.vo.LayuiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

import java.util.List;

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

    @RequestMapping(value = "commentManager" ,method = RequestMethod.POST)
    @ResponseBody
    private LayuiResponse<UserInfoDetail> commentManager(@RequestBody QryCommentBean qryCommentBean){
        LayuiResponse response = new LayuiResponse(0,"成功");

        try {
            this.setCondition(qryCommentBean);
            List<QryCommentBean> result = commentService.QryCommentByCondition(qryCommentBean);
            Integer count = commentService.QryCommentByConditionCount(qryCommentBean);
            response.setData(result);
            response.setCount(count);
        } catch (Exception e) {
            response.setCode(999);
            response.setMsg("失败");
            return response;
        }
        return response;
    }

    @RequestMapping(value = "banComment" ,method = RequestMethod.POST)
    @ResponseBody
    private LayuiResponse banComment(@RequestBody QryCommentBean qryCommentBean){
        LayuiResponse response = new LayuiResponse(0,"删除成功");
        try {
            commentService.banComment(qryCommentBean);
        } catch (Exception e) {
            response.setCode(999);
            response.setMsg("失败");
            return response;
        }
        return response;
    }
    private void setCondition(QryCommentBean qryCommentBean)throws Exception{
        qryCommentBean.setPage(qryCommentBean.getPage()-1);
        qryCommentBean.setStart(qryCommentBean.getPage()*qryCommentBean.getLimit());
    }

}
