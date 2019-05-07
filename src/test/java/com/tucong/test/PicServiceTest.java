package com.tucong.test;

import com.bo.PicInfo;
import com.service.interfaces.PhotoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by John on 2019/5/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration("src/main/resources")
@ContextConfiguration(locations={"classpath:spring-mybatis.xml","classpath:spring-mvc.xml"})
public class PicServiceTest {
    @Autowired
    private PhotoService photoService;
    @Test
    public void serviceTest() throws Exception{
        PicInfo picInfo = new PicInfo();
        picInfo.setPicAddress("11");
        picInfo.setPicSize("11");
        picInfo.setPicUpDate("22");
        picInfo.setPicState("0");

        photoService.saveTempPic(picInfo);
    }



}
