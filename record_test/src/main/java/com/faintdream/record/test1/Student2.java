package com.faintdream.record.test1;

import java.util.StringJoiner;

// Test implements Interface
public record Student2(Integer id, String name, Integer age) implements PrintInterface{
    @Override
    public void print() {
        StringJoiner joiner = new StringJoiner("-");
        String s = joiner.add(id.toString()).add(name).add(age.toString()).toString();
        System.out.println("学生信息: " + s);
    }
}
