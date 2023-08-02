package com.careerit.jsf.day15;

class Employee {
    private int empno;
    private String name;
    private String email;
    private String mobile;
    private String city;


    public Employee(int empno, String name, String email){
       this(empno,name,email,"N/A");

    }
    public Employee(int empno, String name, String email, String mobile) {
        this(empno,name,email,mobile,"N/A");

    }

    public Employee(int empno, String name, String email, String mobile, String city) {
        this.empno = empno;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.city = city;
    }

    public void showDetails() {
        System.out.println("Empno  :" + empno);
        System.out.println("Name   :" + name);
        System.out.println("Email  :" + email);
        System.out.println("Mobile :" + mobile);
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1001, "Krish", "krish.t@gmail.com", "9876543210", "Hyderabad");
        Employee emp2 = new Employee(1002, "Manoj", "manoj@gmail.com", "9876543211", "Hyderabad");
        Employee emp3 = new Employee(1003, "Charan", "charan.c@gmail.com", "9876543213", "Hyderabad");
        emp1.showDetails();
        emp2.showDetails();
        emp3.showDetails();
    }

}
