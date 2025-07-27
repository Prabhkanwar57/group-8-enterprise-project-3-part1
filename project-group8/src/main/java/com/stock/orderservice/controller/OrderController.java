package com.stock.orderservice.controller;

import com.stock.orderservice.model.Order;
import com.stock.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository repo;

    @PostMapping("/place")
    public ResponseEntity<Order> placeOrder(@RequestBody Order order) {
        order.setStatus("PLACED");
        Order saved = repo.save(order);
        return ResponseEntity.ok(saved);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return repo.findAll();
    }
}
