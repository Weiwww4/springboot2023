package com.faintdream.java.features;

import org.junit.Test;

public class SealedTest {
    @Test
    public void test1(){
        Sealed s = new Sealed();
        Sealed s1 = new SealedChild1();
        Sealed s2 = new SealedChild2();
        Sealed s3 = new SealedChild3();
        s.print();
        s1.print();
        s2.print();
        s3.print();

    }
}
