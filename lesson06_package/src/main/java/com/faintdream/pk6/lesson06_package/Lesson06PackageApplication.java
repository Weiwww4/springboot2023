package com.faintdream.pk6.lesson06_package;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Date;

/**
 * 核心注解功能
 *
 * @SpringBootConfiguration 包含以下注解的功能
 * @Configuration javaConfig配置类，将对象注入到Spring IOC容器
 * @EnableAutoConfiguration 开启自动配置，将Spring和第三方容器创建好，注入到Spring容器
 * @ComponentScan Spring 组件扫描器(spring boot约定启动类作为扫描包的起点)
 */
@SpringBootApplication
public class Lesson06PackageApplication {

    @Bean
    public Date myDate() {
        return new Date();
    }

    public static void main(String[] args) {


        // run的第一参数是配置类，从这里加载配置
        // run方法的返回值是容器对象
        ConfigurableApplicationContext context = SpringApplication.run(Lesson06PackageApplication.class, args);

        // 可以从容器对象获取对象
        Date bean = context.getBean(Date.class);
        System.out.println(bean);
    }

}
