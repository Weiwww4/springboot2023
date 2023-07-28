package com.faintdream.java.features;

import java.util.Arrays;

// var 是java 的一个保留字
public class VarTest {
    public static void main(String[] args) {
        var s1 = "Annie";
        var age = 12;
        for(var i=0;i<10;i++){
            System.out.println("i=" +i);
        }

        var strings = Arrays.asList("a","b","c");
        System.out.println(strings);
        System.out.println(s1);
        System.out.println(age);
    }
}
