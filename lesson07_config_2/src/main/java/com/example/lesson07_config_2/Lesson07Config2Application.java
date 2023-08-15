package com.example.lesson07_config_2;

import com.example.lesson07_config_2.bean3.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

// 在配置类加入注解@ImpoerResource
@ImportResource(locations = {"classpath:/applicationContext.xml"})
@SpringBootApplication
@ConfigurationPropertiesScan(basePackages = "com.example.lesson07_config_2.bean")
public class Lesson07Config2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Lesson07Config2Application.class, args);

        Person bean = run.getBean(Person.class);
        System.out.println(bean);
    }

}
