package com.careerit.jsf.invoicegen;

public class IndTaxServiceProvider implements  TaxServiceProvider{
    @Override
    public double calculateTax(double amount) {
        return amount * 0.08;
    }
}
