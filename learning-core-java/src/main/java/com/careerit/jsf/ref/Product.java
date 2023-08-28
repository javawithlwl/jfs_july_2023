package com.careerit.jsf.ref;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

public class Product {

        private String pname;
        private double price;
        private String brand;
        @Override
        public String toString(){
                System.out.println("Product name :"+pname);
                System.out.println("Product price :"+price);
                System.out.println("Product brand :"+brand);
                return null;
        }

}
