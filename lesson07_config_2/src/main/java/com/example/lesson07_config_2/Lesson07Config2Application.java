package com.example.lesson07_config_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan(basePackages = "com.example.lesson07_config_2.bean")
public class Lesson07Config2Application {

    public static void main(String[] args) {
        SpringApplication.run(Lesson07Config2Application.class, args);
    }

}
