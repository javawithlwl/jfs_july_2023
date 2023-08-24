package com.careerit.jsf.invoicegen;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class CustomerUsageData {

        private String cid;
        private String name;
        private String country;
        private double billAmount;
}
