package com.careerit.jsf.day14.wallet;

public class WalletManager {

    public static void main(String[] args) {

        WalletService walletService = new WalletService();
        walletService.showWalletInfo();
        System.out.println("-".repeat(100));
        walletService.showWalletTransactionInfo();
        System.out.println("-".repeat(100));
        walletService.showWalletBalanceAfterTransactions();
    }
}
