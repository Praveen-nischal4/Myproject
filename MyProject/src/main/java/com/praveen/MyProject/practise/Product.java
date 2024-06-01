package com.praveen.MyProject.practise;

import org.springframework.beans.factory.annotation.Autowired;

public class Product {
    private String name;
   
    private Category category;

    public Product() {
    }

   @Autowired
    public Product(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

   
    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
	public String toString() {
		return "Product [name=" + name + "]";
	}
}
