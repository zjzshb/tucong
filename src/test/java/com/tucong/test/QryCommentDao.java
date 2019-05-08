package com.tucong.test;

import com.bo.QryCommentBean;
import com.bo.QryPhotoBean;
import com.dao.PicCommentRelMapper;
import com.dao.PicInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * Created by John on 2019/5/8. QryCommentDao
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration("src/main/resources")
@ContextConfiguration(locations={"classpath:spring-mybatis.xml","classpath:spring-mvc.xml"})
public class QryCommentDao {
    @Autowired
    private PicCommentRelMapper picCommentRelMapper;
    @Test
    public void serviceTest() throws Exception{
        QryCommentBean bean = new QryCommentBean();
//        bean.setUserId(1010);
//        bean.setNikeName("yuzihao");
//        bean.setQryStartDate("2019-5-1");
//        bean.setQryEndDate("2019-5-6");
        bean.setPicGroupId(2);
        List<QryCommentBean> result = picCommentRelMapper.qryCommentByCondition(bean);
        System.out.println(result);

    }

}
