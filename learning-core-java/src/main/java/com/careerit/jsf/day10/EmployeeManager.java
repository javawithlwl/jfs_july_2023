package com.careerit.jsf.day10;
class Employee{
    long empno;
    String name;
    double salary;
    public Employee(long empno,String name,double salary){
        this.empno = empno;
        this.name = name;
        this.salary = salary;
    }
    public void showInfo(){
        System.out.println("Empno :"+empno);
        System.out.println("Name  :"+name);
        System.out.println("Salary:"+salary);
    }
    public void incrementSalary(double percentage){
        // TODO: Increment the salary by percentage
    }
}
public class EmployeeManager {

    public static void main(String[] args) {

        // Create 10 employee objects and store in arraylist and perform the following operations

        // 1. Display the all employee details by calling showInfo method
        // 2. Display the employee details whose salary is greater than 50000
        // 3. Find the sum of all employee salaries
        // 4. Increment the salary of all employees by 10%
        // 5. Display the details of all employees
    }
}
