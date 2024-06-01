package com.praveen.MyProject.model2;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class OSystem {

	private int version;
	private String name;
	private String type;
	private double price;
	
	private List<String> features;
	
	private Set<Languages> language;
	
	public OSystem() {
		super();
	}


	@Autowired
	public OSystem(int version, String name, String type, double price,List<String> features,Set<Languages> language) {
		super();
		this.version = version;
		this.name = name;
		this.type = type;
		this.price = price;
		this.features=features;
		this.language=language;
	}


	@Override
	public String toString() {
		return "OSystem [version=" + version + ", name=" + name + ", type=" + type + ", price=" + price + ", features="
				+ features + ", language=" + language + "]";
	}


	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public List<String> getFeatures() {
		return features;
	}


	public void setFeatures(List<String> features) {
		this.features = features;
	}
	
	
	public Set<Languages> getLanguage() {
		return language;
	}


	public void setLanguage(Set<Languages> language) {
		this.language = language;
	}


	public void displayDetails()
	{
		System.out.println(" Version ="+getVersion());
		System.out.println(" Name ="+getName());
		System.out.println("Type ="+getType());
		System.out.println("Price ="+getPrice());
		System.out.println("Features :");
		for(String feature:features)
		{
			System.out.println(feature);
		}
		
		System.out.println("Languages :");
		for(Languages languages:language)
		{
			System.out.println(languages.getName()+" -"+languages.getLcode());
		}
	}
}
