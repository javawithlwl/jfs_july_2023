package com.careerit.jsf.day16;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Product {
    private String id;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
               "id='" + id + '\'' +
               ", name='" + name + '\'' +
               ", price=" + price +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(product.getPrice(), getPrice()) == 0 && Objects.equals(getId(), product.getId()) && Objects.equals(getName(), product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPrice());
    }
}

public class MethodOverridingExample {

    public static void main(String[] args) {
        Product p1 = new Product("KA01", "Lenovo Thinkpad", 89000);
        Product p2 = new Product("KA02", "Dell Studio24", 990000);
        Product p3 = new Product("KA03", "HP Pavillion", 79000);
        Product p4 = new Product("KA03", "HP Pavillion", 79000);

        System.out.println(p3 == p4);
        System.out.println(p3.equals(p4));


        String name1 = "Krish";
        String name3 = "Krish";
        String name2 = new String("Krish");
        String name4 = new String("Krish");
        System.out.println(name2 == name4);
        System.out.println(name1.equals(name3));

        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);

        for (Product p : products) {
            System.out.println(p);

        }
    }
}
