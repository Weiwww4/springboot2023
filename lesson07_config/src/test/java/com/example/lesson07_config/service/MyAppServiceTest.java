package com.example.lesson07_config.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyAppServiceTest {

    @Autowired
    MyAppService myAppService;

    @Test
    public void test01(){
        System.out.println(myAppService.getMemo());
    }

}