package com.careerit.jsf.day16;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class AccountManager {

    public static void main(String[] args) throws IOException {
        File file = new File(AccountManager.class.getResource("/user_data.csv").getFile());
        List<String> lines = Files.readAllLines(file.toPath());
        List<AccountDetails> accountDetailsList = new ArrayList<>();
        for(int i=1;i<lines.size();i++){
            String[] arr = lines.get(i).split(",");
            String name = arr[0];
            String accNumber = arr[1];
            double balance = Double.parseDouble(arr[2]);
            AccountDetails obj = new AccountDetails(name,accNumber,balance);
            accountDetailsList.add(obj);
        }

        for(AccountDetails obj:accountDetailsList){
            obj.showDetails();
            System.out.println("-".repeat(100));
        }
    }
}
