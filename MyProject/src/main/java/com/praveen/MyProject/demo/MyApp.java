package com.praveen.MyProject.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

     
		ApplicationContext context = new ClassPathXmlApplicationContext("com/praveen/MyProject/demo/MyConfig.xml");
		
		Teacher t = context.getBean("myTea",Teacher.class);
		System.out.println(t);

	}

}
