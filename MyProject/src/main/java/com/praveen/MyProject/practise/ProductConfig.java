package com.praveen.MyProject.practise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ProductConfig {

    @Bean
    public Map<String, Product> products() {
        Map<String, Product> products = new HashMap<String,Product>();
        products.put("Laptop", laptop());
        products.put("Phone", phone());
        products.put("Tablet", tablet());
        return products;
    }

    @Bean
    public Product laptop() {
        return new Product("Laptop", new Category("Electronics"));
    }

    @Bean
    public Product phone() {
        return new Product("Phone", new Category("Electronics"));
    }

    @Bean
    public Product tablet() {
        return new Product("Tablet", new Category("Electronics"));
    }
}


