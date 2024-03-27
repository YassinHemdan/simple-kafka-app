package com.example.kafka.services.Iservices;

import com.example.kafka.dtos.OrderDTO;

public interface KafkaConsumerService {
    void consume(OrderDTO order);
}
