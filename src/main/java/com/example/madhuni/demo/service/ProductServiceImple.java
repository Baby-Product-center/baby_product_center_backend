package com.example.madhuni.demo.service;

import com.example.madhuni.demo.model.Product;
import com.example.madhuni.demo.repository.ProductReopository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImple implements ProductService  {
    @Autowired
    private ProductReopository productReopository;

    @Override
    public List<Product> getAllProducts() {
        System.out.println("came");
        return productReopository.findAll();
    }
    @Override
    public Product saveProduct(Product product) {
        return productReopository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        Product existingProduct = productReopository.findById(product.getProduct_id()).orElse(null);
        existingProduct.setProduct_Name(product.getProduct_Name());
        existingProduct.setPrice(product.getPrice());
        return productReopository.save(existingProduct);

    }

    @Override
    public Optional<Product> getProduct(int pid) {
        return productReopository.findById(pid);
    }

    @Override
    public Product addProduct(Product product) {
        return productReopository.save(product);
    }

    @Override
    public String deleteProduct(long product_id) {
        productReopository.deleteById((int) product_id);
        return "product was deleted";
    }
}
