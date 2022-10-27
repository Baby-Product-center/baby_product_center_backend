package com.example.madhuni.demo.service;

import com.example.madhuni.demo.model.Order;
import com.example.madhuni.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImplementation implements  OrderService{
    @Autowired
    private OrderRepository orderRepository;


    @Override
    public Order AddOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public void updateDeliveryStatus(int oid) {
     orderRepository.updateDelveryStatus(oid);
    }

}
