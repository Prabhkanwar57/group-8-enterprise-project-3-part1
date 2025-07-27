package com.stock.orderservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("orders")
public class Order {

    @Id
    private String id;
    private String stockName;
    private int quantity;
    private String user;
    private String status;

    public Order() {}

    public Order(String stockName, int quantity, String user, String status) {
        this.stockName = stockName;
        this.quantity = quantity;
        this.user = user;
        this.status = status;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getStockName() { return stockName; }
    public void setStockName(String stockName) { this.stockName = stockName; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getUser() { return user; }
    public void setUser(String user) { this.user = user; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
