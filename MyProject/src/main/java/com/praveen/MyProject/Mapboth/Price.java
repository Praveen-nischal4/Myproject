package com.praveen.MyProject.Mapboth;

import org.springframework.stereotype.Component;

@Component
public class Price {

	private double price;

	public Price() {
		super();
	}

	public Price(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Price [price=" + price + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
