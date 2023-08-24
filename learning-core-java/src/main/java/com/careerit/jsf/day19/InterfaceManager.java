package com.careerit.jsf.day19;

interface I1 {
    String name = "Interface";

    void m1();

    void m2();

    void m3();
}

interface I2 {
    void m2();

    void m4();
}

class C2 implements I1, I2 {

    @Override
    public void m1() {
        System.out.println("C2 of m1");
    }

    @Override
    public void m2() {
        System.out.println("C2 of m2");
    }

    @Override
    public void m3() {
        System.out.println("C2 of m3");
    }

    @Override
    public void m4() {
        System.out.println("C2 of m4");
    }
}

public class InterfaceManager {
    public static void main(String[] args) {
        I1 obj = new C2();
        obj.m1();
    }
}
