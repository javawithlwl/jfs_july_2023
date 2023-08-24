package com.careerit.jsf.day10;

class Account{
    int accNo;
    String name;
    double balance;
    public Account(int accNo,String name,double balance){
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }
    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Sorry! Insufficient funds");
        }else{
            balance -= amount;
            System.out.println("Amount "+amount+" is debited from your account and your current balance is "+balance);
        }
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Amount "+amount+" is credited to your account and your current balance is "+balance);
    }
    public void showInfo(){
        System.out.println("Account No :"+accNo);
        System.out.println("Name       :"+name);
        System.out.println("Balance    :"+balance);
    }
}
public class ClassAndObjectExample {

    public static void main(String[] args) {

            Account acc1 = new Account(1001,"Krish",50000);
            Account acc2 = new Account(1002,"Manoj",40000);
            Account acc3 = new Account(1003,"Charan",30000);
            acc1.showInfo();
            acc1.withdraw(10000);
            acc1.showInfo();

    }
}
