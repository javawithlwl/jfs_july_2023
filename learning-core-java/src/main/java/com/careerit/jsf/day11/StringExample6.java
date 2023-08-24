package com.careerit.jsf.day11;

import java.util.ArrayList;
import java.util.List;

class Employee {
    long id;
    String name;
    double salary;

    public Employee(long id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void showInfo() {
        System.out.println("Id    :" + id);
        System.out.println("Name  :" + name);
        System.out.println("Salary:" + salary);
    }
}

public class StringExample6 {

    public static void main(String[] args) {
        String data = "1234,Manoj,45000-1235,Krish,56000-1236,Ramesh,67000-1237,Suresh,89000-1238,Jayesh,45000-1239,Allen,45000";
        List<Employee> empList = new ArrayList<>();
        String[] arr = data.split("-");
        for (String ele : arr) {
            String[] empArr = ele.split(",");
            long id = Long.parseLong(empArr[0]);
            String name = empArr[1];
            double salary = Double.parseDouble(empArr[2]);
            Employee emp = new Employee(id, name, salary);
            empList.add(emp);
        }
        System.out.println("Total employees :" + empList.size());
        for (Employee emp : empList) {
            emp.showInfo();
            System.out.println("---------------------");
        }
    }
}
