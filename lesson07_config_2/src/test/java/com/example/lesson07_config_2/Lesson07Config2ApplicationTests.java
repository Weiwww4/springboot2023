package com.example.lesson07_config_2;

import com.example.lesson07_config_2.bean.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class Lesson07Config2ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private AppConfig appConfig;
    @Test
    public void test01(){
        System.out.println(Arrays.toString(appConfig.getNames()));
        System.out.println(appConfig.getServers());
        System.out.println(appConfig.getUsers());
    }

}
