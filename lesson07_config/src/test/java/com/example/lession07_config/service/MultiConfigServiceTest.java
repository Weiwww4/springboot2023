package com.example.lession07_config.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MultiConfigServiceTest {
    @Autowired
    private MultiConfigService multiConfigService;

    @Test
    public void test01(){
        System.out.println(multiConfigService);
    }

}