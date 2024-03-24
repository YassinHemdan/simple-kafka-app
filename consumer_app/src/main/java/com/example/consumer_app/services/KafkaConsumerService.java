package com.example.consumer_app.services;

import com.example.consumer_app.dtos.OrderDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    @KafkaListener(topics = "order-purchased-topic", groupId = "notification-group}")
    public void consume(OrderDTO order){
        String name = order.getCustomer().getName();
        String category = order.getCategory();

        System.out.println("Thank u " + name + " for purchasing " + category + " :D");
    }
}
