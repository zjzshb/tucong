package com.tucong.test;

import com.bo.Account;
import com.bo.Student;
import com.dao.AccountMapper;
import com.dao.DemoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration("src/main/resources")
@ContextConfiguration(locations={"classpath:spring-mybatis.xml","classpath:spring-mvc.xml"})
public class DaoTest {
    protected Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    private DemoMapper demoMapper;
    @Autowired
    private AccountMapper accountMapper;
    @Test
    public  void demoDaoTest(){
        Account account = new Account();
        account.setUserPhone("18390317270");
        account.setUserPwd("123456");
        int re =accountMapper.checkAccountByPhone(account);
        System.out.println(re);
    }
    @Test
    public  void nickNametest(){
        Account account = new Account();
        account.setUserName("123");

         int userId =  accountMapper.insert(account);
        System.out.println(userId);

    }

}
