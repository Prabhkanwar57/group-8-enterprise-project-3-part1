package com.stock.orderservice.repository;

import com.stock.orderservice.model.MarketOrder;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MarketOrderRepository extends MongoRepository<MarketOrder, String> {}
