package com.faintdream.record.test1;

import org.junit.Test;

import static org.junit.Assert.*;

public class GroupTest {

    // 测试嵌套使用
    @Test
    public void test1(){
        Student noelle = new Student(1,"诺艾尔",null,16);
        Student eula = new Student(2,"优菈",null,17);
        Student jean = new Student(3,"琴",null,17);

        Member member = new Member(new Student[]{noelle,eula,jean});

        Group group = new Group("蒙德",3,member);

        System.out.println(group);
    }
}