package com.example.lesson07_config.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AppServiceTest {

    @Autowired
    private AppService appService;

    @Test
    public void printValue() {
        appService.printValue();
    }
}