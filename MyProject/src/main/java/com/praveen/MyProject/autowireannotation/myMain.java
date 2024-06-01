package com.praveen.MyProject.autowireannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class myMain {

	public static void main(String[] args) {

    ApplicationContext context = new AnnotationConfigApplicationContext(myConfig2.class);
    
   Movies mm = (Movies) context.getBean("myMovies");
   System.out.println(mm);
    System.out.println("Movie Name ="+mm.getMoviename());
   System.out.println(" Hero ="+mm.getHero());
   System.out.println(" Ticket Prize ="+mm.getTicketsprize());
    System.out.println("Person Name : "+mm.getPerson().getMyname());
     System.out.println("City ="+mm.getPerson().getCity());
     System.out.println("Email ="+mm.getPerson().getEmail());
     
    
    
	}

}
