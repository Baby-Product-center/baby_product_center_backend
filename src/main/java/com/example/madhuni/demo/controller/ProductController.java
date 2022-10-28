package com.example.madhuni.demo.controller;

import com.example.madhuni.demo.model.Product;
import com.example.madhuni.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*", maxAge = 3600 )
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/getall")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<Product> getAllProducts(){return productService.getAllProducts();}

    @PutMapping("/updateproduct")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public Product updateProduct(@RequestBody  Product product){
        productService.updateProduct(product);
        return product;
    }
    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);

    }
    @DeleteMapping("/deleteProduct")
    public String deleteProduct(@RequestBody int product_id){
        return productService.deleteProduct(product_id);
    }

}
