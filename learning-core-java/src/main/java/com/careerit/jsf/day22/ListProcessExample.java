package com.careerit.jsf.day22;

import java.util.List;

public class ListProcessExample {

    public static void main(String[] args) {

        Student s1 = Student.builder()
                .firstName("Krish")
                .lastName("T")
                .qualification("B.Tech")
                .email("krish.t@wipro.com")
                .nickName("Kittu")
                .weight(60.50f)
                .height(5.6f)
                .gender(Gender.M)
                .build();
        System.out.println(s1);

    }
}
