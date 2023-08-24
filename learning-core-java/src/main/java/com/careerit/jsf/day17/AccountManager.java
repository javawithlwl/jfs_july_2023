package com.careerit.jsf.day17;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {

    public static void main(String[] args) {

        SavingsAccount account1 = new SavingsAccount("SB10008989", "Rajesh", 45000);
        SavingsAccount account2 = new SavingsAccount("SB10008990", "Krish", 55000);
        SavingsAccount account3 = new SavingsAccount("SB10008991", "Manoj", 65000);
        CurrentAccount account4 = new CurrentAccount("CA10008992", "Charan", 75000);
        CurrentAccount account5 = new CurrentAccount("CA10008993", "Ramesh", 85000);
        CurrentAccount account6 = new CurrentAccount("CA10008994", "Suresh", 95000);

        List<Account> accountList = new ArrayList<>();
        accountList.add(account1);
        accountList.add(account2);
        accountList.add(account3);
        accountList.add(account4);
        accountList.add(account5);
        accountList.add(account6);


        // Count no of savings and current accounts

        int savingsCount = 0;
        int currentCount = 0;
        for(Account acc:accountList) {
        	if(acc instanceof SavingsAccount) {
        		savingsCount++;
        	}else if(acc instanceof CurrentAccount) {
        		currentCount++;
        	}
        }
        System.out.println("Total savings accounts :"+savingsCount);
        System.out.println("Total current accounts :"+currentCount);


    }
}
