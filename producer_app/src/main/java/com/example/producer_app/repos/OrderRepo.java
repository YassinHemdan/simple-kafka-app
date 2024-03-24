package com.example.producer_app.repos;

import com.example.producer_app.entites.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Integer> {
}
