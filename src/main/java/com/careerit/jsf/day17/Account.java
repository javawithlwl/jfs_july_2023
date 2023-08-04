package com.careerit.jsf.day17;

import com.careerit.jsf.day16.MaskUtil;

public class Account {
    String accNumber;
    String name;
    double balance;

    public Account(String accNumber, String name, double balance) {
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
    }
    public void showDetails(){
        System.out.println("Name       :"+name);
        System.out.println("Acc Number :" + MaskUtil.maskAccNumber(accNumber));
        System.out.println("Balance    :"+balance);
    }
    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Sorry! Insufficient funds");
        }else{
            balance -= amount;
            System.out.println("Amount "+amount+" is debited from your account"+MaskUtil.maskAccNumber(accNumber)+" and your current balance is "+balance);
        }
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Amount "+amount+" is credited to your account"+MaskUtil.maskAccNumber(accNumber)+" and your current balance is "+balance);
    }
}
