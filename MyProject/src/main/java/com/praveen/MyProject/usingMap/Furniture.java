package com.praveen.MyProject.usingMap;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class Furniture {

	private String color;
	private String name;
	private double price;	
	private Map<String,String> features;
	
	public Furniture() {
		super();
	}

	@Autowired
	public Furniture(String color, String name, double price, Map<String, String> features) {
		super();
		this.color = color;
		this.name = name;
		this.price = price;
		this.features = features;
	}

	@Override
	public String toString() {
		return "Furniture [color=" + color + ", name=" + name + ", price=" + price + ", material=" + features + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Map<String, String> getFeatures() {
		return features;
	}

	public void setFeatures(Map<String, String> features) {
		this.features = features;
	}

	public void printDetail() {
		System.out.println("Color :"+getColor());
		System.out.println("Name :"+getName());
		System.out.println("Price :"+getPrice());

		for(Map.Entry<String, String> entry:features.entrySet())
		{
			System.out.println("Features :"+entry.getKey()+"-"+entry.getValue());
		}
	}
	
	
}
