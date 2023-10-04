package com.careerit.ci.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CountryInfoDto {
    private long id;
    private String countryName;
    private String ccn3;
    private long population;
    private String region;
    private double area;
    private String flagSvg;
}
