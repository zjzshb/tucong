package com.tucong.test;

import com.bo.QryPhotoDetailBean;
import com.service.interfaces.PhotoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by John on 2019/5/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration("src/main/resources")
@ContextConfiguration(locations={"classpath:spring-mybatis.xml","classpath:spring-mvc.xml"})
public class QryPhotoDetailByConditionTest {
    @Autowired
    private PhotoService photoService;
    @Test
    public void serviceTest() throws Exception{
        QryPhotoDetailBean bean = new QryPhotoDetailBean();
        bean.setGroupId(1);
        QryPhotoDetailBean result = photoService.qryPhotoDetailByCondition(bean);
        System.out.println(result);
    }
}
