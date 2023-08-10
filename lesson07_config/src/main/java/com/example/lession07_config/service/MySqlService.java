package com.example.lession07_config.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@Service

public class MySqlService {

    @Value("${spring.datasource.url:default}")
    private String url;

    @Value("${spring.datasource.username:default}")
    private String username;

    @Value("${spring.datasource.password:default}")
    private String password;

    @Override
    public String toString() {
        return "MySqlService{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
