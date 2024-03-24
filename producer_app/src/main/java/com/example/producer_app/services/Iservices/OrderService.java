package com.example.producer_app.services.Iservices;

import com.example.producer_app.dtos.OrderDTO;
import com.example.producer_app.entites.Order;

import java.util.List;

public interface OrderService {
    List<OrderDTO> saveAll(List<Order> orders);
    Order save(Order order);
    void deleteAll();
}
