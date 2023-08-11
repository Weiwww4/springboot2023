package com.example.lesson07_config.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

// @Component
@Configuration(proxyBeanMethods=false) // 声明配置类(关闭代理模式)
@ConfigurationProperties(prefix = "app")

// 通过set方法注入
public class AppBean {
    private String name;
    private String owner;

    private Integer post;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getPost() {
        return post;
    }

    public void setPost(Integer post) {
        this.post = post;
    }

    public void print() {
        System.out.println("AppBean{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", post=" + post +
                '}');
    }
}
