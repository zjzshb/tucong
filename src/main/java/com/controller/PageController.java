package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by John on 2019/4/13.
 */
@Controller
public class PageController {
    private static Logger log= LoggerFactory.getLogger(DemoController.class);

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
        return "register";
    }
    @RequestMapping("gophotoupload")
    public String goUpLoad(){
        return "photoupload";
    }
    @RequestMapping("showphoto")
    public String goShowPhoto(){
        return "showphoto";
    }
}
