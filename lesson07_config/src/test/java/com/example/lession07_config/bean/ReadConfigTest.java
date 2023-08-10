package com.example.lession07_config.bean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ReadConfigTest {
    @Autowired
    ReadConfig readConfig;

    @Test
    void printTest() {
        readConfig.print();
    }
}