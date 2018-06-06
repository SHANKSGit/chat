package com.shanks.chat.controller;

import com.shanks.chat.service.impl.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    ITestService testService;

    @GetMapping("/test")
    public void test(){
        testService.test();
    }
}
