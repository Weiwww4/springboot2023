package com.faintdream.java.features;

public final class SealedChild2 extends Sealed {
    @Override
    public void print(){
        System.out.println("sealed 密闭类的子类不能再有子类");
    }
}
