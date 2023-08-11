package com.example.lesson07_config.bean2;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@ConfigurationProperties(prefix = "myapp3")
public class MyApp3 {
    private String name;
    private String owner;
    private Integer post;
    private User user;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "MyApp3{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", post=" + post +
                ", user=" + user +
                '}';
    }
}
