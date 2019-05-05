package com.tucong.test;

import com.bo.Account;
import com.service.interfaces.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by John on 2019/4/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration("src/main/resources")
@ContextConfiguration(locations={"classpath:spring-mybatis.xml","classpath:spring-mvc.xml"})
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;

    @Test
    public void serviceTest(){

    }
    @Test
    public void nickNameTest(){

    }
}
