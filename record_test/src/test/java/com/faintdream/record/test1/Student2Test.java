package com.faintdream.record.test1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Student2Test {
    @Test
    public void test1(){
        Student2 Yaoyao = new Student2(1,"Yaoyao",12);
        Student2 Qiqi = new Student2(2,"Qiqi",500);
        Yaoyao.print();
        Qiqi.print();
    }

    // 测试局部变量
    @Test
    public void test2(){
        // 定义Local record
        record SaleRecord(String saleId,String productName,Double money){};
        SaleRecord saleRecord = new SaleRecord("S0001","固态硬盘",499D);
        System.out.println(saleRecord);
    }
}