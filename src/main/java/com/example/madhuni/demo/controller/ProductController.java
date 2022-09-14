package com.example.madhuni.demo.controller;

import com.example.madhuni.demo.model.Product;
import com.example.madhuni.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/getall")
    public List<Product> getAllProducts(){return productService.getAllProducts();}
    @PostMapping("/add")
    public String add(@RequestBody Product product){
        productService.saveProduct(product);
        return "New student is addde";
    }


}
