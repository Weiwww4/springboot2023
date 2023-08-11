package com.example.lesson07_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

// 扫描配置
@ConfigurationPropertiesScan(basePackages = {"com.example.lesson07_config.bean2"})
@SpringBootApplication
public class lesson07ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(lesson07ConfigApplication.class, args);
    }

}
