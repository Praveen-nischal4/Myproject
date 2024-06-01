package com.praveen.MyProject.autowirexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/praveen/MyProject/autowirexml/myConfig.xml");
		
		Employee em = context.getBean("emp",Employee.class);
        System.out.println(em);	
	
		Employee em2 = context.getBean("emp2",Employee.class);
		System.out.println(em2);
		
		Employee em3 = context.getBean("emp3",Employee.class);
		System.out.println(em3);

	}

}
