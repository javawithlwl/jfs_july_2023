package com.careerit.jsf.day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(ArrayListExample4.class.getResourceAsStream("/data.txt"));
        List<List<String>> storeWithProductList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] arr = line.split(",");
            List<String> product = new ArrayList<>();
            for (String ele : arr) {
                product.add(ele);
            }
            storeWithProductList.add(product);
        }
        System.out.println(storeWithProductList);

        // Find the unique products from all the stores
        List<String> uniqueProducts = new ArrayList<>();
        for(List<String> productList:storeWithProductList){
            for(String p:productList){
                if(!uniqueProducts.contains(p)){
                    uniqueProducts.add(p);
                }
            }
        }
        System.out.println("The unique products are :"+uniqueProducts);
        // Find the products which are sold in all the stores

        // String,StringBuilder, StringBuffer, static, final, enum
    }
}
