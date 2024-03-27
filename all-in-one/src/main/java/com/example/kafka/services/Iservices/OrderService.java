package com.example.kafka.services.Iservices;



import com.example.kafka.dtos.OrderDTO;
import com.example.kafka.entites.Order;

import java.util.List;

public interface OrderService {
    List<OrderDTO> saveAll(List<Order> orders);
    Order save(Order order);
    void deleteAll();
}
