package com.careerit.jsf.day18;

class CL1{
    CL1(){
        super();
        System.out.println("CL1");
    }
}
class CL2 extends CL1{
    CL2(){
        super();
        System.out.println("CL2");
    }
}
class  CL3 extends CL2{
    CL3(){
        super();
        System.out.println("CL3");
    }
}
class CL4 extends  CL2{
    CL4(){
        super();
        System.out.println("CL4");
    }
}
public class InterviewQuestion {
    public static void main(String[] args) {
        CL1 obj = new CL4();
    }
}
