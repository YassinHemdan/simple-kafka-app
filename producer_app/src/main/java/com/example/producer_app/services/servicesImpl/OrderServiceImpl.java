package com.example.producer_app.services.servicesImpl;

import com.example.producer_app.Utils.Converter;
import com.example.producer_app.dtos.OrderDTO;
import com.example.producer_app.entites.Order;
import com.example.producer_app.repos.OrderRepo;
import com.example.producer_app.services.Iservices.KafkaProducerService;
import com.example.producer_app.services.Iservices.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepo orderRepo;
    private final KafkaProducerServiceImpl kafkaProducerService;
    private final Converter converter;
    @Override
    public List<OrderDTO> saveAll(List<Order> orders) {
        orders = orderRepo.saveAll(orders);
        List<OrderDTO> orders_to_produce = converter.toList(orders, OrderDTO.class);
        for (OrderDTO order : orders_to_produce)
            kafkaProducerService.sendMessage(order);

        return orders_to_produce;
    }
    @Override
    public Order save(Order order) {
        orderRepo.save(order);
        kafkaProducerService.sendMessage(converter.convert(order, OrderDTO.class));

        return order;
    }
    @Override
    public void deleteAll(){
        orderRepo.deleteAll();
    }
}
