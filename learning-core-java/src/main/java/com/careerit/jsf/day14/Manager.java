package com.careerit.jsf.day14;

class Product {
    long id;
    String name;
    String description;
    double price;


    public Product(long id, String name, double price) {
        this(id, name, "N/A", price);
    }

    public Product(long id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void showInfo() {
        System.out.println("Id :" + id + " Name :" + name + " Price :" + price);
    }

}

public class Manager {

    public static void main(String[] args) {
        Product product = new Product(1001, "Dell Laptop", 45000);
        product.showInfo();
    }
}


