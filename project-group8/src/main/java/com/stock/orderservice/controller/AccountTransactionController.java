package com.stock.orderservice.controller;

import com.stock.orderservice.model.AccountTransaction;
import com.stock.orderservice.repository.AccountTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountTransactionController {

    @Autowired
    private AccountTransactionRepository repo;

    @PostMapping("/reserve")
    public ResponseEntity<AccountTransaction> reserveStock(@RequestBody AccountTransaction tx) {
        tx.setReserved(tx.getReserved());
        AccountTransaction saved = repo.save(tx);
        return ResponseEntity.ok(saved);
    }

    @GetMapping
    public ResponseEntity<?> getAllTransactions() {
        return ResponseEntity.ok(repo.findAll());
    }
}
