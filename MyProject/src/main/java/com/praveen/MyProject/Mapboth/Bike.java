package com.praveen.MyProject.Mapboth;

import org.springframework.stereotype.Component;

@Component
public class Bike {

	private String lisenceno;
	private String model;
	
	public Bike() {
		super();
	}

	public Bike(String lisenceno, String model) {
		super();
		this.lisenceno = lisenceno;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Bike [lisenceno=" + lisenceno + ", model=" + model + "]";
	}

	public String getLisenceno() {
		return lisenceno;
	}

	public void setLisenceno(String lisenceno) {
		this.lisenceno = lisenceno;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
}
