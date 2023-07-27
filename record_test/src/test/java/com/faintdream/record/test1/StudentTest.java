package com.faintdream.record.test1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void test01(){
        Student amber = new Student(1,"Amber","ambersuki@126.com",17);

        System.out.println(amber.id());
        System.out.println(amber.name());
        System.out.println(amber.email());
        System.out.println(amber.age());
        System.out.println(amber);
    }

}