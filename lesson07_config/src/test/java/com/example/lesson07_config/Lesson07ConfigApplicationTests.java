package com.example.lesson07_config;

import com.example.lesson07_config.bean3.Security;
import com.example.lesson07_config.service.AppService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Lesson07ConfigApplicationTests {

    @Test
    void contextLoads() {
    }


    @Autowired
    private AppService appService;

    @Test
    public void printValue() {
        appService.printValue();
    }

    @Autowired
    Security security;

    @Test
    public void SecurityTest(){
        System.out.println(security);
    }

}
