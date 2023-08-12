package com.example.lesson07_config;

import com.example.lesson07_config.bean3.Security;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;

// 扫描配置
@ConfigurationPropertiesScan(basePackages = {"com.example.lesson07_config.bean2"})
@SpringBootApplication
public class lesson07ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(lesson07ConfigApplication.class, args);
    }


    //创建Bean对象,属性值来自配置文件
    @ConfigurationProperties(prefix = "security")
    @Bean
    public Security createSecurity(){
        return new Security();
    }
}
