package com.faintdream.pk6.lesson06_package.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author faintdream
 * */
@RestController
public class HelloController {

    @Autowired
    Date date;
    @GetMapping("/hello")
    public String hello(){
        return "欢迎使用SpringBoot3" + "<br/>" + date;
    }
}
