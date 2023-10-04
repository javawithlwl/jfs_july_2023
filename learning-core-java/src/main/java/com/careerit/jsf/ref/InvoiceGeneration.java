package com.careerit.jsf.ref;

public class InvoiceGeneration {

        @AuthInfo(role = "ADMIN")
        public void generateInvoice(){
                System.out.println("Invoice is generated");
        }
}
