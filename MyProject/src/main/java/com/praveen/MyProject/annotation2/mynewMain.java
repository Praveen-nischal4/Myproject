package com.praveen.MyProject.annotation2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mynewMain {

	public static void main(String[] args) {

ApplicationContext context = new AnnotationConfigApplicationContext(crickConfig.class);

Cricket cc = context.getBean("cricket",Cricket.class);
System.out.println(cc);



	}

}
