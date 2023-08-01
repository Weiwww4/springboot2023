package com.faintdream.java.features;

import org.junit.Test;

/**
 * 测试文本块
 * @version 1.0
 * @author faintdream
 * */
public class TextBlockTest {
    @Test
    public void test1(){
        String s = """
                   白日依山尽，
                  黄河入海流。
                 欲穷千里目，
                更上一层楼。
                """;

        System.out.println(s);
    }

    @Test
    public void test2(){

        String regularString = "Hello, \n" +
                "Welcome to \n" +
                "Java Text Blocks.";

        String s = """
                Hello,\
                welcome to \
                Java Test Blocks
                """;
        System.out.println(s);
    }
}
