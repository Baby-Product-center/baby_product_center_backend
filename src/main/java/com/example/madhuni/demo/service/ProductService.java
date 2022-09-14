package com.example.madhuni.demo.service;

import com.example.madhuni.demo.model.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProducts();
    public Product saveProduct(Product product);
}

