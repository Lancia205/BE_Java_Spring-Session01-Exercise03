package com.example.service;

import com.example.model.Product;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = Arrays.asList(
            new Product(1, "Laptop", 1500),
            new Product(2, "Phone", 800),
            new Product(3, "Headphone", 100)
    );

    public List<Product> getAllProducts() {
        return products;
    }
}

