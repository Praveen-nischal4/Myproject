package com.praveen.MyProject.map2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

	public static void main(String[] args) {

  ApplicationContext context = new AnnotationConfigApplicationContext(Studentconfig.class);
  
  Studentconfig s = context.getBean(Studentconfig.class);
  System.out.println(s.grades());

	}

}
