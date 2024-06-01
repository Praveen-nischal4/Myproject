package com.praveen.MyProject.model2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Softo.class);
		OSystem ostym = context.getBean("second",OSystem.class);
		System.out.println(ostym);
		
		ostym.displayDetails();

	}

}
