package com.tucong.test;

import com.bo.PicLabelInfo;
import com.bo.QryPhotoBean;
import com.dao.PicInfoMapper;
import com.service.interfaces.LabelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by John on 2019/5/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration("src/main/resources")
@ContextConfiguration(locations={"classpath:spring-mybatis.xml","classpath:spring-mvc.xml"})
public class QryPhotoDaoTest {
    @Autowired
    private  PicInfoMapper picInfoMapper ;
    @Test
    public void serviceTest() throws Exception{
        QryPhotoBean qryPhotoBean = new QryPhotoBean();
//        qryPhotoBean.setStart(0);
//        qryPhotoBean.setEnd(10);
        List<QryPhotoBean> rsp =  picInfoMapper.qryPhotoByCondition(qryPhotoBean);
        System.out.println(rsp);

    }

}