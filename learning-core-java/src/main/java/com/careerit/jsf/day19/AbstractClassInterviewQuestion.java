package com.careerit.jsf.day19;

abstract class AC1 {
    public void m1() {
        System.out.println("AC1 of m1");
    }
}
abstract class AC2{
    abstract void m1();
    abstract void m2();
    abstract void m3();
}
abstract class AC3 extends AC2{
    @Override
    public void m1(){
        System.out.println("AC3 of m1");
    }
}
class AC4 extends  AC3{
    @Override
    void m2() {

    }

    @Override
    void m3() {

    }
}
// C1 => C2 (IS-A, HAS-A)
public class AbstractClassInterviewQuestion {
}
