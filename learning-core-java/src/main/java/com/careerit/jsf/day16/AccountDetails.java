package com.careerit.jsf.day16;

public class AccountDetails {

    private String name;
    private String accNumber;
    private double balance;

    public AccountDetails(String name, String accNumber, double balance) {
        this.name = name;
        this.accNumber = accNumber;
        this.balance = balance;
    }
    public void showDetails(){
        System.out.println("Name       :"+name);
        System.out.println("Acc Number :"+MaskUtil.maskAccNumber(accNumber));
        System.out.println("Balance    :"+balance);
    }
}
