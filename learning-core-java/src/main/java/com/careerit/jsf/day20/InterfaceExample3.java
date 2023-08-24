package com.careerit.jsf.day20;

interface IC1{
    void m1();
}
interface IC2{
    void m1();
    void m2();
}
interface IC3 extends  IC1,IC2{
    void m3();

}
class CL1 implements IC3{

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }
}
public class InterfaceExample3 {
}
