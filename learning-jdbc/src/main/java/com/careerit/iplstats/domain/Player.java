package com.careerit.iplstats.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    private long id;
    private String name;
    private String role;
    private String teamName;
    private String teamLabel;
    private double amount;

}
