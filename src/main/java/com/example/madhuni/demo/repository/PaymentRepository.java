package com.example.madhuni.demo.repository;

import com.example.madhuni.demo.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository <Payment, Integer> {

}
