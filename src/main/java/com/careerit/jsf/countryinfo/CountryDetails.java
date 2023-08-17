package com.careerit.jsf.countryinfo;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CountryDetails {
    private String countryName;
    private String ccn3;
    private double area;
    private long population;
}
