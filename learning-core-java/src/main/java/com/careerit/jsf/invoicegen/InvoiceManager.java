package com.careerit.jsf.invoicegen;

import java.util.List;

public class InvoiceManager {

    public static void main(String[] args) {

        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        List<Invoice> invoiceList = invoiceGenerator.generateInvoices();

        for (Invoice invoice : invoiceList) {
            System.out.println(invoice);
            System.out.println("-".repeat(100));
        }
    }
}
