package com.careerit.jsf.day22;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
class Wallet {
    private long id;
    private String mobile;
    private double balance;
}

public class JavaToJsonToJava {

    public static void main(String[] args) throws IOException {

        Wallet wallet = Wallet.builder().id(1001).mobile("9898989898").balance(5000).build();

        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(wallet);
        System.out.println(str);
        Wallet wallet1 = objectMapper.readValue(str, Wallet.class);
        System.out.println(wallet1);
        Wallet wallet2 = objectMapper.readValue(JavaToJsonToJava.class.getResourceAsStream("/wallet.json"), Wallet.class);
        System.out.println(wallet2);

        TypeReference<List<Wallet>> typeReference = new TypeReference<>() {};
        List<Wallet> walletList = objectMapper.readValue(JavaToJsonToJava.class.getResourceAsStream("/wallets.json"), typeReference);
        for(Wallet ele: walletList){
            System.out.println(ele);
        }
        File file = new File("wallet_output.json");
        objectMapper.writeValue(file,walletList);

    }
}
