package com.careerit.iplstats.domain;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Player {
    private long id;
    private String name;
    private String role;
    private String teamName;
    private String teamLabel;
    private double amount;

}
