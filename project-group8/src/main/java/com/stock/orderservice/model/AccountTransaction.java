package com.stock.orderservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("account_transactions")
public class AccountTransaction {

    @Id
    private String id;
    private String user;
    private String stockName;
    private int reserved;

    public AccountTransaction() {}

    public AccountTransaction(String user, String stockName, int reserved) {
        this.user = user;
        this.stockName = stockName;
        this.reserved = reserved;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getUser() { return user; }
    public void setUser(String user) { this.user = user; }

    public String getStockName() { return stockName; }
    public void setStockName(String stockName) { this.stockName = stockName; }

    public int getReserved() { return reserved; }
    public void setReserved(int reserved) { this.reserved = reserved; }
}
