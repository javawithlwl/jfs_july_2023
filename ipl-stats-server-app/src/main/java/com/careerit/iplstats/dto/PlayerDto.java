package com.careerit.iplstats.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlayerDto {
    private long id;
    private String name;
    private String role;
    private String teamName;
    private String teamLabel;
    private double amount;
}
