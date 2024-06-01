package com.praveen.MyProject.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/praveen/MyProject/model/myConfig.xml");
		
		Employee e = context.getBean("emp",Employee.class);
		System.out.println(e);
		e.displayDetails();
	}

}
