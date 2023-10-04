package com.careerit.iplstats.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "player")
@Getter
@Setter
public class Player {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        @Column(name = "name")
        private String name;
        @Column(name = "player_role")
        private String role;
        @Column(name = "team_name")
        private String teamName;
        @Column(name = "team_label")
        private String teamLabel;
        @Column(name = "amount")
        private double amount;
}
