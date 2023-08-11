package com.example.lesson07_config.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.StringJoiner;

@Service
public class AppService {

    public void printValue(){
        StringJoiner joiner = new StringJoiner(";");
        joiner.add("name:"+name).add("owner:"+owner).add("post:"+post);
        System.out.println(joiner.toString());
    }

    // 使用@Value("${key:默认值}")
    @Value("${app.name:app}")
    private String name;

    @Value("${app.owner:admin}")
    private String owner;

    @Value("${app.post:8080}")
    private Integer post;
}
