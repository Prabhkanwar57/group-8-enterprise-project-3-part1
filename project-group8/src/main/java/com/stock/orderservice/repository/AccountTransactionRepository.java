package com.stock.orderservice.repository;

import com.stock.orderservice.model.AccountTransaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountTransactionRepository extends MongoRepository<AccountTransaction, String> {}
