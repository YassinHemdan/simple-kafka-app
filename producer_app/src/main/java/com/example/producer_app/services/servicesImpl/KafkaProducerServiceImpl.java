package com.example.producer_app.services.servicesImpl;

import com.example.producer_app.dtos.OrderDTO;
import com.example.producer_app.services.Iservices.KafkaProducerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerServiceImpl implements KafkaProducerService {
    @Value("${spring.kafka.producer.outbound-topic}")
    private String topicName;
    private final KafkaTemplate<String, Object> kafkaTemplate;
    public KafkaProducerServiceImpl(KafkaTemplate<String, Object> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }
    @Override
    public void sendMessage(OrderDTO order) {
        Message<OrderDTO> message = MessageBuilder
                .withPayload(order)
                .setHeader(KafkaHeaders.TOPIC, topicName)
                .build();
        kafkaTemplate.send(message);
    }
}
