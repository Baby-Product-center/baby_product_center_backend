package com.example.madhuni.demo.service;

import com.example.madhuni.demo.model.Product;
import com.example.madhuni.demo.repository.ProductReopository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImple implements ProductService  {
    @Autowired
    private ProductReopository productReopository;

    @Override
    public List<Product> getAllProducts() {
        return productReopository.findAll();
    }
}
