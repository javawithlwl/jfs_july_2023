package com.careerit.iplstats.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StatsDto {
    private String teamName;
    private double minAmount;
    private double maxAmount;
    private double avgAmount;
    private double totalAmount;
}
