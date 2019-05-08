package com.tucong.test;

import com.bo.PicLabelInfo;
import com.bo.QryPhotoBean;
import com.bo.QryPhotoDetailBean;
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
//        qryPhotoBean.setEnd(1);
//        qryPhotoBean.setPicLabelName("风景");
//        qryPhotoBean.setPicTitle("海边风景");
//        qryPhotoBean.setUserId(1011);
        qryPhotoBean.setPicGroupState("1");

        qryPhotoBean.setQryStartDate("2019-05-05");
        qryPhotoBean.setQryEndDate("2019-05-09");
        List<QryPhotoBean> rsp =  picInfoMapper.qryPhotoByCondition(qryPhotoBean);
        System.out.println(rsp);

    }
    @Test
    public void QryPhotoDetail() throws Exception{
        QryPhotoDetailBean bean = new QryPhotoDetailBean();
        bean.setGroupId(1);
        QryPhotoDetailBean result= picInfoMapper.qryPhotoDetailByCondition(bean);
        System.out.println(result);

    }

}