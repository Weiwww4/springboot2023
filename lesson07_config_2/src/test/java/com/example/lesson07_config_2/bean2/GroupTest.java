package com.example.lesson07_config_2.bean2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class GroupTest {

    @Autowired
    Group group;

    @Test
    public void test01(){
        System.out.println(group);
    }
}