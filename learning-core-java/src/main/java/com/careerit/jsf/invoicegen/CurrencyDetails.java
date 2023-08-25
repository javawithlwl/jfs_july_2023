package com.careerit.jsf.invoicegen;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class CurrencyDetails {
    private String countryCode;
    private String currencySymbol;
}
