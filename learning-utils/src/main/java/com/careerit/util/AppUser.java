package com.careerit.util;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class AppUser {

    private String name;
    private String email;
    private String mobile;
}
