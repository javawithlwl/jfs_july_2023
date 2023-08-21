package com.careerit.jsf.iplstats;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoleStatsDto {

        private String roleName;
        private double maxAmount;
        private double minAmount;
        private double avgAmount;
        private long playerCount;
}
