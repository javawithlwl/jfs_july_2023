package com.careerit.jsf.day22;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlayerDetails {
    private String name;
    private String role;
    private String teamName;
    private double amount;
}
