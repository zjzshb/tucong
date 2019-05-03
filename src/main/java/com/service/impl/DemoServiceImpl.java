package com.service.impl;

import com.bo.Student;
import com.dao.DemoMapper;

import com.service.interfaces.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created by John on 2019/4/3.
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoMapper demoMapper;
    @Override
    public Student DemoQry(Student student) {
       Student stuResult = demoMapper.queryUserById(student.getId());

        return stuResult;
    }
}
