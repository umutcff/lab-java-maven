package com.ironhack;

import com.google.gson.Gson;

public class OrderProcessor {
    public static void main(String[] args) {

        String json = """
                {
                  "orderId": "1001",
                  "customer": "Umut",
                  "items": [
                    { "product": "Laptop", "quantity": 1, "price": 1200.0 },
                    { "product": "Mouse", "quantity": 2, "price": 25.0 }
                  ],
                  "total": 1250.0
                }
                """;

        Gson gson = new Gson();
        Order order = gson.fromJson(json, Order.class);

        System.out.println("JSON to Order:");
        System.out.println(order);
    }
}
