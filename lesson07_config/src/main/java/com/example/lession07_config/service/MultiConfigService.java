package com.example.lession07_config.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MultiConfigService {

    @Value("${spring.redis.post}")
    private String post;

    @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.password}")
    private String password;

    @Override
    public String toString() {
        return "MultiConfigService{" +
                "post='" + post + '\'' +
                ", host='" + host + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
