package com.careerit.jsf.invoicegen;

public class USTaxServiceProvider implements  TaxServiceProvider{
    @Override
    public double calculateTax(double amount) {
        return amount * 0.05;
    }
}
