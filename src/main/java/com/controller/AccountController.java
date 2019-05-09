package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.bo.Account;
import com.bo.UserInfoDetail;
import com.bo.UserRegisterReq;
import com.miaodiyun.httpApiDemo.IndustrySMS;
import com.service.interfaces.AccountService;
import com.utils.DateUtils;
import com.vo.BaseResponse;
import com.vo.LayuiResponse;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.registry.infomodel.User;

import java.util.List;

import static com.vo.BaseCode.*;

/**
 * Created by John on 2019/4/13.
 */
@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/doLogin",method = RequestMethod.POST)
    private ModelAndView doLogin(HttpServletRequest request){
        ModelAndView  mv = new ModelAndView();
        try {
            Account account = new Account();
            account.setUserName(request.getParameter("userName"));
            account.setUserPwd(request.getParameter("userPwd"));
            int userId = accountService.checkAccount(account);

            if(userId == 0){
                mv.setViewName("login");
                mv.addObject("messege","账号或密码错误");
            }

            UserInfoDetail result = accountService.qryUserInfoDetail(userId);

            HttpSession session = request.getSession();
            session.setAttribute("userId" ,userId );
            session.setAttribute("userNickName" ,result.getuNickname());
            session.setAttribute("root",result.getUserRoot());
            if (result.getUserRoot() == 1){
                mv.setViewName("manager");
            }else {
                mv.setViewName("redirect:/");
            }

        }catch (Exception e){
            mv.setViewName("login");
            mv.addObject("messege","操作失败");
        }
        return mv;
    }



    @RequestMapping(value = "/quitLogin")
    private ModelAndView quitLogin(HttpSession session){
        session.removeAttribute("userId");
        session.removeAttribute("userNickName");
        ModelAndView mv = new ModelAndView("redirect:/");
        return mv;
    }
    @RequestMapping(value = "sendmessege" ,method = RequestMethod.POST)
    @ResponseBody
    private BaseResponse sendCheckInfo(HttpServletRequest request,HttpSession session){
        BaseResponse response = new BaseResponse(true,BUSI_SUCCESS_CODE,BUSI_SUCCESS_MESSAGE);
        try {
            String userPhone = request.getParameter("userPhone");
            //验证手机号
           Account account = accountService.queryAccountByPhone(userPhone);
            if(account.getUserName()!=null){
                response.setSuccess(false);
                response.setResultCode(BUSI_FAILURE_CODE);
                response.setResultMessage("手机号码已存在");
                return response;
            }

            String checkMessge = String.valueOf((int)((Math.random()*9+1)*100000));
            String re = IndustrySMS.execute(userPhone,checkMessge);
            JSONObject jsonObject = JSONObject.parseObject(re);
            String respCode = jsonObject.get("respCode").toString();
            String errMessge = jsonObject.get("respDesc").toString();
            if(!"00000".equals(respCode)){
                response.setSuccess(false);
                response.setResultCode(BUSI_FAILURE_CODE);
                response.setResultMessage(errMessge);
            }
            session.setAttribute("checkMessge",checkMessge);
        }catch (Exception e){
            System.out.println(e);
            response.setSuccess(false);
            response.setResultCode(BUSI_FAILURE_CODE);
            response.setResultMessage(BUSI_FAILURE_MESSAGE);
        }
        return response;
    }

    @RequestMapping(value = "doRegister" ,method = RequestMethod.POST)
    @ResponseBody
    private BaseResponse doRegister(@RequestBody UserRegisterReq user, HttpSession session){
        BaseResponse response = new BaseResponse(true,BUSI_SUCCESS_CODE,BUSI_SUCCESS_MESSAGE);
        try {
            if(!user.getCheckInfo().equals(session.getAttribute("checkMessge"))){
                response.setSuccess(false);
                response.setResultCode(BUSI_FAILURE_CODE);
                response.setResultMessage("验证码错误");
                return response;
            }

            accountService.doRegister(user.getUserPhone(),user.getUserPwd());
            response.setResultMessage("注册成功");

        }catch (Exception e){
            response.setSuccess(false);
            response.setResultCode(BUSI_FAILURE_CODE);
            response.setResultMessage(BUSI_FAILURE_MESSAGE);
        }
        return response;
    }

//    @RequestMapping(value = "/doLogin",consumes="application/x-www-form-urlencoded")
//    private BaseResponse doLogin(Account account , HttpServletRequest request){
//        BaseResponse response = new BaseResponse(true,BUSI_SUCCESS_CODE,BUSI_SUCCESS_MESSAGE);
//        try {

//
//        }catch (Exception e){
//            response.setSuccess(false);
//            response.setResultCode(BUSI_FAILURE_CODE);
//            response.setResultMessage(BUSI_FAILURE_MESSAGE);
//        }
//        return response;
//    }

    @RequestMapping(value = "gerUserInfo" ,method = RequestMethod.POST)
    @ResponseBody
    private BaseResponse<UserInfoDetail> gerUerInfo(HttpSession session){
        BaseResponse response = new BaseResponse(true,BUSI_SUCCESS_CODE,BUSI_SUCCESS_MESSAGE);
        Integer userId = (Integer) session.getAttribute("userId");
        try {
            UserInfoDetail result = accountService.qryUserInfoDetail(userId);
            response.setResult(result);
        } catch (Exception e) {
            response.setSuccess(false);
            response.setResultCode(BUSI_FAILURE_CODE);
            response.setResultMessage("初始化用户信息失败");
        }
        return response;
    }

    @RequestMapping(value = "qryAccountInfo" ,method = RequestMethod.POST)
    @ResponseBody
    private LayuiResponse<UserInfoDetail> qryAccountInfo(@RequestBody UserInfoDetail userInfoDetail){
        LayuiResponse response = new LayuiResponse(0,"成功");

        try {
            this.setCondition(userInfoDetail);
            List<UserInfoDetail>  result = accountService.qryUser(userInfoDetail);
            Integer count = accountService.qryUserCount(userInfoDetail);
            response.setData(result);
            response.setCount(count);
        } catch (Exception e) {
            response.setCode(999);
            response.setMsg("失败");
            return response;
        }
        return response;
    }

    @RequestMapping(value = "banAccount" ,method = RequestMethod.POST)
    @ResponseBody
    private LayuiResponse banAccount(@RequestBody UserInfoDetail userInfoDetail){
        LayuiResponse response = new LayuiResponse(0,"删除成功");
        try {
            accountService.banAccount(userInfoDetail);
        } catch (Exception e) {
            response.setCode(999);
            response.setMsg("失败");
            return response;
        }
        return response;
    }

    @RequestMapping(value = "/UserDtail")
    public ModelAndView UserDtail (){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("userInfo");
        return mv;
    }
    private void setCondition( UserInfoDetail userInfoDetail)throws Exception{
        userInfoDetail.setPage(userInfoDetail.getPage()-1);
        userInfoDetail.setStart(userInfoDetail.getPage()*userInfoDetail.getLimit());
        userInfoDetail.setEnd(userInfoDetail.getPage()*userInfoDetail.getLimit()+userInfoDetail.getLimit());
    }
}
