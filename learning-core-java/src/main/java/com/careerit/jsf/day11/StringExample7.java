package com.careerit.jsf.day11;

public class StringExample7 {

    public static void main(String[] args) {
        String empno = "MT001";
        String name = "Krish";
        double salary = 100000;
        String dept = "HR";

//        String data = empno.concat(",")
//                .concat(name)
//                .concat(",")
//                .concat(String.valueOf(salary))
//                .concat(",")
//                .concat(dept);
        StringBuilder sb = new StringBuilder(empno);
        sb.append(",").append(name).append(",").append(salary).append(",").append(dept);

        System.out.println(sb.toString());
    }
}
