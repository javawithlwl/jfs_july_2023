package com.careerit.jsf.day22;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private String firstName;
    private String lastName;
    private String nickName;
    private String email;
    private String qualification;
    private Gender gender;
    private float weight;
    private float height;
}
