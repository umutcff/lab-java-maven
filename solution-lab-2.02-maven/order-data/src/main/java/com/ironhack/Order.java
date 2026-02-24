package com.ironhack;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private String customer;
    private List<OrderItem> orderItems;
    private double total;

    public Order(){
        this.orderItems=new ArrayList<>();
    }


    public String getOrderId() {
        return orderId;
    }
    public String getCustomer() {
        return customer;
    }
    public List<OrderItem> getItems() {
        return orderItems;
    }
    public double getTotal() {
        return total;
    }
}
