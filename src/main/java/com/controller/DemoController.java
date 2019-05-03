package com.controller;


import com.bo.ItemsCustom;
import com.bo.Student;
import com.service.impl.DemoServiceImpl;
import com.service.interfaces.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by John on 2019/1/8.
 */
@Controller
public class DemoController {
    private static Logger log= LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private DemoService demoService;


    @RequestMapping("/test")
    public String test2 () {
        return "jspdemo";
    }
    @RequestMapping("/head")
    public String head () {
        return "header";
    }

    @RequestMapping("/queryItems")
    public ModelAndView queryItems() throws Exception {
        //调用servie来查询商品列表
        List<ItemsCustom> itemsList=new ArrayList<ItemsCustom>();
        ItemsCustom itemsCustom = new ItemsCustom();
        itemsCustom.setName("1");
        itemsCustom.setDate("2");
        itemsCustom.setPrice("3");
        itemsCustom.setDetail("4");
        itemsList.add(itemsCustom);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("itemsList",itemsList);
        //指定逻辑视图名itemsList
        modelAndView.setViewName("webdemo");

        return modelAndView;
    }
}
