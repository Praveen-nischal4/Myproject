package com.praveen.MyProject.Mapboth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

	public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Vehicle vv = context.getBean("myVehicle", Vehicle.class);
        System.out.println(vv);
        vv.printDetail();
    
	}

}
