package com.faintdream.java.features;
public final class SealedChild3 extends Sealed {
    @Override
    public void print(){
        System.out.println("使用 permits 指定 sealed 密闭类的子类");
    }
}
