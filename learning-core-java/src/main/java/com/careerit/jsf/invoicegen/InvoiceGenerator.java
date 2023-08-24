package com.careerit.jsf.invoicegen;

import org.apache.commons.collections4.Get;

import java.util.ArrayList;
import java.util.List;

public class InvoiceGenerator {

    private final CurrencyService currencyService = new CurrencyService();
    private final CustomerService customerService = new CustomerService();

    public List<Invoice> generateInvoices() {

        final String PRE_FIX="V2023";
        int num = 1001;
        List<CustomerUsageData> customerUsageDataList = customerService.getCustomerUsageData();
        List<Invoice> invoiceList = new ArrayList<>();
        for(CustomerUsageData customerUsageData:customerUsageDataList){
            String invoiceNo = PRE_FIX+num++;
            String customerName = customerUsageData.getName();
            String country = customerUsageData.getCountry();
            double billAmount = customerUsageData.getBillAmount();
            TaxServiceProvider taxServiceProvider = TaxProviderFactory.getTaxProvider(country);
            double taxAmount = taxServiceProvider.calculateTax(billAmount);
            double totalAmount = billAmount + taxAmount;
            CurrencyDetails currencyDetails = currencyService.getCurrencyDetails(country);
            String currencySymbol = currencyDetails.getCurrencySymbol();

            Invoice invoice = Invoice.builder()
                    .id(invoiceNo)
                    .customerName(customerName)
                    .billAmount(currencySymbol+billAmount)
                    .taxAmount(currencySymbol+taxAmount)
                    .totalAmount(currencySymbol+totalAmount)
                    .build();
            invoiceList.add(invoice);

        }
        return invoiceList;
    }


}
