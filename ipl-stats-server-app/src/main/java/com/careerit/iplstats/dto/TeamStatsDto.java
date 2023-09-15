package com.careerit.iplstats.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamStatsDto {

        private String teamName;
        private double totalAmount;
}
