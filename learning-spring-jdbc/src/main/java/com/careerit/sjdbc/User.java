package com.careerit.sjdbc;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String country;
}
