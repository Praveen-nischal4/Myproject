package com.praveen.MyProject.autowireannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mySecMain {

	public static void main(String[] args) {

 ApplicationContext context = new AnnotationConfigApplicationContext(dfbean.class);
 
 Student2 ss = context.getBean("myStudent",Student2.class);
System.out.println("Name :"+ss.getName());
System.out.println("Rollno  :"+ss.getRollno());
System.out.println("Grade :"+ss.getGrade());
System.out.println("Rank :"+ss.getRank());
System.out.println("School Name : "+ss.getSchool().getSname());
System.out.println("School Address :"+ss.getSchool().getAddress());
System.out.println("School Id :"+ss.getSchool().getSid());
System.out.println("");
	}

}
