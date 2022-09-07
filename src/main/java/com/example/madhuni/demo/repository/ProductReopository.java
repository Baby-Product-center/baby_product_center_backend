package com.example.madhuni.demo.repository;

import com.example.madhuni.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductReopository extends JpaRepository <Product,Integer> {
}
