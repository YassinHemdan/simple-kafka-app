package com.example.producer_app.controllers;

import com.example.producer_app.dtos.OrderDTO;
import com.example.producer_app.entites.Order;
import com.example.producer_app.services.Iservices.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@AllArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/save-all")
    public List<OrderDTO> saveAll(@RequestBody List<Order> orders){
        return orderService.saveAll(orders);
    }
    @DeleteMapping("/delete-all")
    public void deleteAll(){
        orderService.deleteAll();
    }
}
