package com.example.madhuni.demo.service;

import com.example.madhuni.demo.model.Payment;
import com.example.madhuni.demo.model.Product;
import com.example.madhuni.demo.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImplementation implements PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;


    @Override
    public Payment addPayment(Payment payment) {
        return null;
    }
}
