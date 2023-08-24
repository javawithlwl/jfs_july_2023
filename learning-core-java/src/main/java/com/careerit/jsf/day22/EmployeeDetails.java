package com.careerit.jsf.day22;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
class EmployeeDto{
    private String name;
    private String email;
    private String workLocation;
    private String passportNumber;
    private String passportCountry;
    private double salary;
}

@Getter
@Setter
class Employee{
    private String name;
    private String email;
    private double salary;
}
@Getter
@Setter
class Department{
    private String name;
    private String location;

}
@Getter
@Setter
class Passport{
    private String number;
    private String issuedDate;
    private String expiryDate;
    private String issuedCountry;
}


public class EmployeeDetails {

    public static void main(String[] args) {

            Employee emp = new Employee();
            emp.setName("Krish");
            emp.setEmail("krish.t@gmail.com");
            emp.setSalary(50000);

            Department dept = new Department();
            dept.setName("IT");
            dept.setLocation("Hyderabad");

            Passport passport = new Passport();
            passport.setNumber("123456789");
            passport.setIssuedCountry("India");
            passport.setIssuedDate("12-12-2012");
            passport.setExpiryDate("12-12-2022");


            EmployeeDto employeeDto = EmployeeDto.builder()
                    .name(emp.getName())
                    .email(emp.getEmail())
                    .salary(emp.getSalary())
                    .passportCountry(passport.getIssuedCountry())
                    .passportNumber(passport.getNumber())
                    .workLocation(dept.getLocation())
                    .build();

    }
}


