package com.careerit.jsf.day25;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
class Product extends Object {
    private String name;
    private double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(product.getPrice(), getPrice()) == 0 && Objects.equals(getName(), product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice());
    }
}

public class SetExample2 {

    public static void main(String[] args) {

        Product p1 = new Product("Lenovo ThinkPad", 35000);
        Product p2 = new Product("Lenovo ThinkPad", 35000);
        Product p3 = new Product("Lenovo ThinkPad", 35000);

        Set<Product> productSet = new HashSet<>();
        productSet.add(p1);
        productSet.add(p2);
        productSet.add(p3);
        System.out.println("Total products :" + productSet.size());
    }
}
