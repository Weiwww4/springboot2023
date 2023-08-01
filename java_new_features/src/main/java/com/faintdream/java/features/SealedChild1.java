package com.faintdream.java.features;

public final class SealedChild1 extends Sealed {
    @Override
    public void print(){
        System.out.println("sealed 密闭类的子类必须使用final修饰");
    }
}
