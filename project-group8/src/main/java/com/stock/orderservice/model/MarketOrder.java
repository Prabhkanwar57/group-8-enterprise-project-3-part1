package com.stock.orderservice.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("market_orders")
public class MarketOrder {

    @Id
    private String id;
    private String stockName;
    private int quantity;
    private String user;
    private String marketStatus;

    public MarketOrder() {}

    public MarketOrder(String stockName, int quantity, String user, String marketStatus) {
        this.stockName = stockName;
        this.quantity = quantity;
        this.user = user;
        this.marketStatus = marketStatus;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getStockName() { return stockName; }
    public void setStockName(String stockName) { this.stockName = stockName; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getUser() { return user; }
    public void setUser(String user) { this.user = user; }

    public String getMarketStatus() { return marketStatus; }
    public void setMarketStatus(String marketStatus) { this.marketStatus = marketStatus; }
}