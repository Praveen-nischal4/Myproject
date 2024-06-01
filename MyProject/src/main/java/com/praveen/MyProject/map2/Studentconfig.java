package com.praveen.MyProject.map2;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Studentconfig {
	
	@Bean
	public static Map<String,Grade> grades()
	{
		Map<String,Grade> grades = new HashMap<String, Grade>();
		grades.put("Raju", gradeA());
		grades.put("Farheen", gradeB());
		grades.put("Parul", gradeC());
		grades.put("Rajesh", gradeD());
		return grades;
	}
	

	@Bean
	public static Grade gradeA()
	{
		Grade grade = new Grade();
		grade.setScore(95);
		grade.setLetter("A");
		return grade;
	}
	
	@Bean
	public static Grade gradeB()
	{
		Grade grade = new Grade();
		grade.setScore(65);
		grade.setLetter("B");
		return grade;
	}
	
	@Bean
	public static Grade gradeC()
	{
		Grade grade = new Grade();
		grade.setScore(45);
		grade.setLetter("C");
		return grade;
	}
	
	@Bean
	public static Grade gradeD()
	{
		Grade grade = new Grade();
		grade.setScore(39);
		grade.setLetter("D");
		return grade;
	}
}
