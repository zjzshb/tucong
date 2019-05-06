package com.tucong.test;

import com.bo.PicLabelInfo;
import com.service.interfaces.AccountService;
import com.service.interfaces.LabelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * Created by John on 2019/5/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration("src/main/resources")
@ContextConfiguration(locations={"classpath:spring-mybatis.xml","classpath:spring-mvc.xml"})
public class LabelTest {
    @Autowired
    LabelService labelService;
    @Test
    public void serviceTest() throws Exception{
        List<PicLabelInfo> rsp = labelService.getLabelInfo();
        System.out.println("1");
    }
}
