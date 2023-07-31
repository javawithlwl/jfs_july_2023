package com.careerit.jsf.day14.wallet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WalletService {

    private List<Wallet> wallets = new ArrayList<>();
    private List<WalletTransactions> walletTransactions = new ArrayList<>();
    public WalletService(){
        wallets = loadWalletDetailsFromFile();
        walletTransactions = loadWalletTransactionFromFile();
    }

    public void showWalletInfo(){
        for(Wallet wallet:wallets){
            wallet.showWalletInfo();
        }
    }
    public void showWalletTransactionInfo(){
        for(WalletTransactions walletTransaction:walletTransactions){
            walletTransaction.showWalletTransactionInfo();
        }
    }
    public void showWalletBalanceAfterTransactions(){
        for(Wallet wallet:wallets){
            double amount = getTransactionAmount(wallet.getMobile());
            wallet.setBalance(wallet.getBalance()+amount);
        }
        showWalletInfo();
    }

    private double getTransactionAmount(String mobile){
        double amount = 0;
        for(WalletTransactions wt:walletTransactions){
            if(wt.getFromMobile().equals(mobile)) {
                amount -= wt.getAmount();
            }else if(wt.getToMobile().equals(mobile)){
                amount += wt.getAmount();
            }
        }
        return amount;
    }

    private List<WalletTransactions> loadWalletTransactionFromFile(){
        List<WalletTransactions> walletTransactions = new ArrayList<>();
        Scanner sc = new Scanner(WalletService.class.getResourceAsStream("/wallet_txn.csv"));
        sc.nextLine();
        while(sc.hasNext()){
            String line = sc.nextLine();
            String[] data = line.split(",");
            long txnId = Long.parseLong(data[0]);
            String fromMobile = data[1];
            String toMobile = data[2];
            double amount = Double.parseDouble(data[3]);
            WalletTransactions walletTransaction = new WalletTransactions(txnId, fromMobile, toMobile, amount);
            walletTransactions.add(walletTransaction);
        }
        return walletTransactions;
    }
    private List<Wallet> loadWalletDetailsFromFile(){
        List<Wallet> walletList = new ArrayList<>();
        Scanner sc = new Scanner(WalletService.class.getResourceAsStream("/wallet.csv"));
        sc.nextLine();
        while(sc.hasNext()){
            String line = sc.nextLine();
            String[] data = line.split(",");
            String id = data[0];
            String name = data[1];
            String mobile = data[2];
            double balance = Double.parseDouble(data[3]);
            Wallet wallet = new Wallet(id, name, mobile, balance);
            walletList.add(wallet);
        }
        return walletList;
    }
}
