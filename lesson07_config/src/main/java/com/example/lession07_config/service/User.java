package com.example.lession07_config.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {


    @Value("${user.username:default}")
    private String username;

    @Value("${user.age:0}")
    private int age;

    @Value("${user.address:default}")
    private String address;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
