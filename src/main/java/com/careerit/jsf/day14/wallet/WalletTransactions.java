package com.careerit.jsf.day14.wallet;

public class WalletTransactions {

    private long txnId;
    private String fromMobile;
    private String toMobile;
    private double amount;

    public WalletTransactions(long txnId, String fromMobile, String toMobile, double amount) {
        this.txnId = txnId;
        this.fromMobile = fromMobile;
        this.toMobile = toMobile;
        this.amount = amount;
    }

    public long getTxnId() {
        return txnId;
    }

    public void setTxnId(long txnId) {
        this.txnId = txnId;
    }

    public String getFromMobile() {
        return fromMobile;
    }

    public void setFromMobile(String fromMobile) {
        this.fromMobile = fromMobile;
    }

    public String getToMobile() {
        return toMobile;
    }

    public void setToMobile(String toMobile) {
        this.toMobile = toMobile;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void showWalletTransactionInfo(){
        System.out.println("TxnId :"+txnId+" From :"+fromMobile+" To :"+toMobile+" Amount :"+amount);
    }
}
