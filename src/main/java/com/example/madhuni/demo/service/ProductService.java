package com.example.madhuni.demo.service;

import com.example.madhuni.demo.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public List<Product> getAllProducts();
    public Optional<Product> getProduct(int pid);
    public Product saveProduct(Product product);
    public Product updateProduct(Product product);
    public Product addProduct(Product product);
    public String deleteProduct(int product_id);
}

