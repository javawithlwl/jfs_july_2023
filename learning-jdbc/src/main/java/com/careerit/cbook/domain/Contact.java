package com.careerit.cbook.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Contact {

        private long id;
        private String name;
        private String email;
        private String mobile;

}
