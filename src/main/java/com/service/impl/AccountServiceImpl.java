package com.service.impl;

import com.bo.Account;
import com.bo.AccountExample;
import com.bo.UserInfo;
import com.dao.AccountMapper;
import com.dao.UserInfoMapper;
import com.service.interfaces.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by John on 2019/4/13.
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public int checkAccount(Account account) {
        int userId = 0;
        if(accountMapper.checkAccountByUserName(account) == 1){
            AccountExample accountExample = new AccountExample();
            AccountExample.Criteria criteria = accountExample.createCriteria();
            criteria.andUserNameEqualTo(account.getUserName());
            Account accountRe = accountMapper.selectByExample(accountExample).get(0);
            userId = accountRe.getUserId();

        }else if (accountMapper.checkAccountByPhone(account) == 1){
            AccountExample accountExample = new AccountExample();
            AccountExample.Criteria criteria = accountExample.createCriteria();
            criteria.andUserPhoneEqualTo(account.getUserPhone());
            Account accountRe = accountMapper.selectByExample(accountExample).get(0);
            userId = accountRe.getUserId();
        }
        return userId;
    }

    @Override
    public void doRegister(String userName, String userPwd) {
        byte root = 1;
        Account account = new Account();
        account.setUserName(userName);
        account.setUserPwd(userPwd);
        account.setUserName(userName);
        account.setUserRoot(root);
        accountMapper.insert(account);
        //查询刚插入的主键
        int userId =  this.queryAccountByPhone(userName).getUserId();
        //插入userInfo
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(userId);
        userInfoMapper.insert(userInfo);
    }

    @Override
    public UserInfo queryUserInfoById(int id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public Account queryAccountByPhone(String userName) {
        AccountExample accountExample = new AccountExample();
        AccountExample.Criteria criteria = accountExample.createCriteria();
        criteria.andUserNameEqualTo(userName);
        Account accountRe = new Account();
        List<Account> re = accountMapper.selectByExample(accountExample);
        if(re.size()!=0&&re!=null) {
             accountRe = re.get(0);
        }
        return accountRe;
    }


}

