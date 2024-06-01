package com.praveen.MyProject.usingMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

	public static void main(String[] args) {

    ApplicationContext context = new AnnotationConfigApplicationContext(FurConfig.class);
    
    Furniture ft = context.getBean(Furniture.class);
    System.out.println(ft);
    ft.printDetail();
	}

}
