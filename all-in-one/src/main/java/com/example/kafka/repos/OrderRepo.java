package com.example.kafka.repos;


import com.example.kafka.entites.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Integer> {
}
