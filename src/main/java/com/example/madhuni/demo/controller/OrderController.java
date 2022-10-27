package com.example.madhuni.demo.controller;

import com.example.madhuni.demo.model.Order;
import com.example.madhuni.demo.repository.ProductReopository;
import com.example.madhuni.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/addNewOrder")
    public Order addNewOrder(@RequestBody Order order){
        orderService.AddOrder(order);
        return order;
    }

}
