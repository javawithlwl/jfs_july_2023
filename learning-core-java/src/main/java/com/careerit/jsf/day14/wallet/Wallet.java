package com.careerit.jsf.day14.wallet;

public class Wallet {
    private String id;
    private String name;
    private String mobile;
    private double balance;

    public Wallet(String id, String name, String mobile, double balance) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.balance = balance;
    }
    public void showWalletInfo(){
        System.out.println("Id :"+id+" Name :"+name+" Mobile :"+mobile+" Balance :"+balance);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
