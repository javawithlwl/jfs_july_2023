package com.careerit.jsf.iplstats;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class TeamStatsDto {
    private String teamName;
    private double totalAmount;
    private double minAmount;
    private double maxAmount;
    private double avgAmount;
    private long playerCount;

    @Override
    public String toString() {
        return "TeamStatsDto{" +
               "teamName='" + teamName + '\'' +
               ", totalAmount=" + String.format("%f",totalAmount) +
               ", minAmount=" + String.format("%f",minAmount) +
               ", maxAmount=" + String.format("%f",maxAmount) +
               ", avgAmount=" + String.format("%f",avgAmount)+
               ", playerCount=" + playerCount +
               '}';
    }


}
