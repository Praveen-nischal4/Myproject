package com.praveen.MyProject;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.praveen.MyProject")
public class StuConfi {

	
	@Bean
	public static Course myCourse()
	{	
		//Course c = new Course();
		//c.setCid(100);
		//c.setCname("MCA");
		//c.setCduration(36);
		//c.setCfees(12500.63);
		
		return new Course(100,"MCA",36,12560.45);
	}
	
	
	@Bean
	public static List<String> subjects()
	{
		return Arrays.asList("Maths","Physics","Chemistry");
	}
	
	
	@Bean
	public static Student myStudent()
	{
		Student s = new Student();
		s.setRollno(2);
		s.setSname("Monika");
		s.setCity("Prayagraj");
		s.setPhno("7007425611");
		s.setCourse(myCourse());
		s.setSubjects(subjects());
		return s;
		
	}
	
	
	
}
