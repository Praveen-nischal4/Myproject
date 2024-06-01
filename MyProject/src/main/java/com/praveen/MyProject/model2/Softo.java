package com.praveen.MyProject.model2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.praveen.MyProject")
public class Softo {

	@Bean
	public static List<String> features()
	{
		return Arrays.asList("Updates","Graphical User Interface","Robust","LAng Supported");
	}
	
	@Bean
	public static Set<Languages> language()
	{
		Set<Languages> lang = new HashSet<Languages>();
		lang.add(new Languages("English",01));
		lang.add(new Languages("French",02));
		lang.add(new Languages("German",03));
		return lang;
	}
	
	
	@Bean(name="first")
	
	public static OSystem myos()
	{
		OSystem os = new OSystem();
		os.setVersion(7);
		os.setName("Windows XP");
		os.setType("32 bit");
		os.setPrice(15625.60);
		os.setFeatures(features());
		os.setLanguage(language());
		return os;
	}
	
	@Bean(name="second")
	@Primary
	public static OSystem myos1()
	{
		OSystem os = new OSystem();
		os.setVersion(10);
		os.setName("Windows");
		os.setType("64 bit");
		os.setPrice(19625.60);
		os.setFeatures(features());
		os.setLanguage(language());
		return os;
	}
	
	
}
