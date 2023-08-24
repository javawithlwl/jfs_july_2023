package com.careerit.jsf.invoicegen;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Invoice {

    private String id;
    private String customerName;
    private String billAmount;
    private String taxAmount;
    private String totalAmount;
}
