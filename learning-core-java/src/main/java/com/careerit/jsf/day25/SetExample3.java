package com.careerit.jsf.day25;

import lombok.AllArgsConstructor;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@AllArgsConstructor
class Student{
    private String name;

    @Override
    public boolean equals(Object o) {
        System.out.println("Equals method called");
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        System.out.println("Hashcode method called");
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
               '}';
    }
}
public class SetExample3 {
    public static void main(String[] args) {
        Student s1 = new Student("Charan");
        Student s2 = new Student("Krish");
        Student s3 = new Student("Charan");
        Student s4 = new Student("Krish");
        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        for(Student s:set){
            System.out.println(s);
        }
    }
}
