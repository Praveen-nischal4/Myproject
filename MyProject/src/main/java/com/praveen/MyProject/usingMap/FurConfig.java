package com.praveen.MyProject.usingMap;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class FurConfig {

	@Bean
	public static Furniture myFurniture()
	{
		Furniture f = new Furniture();
		f.setColor("Brown");
		f.setName("Sofa");
		f.setPrice(50265.65);
		f.setFeatures(features());
		return f;
	}
	
	@Bean
	public static Map<String,String> features()
	{
		Map<String,String> features = new HashMap<String, String>();
		features.put("IsComfortable", "Yes");
		features.put("Durable", "Yes");
		features.put("Soft","So Soft");
		return features;
	}
}
