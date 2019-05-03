package com.dao;

import com.bo.Student;

import java.util.List;

/**
 * Created by John on 2019/4/4.
 */
public interface DemoMapper {
    /**
     * 根据id查询用户信息
     *
     * @param id
     * @return
     */
    public Student queryUserById(int id);

    /**
     * 查询所有用户信息
     *
     * @return
     */
    public List<Student> queryUserAll();

    /**
     * 新增用户
     *
     * @param user
     */
    public void insertUser(Student user);

    /**
     * 更新用户信息
     *
     * @param user
     */
    public void updateUser(Student user);

    /**
     * 根据id删除用户信息
     *
     * @param id
     */
    public void deleteUser(String id);

}
