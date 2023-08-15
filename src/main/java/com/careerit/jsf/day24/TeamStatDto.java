package com.careerit.jsf.day24;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamStatDto {
    private String teamName;
    private long count;
    private double totalAmount;
    private double maxAmount;
    private double minAmount;
    private double avgAmount;
}
