package com.example.lesson06_package_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author faintdream
 * */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "欢迎使用SpringBoot3";
    }
}
