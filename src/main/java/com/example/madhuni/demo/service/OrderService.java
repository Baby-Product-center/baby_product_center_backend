package com.example.madhuni.demo.service;

import com.example.madhuni.demo.model.Order;

public interface OrderService {

    public Order AddOrder(Order order);
    public  void updateDeliveryStatus(int oid);
}
