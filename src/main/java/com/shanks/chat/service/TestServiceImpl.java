package com.shanks.chat.service;

import com.shanks.chat.mapper.TestMapper;
import com.shanks.chat.model.Test;
import com.shanks.chat.service.impl.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements ITestService {
    @Autowired
    private TestMapper testMapper;
    @Override
    public void test() {
        List<Test> testList=testMapper.test();
        testList.forEach(test-> System.out.println(test.getId()));
    }
}
