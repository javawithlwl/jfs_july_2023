package com.careerit.jsf.day23;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppUser {

        private String username;
        private String password;
        private String email;
        private boolean deleted;
}
