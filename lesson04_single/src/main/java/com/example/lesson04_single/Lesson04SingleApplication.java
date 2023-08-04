package com.example.lesson04_single;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 启动类: 有@SpringBoot注解的类是启动类(也叫做入口类)
// 启动类一般位于根包的下面（推荐）
// Spring会在启动类所在的目录，以及它的子包扫描组件，这样就不需要配置bean了
@SpringBootApplication
public class Lesson04SingleApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lesson04SingleApplication.class, args);
    }

}
