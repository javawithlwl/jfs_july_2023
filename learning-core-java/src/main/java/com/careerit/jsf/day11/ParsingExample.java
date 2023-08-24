package com.careerit.jsf.day11;

class EmployeeInfo{
    private long empno;
    private String name;
    private int age;
    private double height;
    private double weight;
    private String designation;
    private double salary;
    public EmployeeInfo(long empno, String name, int age, double height, double weight, String designation,
            double salary) {
        this.empno = empno;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.designation = designation;
        this.salary = salary;
    }
    public void showInfo(){
        System.out.println("Empno      :"+empno);
        System.out.println("Name       :"+name);
        System.out.println("Age        :"+age);
        System.out.println("Height     :"+height);
        System.out.println("Weight     :"+weight);
        System.out.println("Designation:"+designation);
        System.out.println("Salary     :"+salary);
    }
}
public class ParsingExample {

    public static void main(String[] args) {

        String data = "1001,Manoj,33,5.9,75.68,Developer,2300000";
        String[] arr = data.split(",");
        long empno = Long.parseLong(arr[0]);
        String name = arr[1];
        int age = Integer.parseInt(arr[2]);
        double height = Double.parseDouble(arr[3]);
        double weight = Double.parseDouble(arr[4]);
        String designation = arr[5];
        double salary = Double.parseDouble(arr[6]);
        EmployeeInfo emp = new EmployeeInfo(empno, name, age, height, weight, designation, salary);
        emp.showInfo();

    }
}
