package bites.examples;

import java.security.PublicKey;

public class Order {

    int total;

    public void addAmount(int amount){
        this.total = total + amount;
    }
    public void addDiscount(int discount){
        this.total = total - discount;
    }

    public String friendlyTotal(){
        return String.format("Thanks! The total value of your order is £%d", this.total);
    }
    public int getTotal(){
        return this.total;
    }

    public Order(int total){
        this.total = total;
    }

    public static void main(String[] args){
        Order order = new Order(100);
        System.out.println(order.getTotal());
        order.addAmount(50);
        System.out.println(order.getTotal());
        order.addDiscount(70);
        System.out.println(order.getTotal());
        System.out.println(order.friendlyTotal());
    }
}
