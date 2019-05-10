package com.dao;

import com.bo.Account;
import com.bo.AccountExample;
import java.util.List;

import com.bo.UserInfoDetail;
import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
    long countByExample(AccountExample example);

    int deleteByExample(AccountExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(Account record);

    int insertSelective(Account record);

    List<Account> selectByExample(AccountExample example);

    Account selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);

    int checkAccountByUserName(Account account);

    int checkAccountByPhone (Account account);

    List<UserInfoDetail> qryUserInfoDetail(UserInfoDetail userInfoDetail);

    int qryUserInfoDetailCount(UserInfoDetail userInfoDetail);

}