package com.careerit.jsf.day17;

import com.careerit.jsf.day16.MaskUtil;

public class CurrentAccount extends Account {

    private final double overDraft = 10000;

    public CurrentAccount(String accNumber, String name, double balance) {
        super(accNumber, name, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount < balance + overDraft) {
            balance = balance - amount;
            System.out.println("Amount " + amount + " is debited from your account" + MaskUtil.maskAccNumber(accNumber) + " and your current balance is " + balance);
        } else {
            System.out.println("Sorry! Insufficient funds");
        }
    }

}
