package com.example.demo.config;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;

//@Component
//public class AnimalDataLoader implements CommandLineRunner {
//    private final OrderRepository repository;
//
//    public AnimalDataLoader(OrderRepository repository) {
//        this.repository = repository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        List<String> lines = Files.readAllLines(
//                Paths.get("src/main/resources/orders.txt")
//        );
//        for(String line: lines){
//            String[] data=line.split(",");
//            OrderEntity o=new OrderEntity();
//            o.setClientName(data[0]);
//            o.setStatus(OrderStatus.valueOf(data[1]));
//            o.setOrderData(LocalDateTime.now());
//            o.setTotalAmount(100.0);
//            repository.save(o);
//        }
//    }
//}