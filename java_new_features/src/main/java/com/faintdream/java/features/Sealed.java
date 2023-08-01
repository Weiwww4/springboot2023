package com.faintdream.java.features;

public sealed  class Sealed permits SealedChild1,SealedChild2,SealedChild3{
    public void print(){
        System.out.println("sealed 定义封闭类");
    }
}
