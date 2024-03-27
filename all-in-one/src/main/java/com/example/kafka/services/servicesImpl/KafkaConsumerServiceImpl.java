package com.example.kafka.services.servicesImpl;

import com.example.kafka.dtos.OrderDTO;
import com.example.kafka.services.Iservices.KafkaConsumerService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerServiceImpl implements KafkaConsumerService {
    @KafkaListener(topics = "order-purchased-topic", groupId = "notification-group}")
    public void consume(OrderDTO order){
        String name = order.getCustomer().getName();
        String category = order.getCategory();

        System.out.println("Thank u " + name + " for purchasing " + category + " :D");
    }
}
