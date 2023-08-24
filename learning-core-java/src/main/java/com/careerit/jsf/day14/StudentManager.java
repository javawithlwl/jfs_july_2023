package com.careerit.jsf.day14;

public class StudentManager {

    public static void main(String[] args) {
        Student s1 = new Student(1001, "Krish", 5);
        Student s2 = new Student(1002, "Manoj", 5);
        Student s3 = new Student(1003, "Charan", 5);
        Student s4 = new Student(1004, "Tanvi", 5);
        Student s5 = new Student(1005, "Manoj", 9);
        Student s6 = new Student(1006, "Rama Krishna", 9);
        Student s7 = new Student(1007, "Sai", 9);
        Student s8 = new Student(1008, "Sai Krishna", 9);
        Student s9 = new Student(1009, "Rajesh", 8);
        Student s10 = new Student(1010, "Aadhya", 2);

        // Adding all the students to array
        Student[] arr = {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};

        // Promote student if std is 9th
        for(Student s:arr){
            if(s.getStd()==9){
                s.promote();
            }
        }
        // Display all the students
        for(Student s:arr){
            s.showInfo();
            System.out.println("---------------------------");
        }


    }
}
