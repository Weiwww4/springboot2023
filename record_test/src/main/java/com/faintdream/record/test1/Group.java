package com.faintdream.record.test1;

public record Group(String name,Integer StudentNum,Member member) {
    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", StudentNum=" + StudentNum +
                ", member=" + member +
                '}';
    }
}
