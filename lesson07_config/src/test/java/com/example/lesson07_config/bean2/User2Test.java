package com.example.lesson07_config.bean2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class User2Test {
    @Autowired
    User2 user2;
    @Test
    public void test01(){
        System.out.println(user2);
    }

}