package com.example.producer_app.services.Iservices;

import com.example.producer_app.dtos.OrderDTO;

public interface KafkaProducerService {
    void sendMessage(OrderDTO order);
}
