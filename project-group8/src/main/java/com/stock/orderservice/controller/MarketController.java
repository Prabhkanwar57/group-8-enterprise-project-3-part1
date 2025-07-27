package com.stock.orderservice.controller;

import com.stock.orderservice.model.MarketOrder;
import com.stock.orderservice.repository.MarketOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/market")
public class MarketController {

    @Autowired
    private MarketOrderRepository repo;

    @PostMapping("/place")
    public ResponseEntity<MarketOrder> placeToMarket(@RequestBody MarketOrder order) {
        order.setMarketStatus("PLACED");
        MarketOrder saved = repo.save(order);
        return ResponseEntity.ok(saved);
    }

    @GetMapping
    public ResponseEntity<?> allMarketOrders() {
        return ResponseEntity.ok(repo.findAll());
    }
}
