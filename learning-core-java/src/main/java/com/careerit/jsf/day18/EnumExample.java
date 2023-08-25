package com.careerit.jsf.day18;

import lombok.*;

import java.util.List;

enum Color {
    RED, GREEN, BLUE;
}

enum Size {
    S(36), M(38), L(40), XL(42);
    private int size;

    private Size(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}

enum ItemType {
    SHIRT, TSHIRT;
}

@Getter
@Setter
@ToString
class Order {
    private String orderId;
    private ItemType itemType;
    private Color color;
    private Size size;
    private double price;
    private int quantity;
    private double totalAmount;

    public Order(ItemType itemType, Color color, Size size, double price, int quantity) {
        this.orderId = "ORD" + System.currentTimeMillis() + Math.random() * 1000;
        this.itemType = itemType;
        this.color = color;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
        this.totalAmount = price * quantity;
    }
}


public class EnumExample {

    public static void main(String[] args) {

        Order order1 = new Order(ItemType.SHIRT, Color.BLUE, Size.L, 1200, 2);
        Order order2 = new Order(ItemType.TSHIRT, Color.GREEN, Size.M, 1000, 3);
        Order order3 = new Order(ItemType.SHIRT, Color.RED, Size.XL, 1500, 1);
        Order order4 = new Order(ItemType.TSHIRT, Color.BLUE, Size.S, 800, 4);
        Order order5 = new Order(ItemType.SHIRT, Color.GREEN, Size.M, 1200, 2);
        Order order6 = new Order(ItemType.TSHIRT, Color.RED, Size.L, 1000, 3);
        Order order7 = new Order(ItemType.SHIRT, Color.BLUE, Size.XL, 1500, 1);
        Order order8 = new Order(ItemType.TSHIRT, Color.GREEN, Size.S, 800, 4);
        Order order9 = new Order(ItemType.SHIRT, Color.RED, Size.M, 1200, 2);
        Order order10 = new Order(ItemType.TSHIRT, Color.BLUE, Size.L, 1000, 3);
        List<Order> orders = List.of(order1, order2, order3, order4, order5, order6, order7, order8, order9, order10);
        // What is the total amount of all orders
        double totalAmount = 0;
        for(Order order : orders){
            totalAmount += order.getTotalAmount();
        }
        System.out.println("Total amount :"+totalAmount);
        // What is the total amount of all orders of type SHIRT
        double totalAmountOfShirt = 0;
        for(Order order : orders){
            if(order.getItemType() == ItemType.SHIRT){
                totalAmountOfShirt += order.getTotalAmount();
            }
        }
        System.out.println("Total amount of shirt :"+totalAmountOfShirt);
        // What is the total quantity of all orders of size 40
        int totalQuantityOfSize40 = 0;
        for(Order order : orders){
            if(order.getSize().getSize() == 40){
                totalQuantityOfSize40 += order.getQuantity();
            }
        }
        System.out.println("Total quantity of size 40 :"+totalQuantityOfSize40);

    }
}
