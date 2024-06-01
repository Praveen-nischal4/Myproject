package com.praveen.MyProject.practise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class AppMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProductConfig.class);

        // Retrieve the ProductConfig bean
        ProductConfig productConfig = context.getBean(ProductConfig.class);

        // Display products
        Map<String, Product> products = productConfig.products();
        for (Map.Entry<String, Product> entry : products.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Close the context
        context.close();
    }
}
