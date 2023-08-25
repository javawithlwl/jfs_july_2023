package com.careerit.jsf.invoicegen;

public class SgTaxServiceProvider implements  TaxServiceProvider{
    @Override
    public double calculateTax(double amount) {
        return amount * 0.03;
    }
}
