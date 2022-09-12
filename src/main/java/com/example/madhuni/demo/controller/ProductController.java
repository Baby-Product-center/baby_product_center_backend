package com.example.madhuni.demo.controller;

import com.example.madhuni.demo.model.Product;
import com.example.madhuni.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/getall")
    public List<Product> getAllProducts(){return productService.getAllProducts();}

}
