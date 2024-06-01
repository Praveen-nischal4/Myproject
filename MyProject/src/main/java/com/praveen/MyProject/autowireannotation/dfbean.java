

package com.praveen.MyProject.autowireannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.praveen.MyProject")
public class dfbean {

	
	@Bean
	public static School school()
	{
		School sc = new School();
		sc.setSid(456);
		sc.setSname("Bishop jhonson School");
		sc.setAddress("Prayagraj");
		return sc;
	}
	
	
	@Bean
    public static Student2 myStudent()
    {
    	Student2 s = new Student2();
    	s.setName("Raju");
    	s.setRollno(3);
    	s.setGrade("A");
    	s.setRank(2);
    	
    	
    	
    	return s;
    }
	
}
