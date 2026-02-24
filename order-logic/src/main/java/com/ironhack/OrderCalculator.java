package com.ironhack;

public class OrderCalculator {

    public static void main(String[] args) {

        Order order = new Order();

        double sum = 0;

        for (OrderItem item : order.getItems()) {
            sum += item.getPrice() * item.getQuantity();
        }

        System.out.println("Calculated Total: " + sum);
    }

}
