package com.example.lesson07_config.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

@Repository
public class ReadConfig {

    @Autowired
    Environment environment;

    public void print(){
        // 获取某个key的值
        String name = environment.getProperty("app.name");
        System.out.println(name);

        // 判断某个key是否存在
        if(environment.containsProperty("app.owner")){
            System.out.println("app.owner 存在");
        }

        if(environment.containsProperty("user.name")){
            System.out.println("user.name 存在");
        }

        // 读取key的值，转换为期望的类型，同时提供默认值
        Integer port = environment.getProperty("app.port",Integer.class,9001);
        String str = String.format("读取的key值：name=%s,port=%s",name,port);
        System.out.println(str);
    }
}
