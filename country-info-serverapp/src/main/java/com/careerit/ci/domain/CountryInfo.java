package com.careerit.ci.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "country_info")
public class CountryInfo {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "country_name")
    private String countryName;
    @Column(name = "ccn3")
    private String ccn3;
    @Column(name = "population")
    private long population;
    @Column(name = "region")
    private String region;
    @Column(name = "area")
    private double area;
    @Column(name = "flag_svg")
    private String flagSvg;
}
