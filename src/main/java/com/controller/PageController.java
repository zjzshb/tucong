package com.controller;

import com.bo.UserInfoDetail;
import com.service.interfaces.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by John on 2019/4/13.
 */
@Controller
public class PageController {
    private static Logger log= LoggerFactory.getLogger(DemoController.class);
    @Autowired
    private AccountService accountService;
    @RequestMapping("")
    public String goIndex () {
        return "index";
    }
    @RequestMapping("goLogin")
    public String goLogin () {
        return "login";
    }
    @RequestMapping("goRegister")
    public String goRegister (){
        return "register2";
    }
    @RequestMapping("gophotoupload")
    public String goUpLoad(){
        return "photoupload";
    }
    @RequestMapping("showphoto")
    public String goShowPhoto(){
        return "showphoto";
    }
    @RequestMapping("manager")
    public String manager(HttpSession session){
        Integer userId = (Integer) session.getAttribute("userId");
        if(userId == null){
            return "redirect:/";
        }
        try {
            UserInfoDetail result = accountService.qryUserInfoDetail(userId);
            if(result.getUserRoot()==1){
                return "manager";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/";
    }
}
