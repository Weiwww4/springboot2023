package com.faintdream.java.features;

public sealed class Shape permits Circle {
    private Integer width;
    private Integer Height;
    public void draw(){
        System.out.println("=======Circle 图形=======");
    }
}
