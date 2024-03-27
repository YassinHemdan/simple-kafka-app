package com.example.kafka.services.Iservices;

import com.example.kafka.dtos.OrderDTO;

public interface KafkaProducerService {
    void sendMessage(OrderDTO order);
}
