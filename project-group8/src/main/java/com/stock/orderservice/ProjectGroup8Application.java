package com.stock.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProjectGroup8Application {
    public static void main(String[] args) {
        SpringApplication.run(ProjectGroup8Application.class, args);
    }
}
