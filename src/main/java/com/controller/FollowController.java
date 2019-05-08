package com.controller;

import com.bo.UserFollowRel;
import com.bo.UserInfoDetail;
import com.service.interfaces.AccountService;
import com.service.interfaces.FollowService;
import com.vo.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

import static com.vo.BaseCode.BUSI_FAILURE_CODE;
import static com.vo.BaseCode.BUSI_SUCCESS_CODE;
import static com.vo.BaseCode.BUSI_SUCCESS_MESSAGE;

/**
 * Created by John on 2019/5/9.
 */
@Controller
public class FollowController {
    @Autowired
    private FollowService followService;
    @Autowired
    private AccountService accountService;
    @ResponseBody
    @RequestMapping(value = "insertFollowRel" ,method = RequestMethod.POST)
    public BaseResponse<UserFollowRel> insertFollowRel(@RequestBody UserFollowRel userFollowRel){
        BaseResponse response = new BaseResponse(true,BUSI_SUCCESS_CODE,BUSI_SUCCESS_MESSAGE);

        if(userFollowRel.getUserId().equals(userFollowRel.getUserFollowId())){
            response.setSuccess(false);
            response.setResultCode(BUSI_FAILURE_CODE);
            response.setResultMessage("您不能关注您自己");
            return response;
        }
        try {
            followService.insertFollowRel(userFollowRel);
        }catch (Exception e){
            response.setSuccess(false);
            response.setResultCode(BUSI_FAILURE_CODE);
            response.setResultMessage("关注失败");
        }
        return response;
    }

    //查询某人的信息
    @ResponseBody
    @RequestMapping(value = "qryUserInfo" ,method = RequestMethod.POST)
    public BaseResponse<UserInfoDetail> qryUserInfo(@RequestBody UserInfoDetail userInfoDetail){
        BaseResponse response = new BaseResponse(true,BUSI_SUCCESS_CODE,BUSI_SUCCESS_MESSAGE);
        try {
            UserInfoDetail Detailresult= accountService.qryUserInfoDetail(userInfoDetail.getUserId());
            response.setResult(Detailresult);
        } catch (Exception e) {
            response.setSuccess(false);
            response.setResultCode(BUSI_FAILURE_CODE);
            response.setResultMessage("查询失败");
        }
        return response;
    }
    //查找粉丝
    @ResponseBody
    @RequestMapping(value = "qryFans" ,method = RequestMethod.POST)
    public BaseResponse<List<UserInfoDetail>> qryFans(@RequestBody UserFollowRel userFollowRel){
        BaseResponse response = new BaseResponse(true,BUSI_SUCCESS_CODE,BUSI_SUCCESS_MESSAGE);
        List<UserInfoDetail> result = new ArrayList<UserInfoDetail>();
        try {
            List<Integer> fansList = followService.qryFans(userFollowRel);
            if(fansList!=null&&fansList.size()!=0){
                for(Integer userId :fansList){
                    UserInfoDetail re =  accountService.qryUserInfoDetail(userId);
                    result.add(re);
                }
            }
            response.setResult(result);
        } catch (Exception e) {
            response.setSuccess(false);
            response.setResultCode(BUSI_FAILURE_CODE);
            response.setResultMessage("查找fans失败");
        }
        return response;
    }
    //查出他关注的人
    @ResponseBody
    @RequestMapping(value = "qryFollows" ,method = RequestMethod.POST)
    public BaseResponse<List<UserInfoDetail>> qryFollows(@RequestBody UserFollowRel userFollowRel){
        BaseResponse response = new BaseResponse(true,BUSI_SUCCESS_CODE,BUSI_SUCCESS_MESSAGE);
        List<UserInfoDetail> result = new ArrayList<UserInfoDetail>();
        try {
            List<Integer> followsList = followService.qryFollows(userFollowRel);
            if(followsList!=null&&followsList.size()!=0){
                for(Integer userId :followsList){
                    UserInfoDetail re =  accountService.qryUserInfoDetail(userId);
                    result.add(re);
                }
            }
            response.setResult(result);
        } catch (Exception e) {
            response.setSuccess(false);
            response.setResultCode(BUSI_FAILURE_CODE);
            response.setResultMessage("查找他关注的人失败");
        }
        return response;
    }

}
