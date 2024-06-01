package com.praveen.MyProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private int rollno;
	private String sname;
	private String city;
	private String phno;
	
	private Course course;
	
	private List<String> subjects;
	
	public Student()
	{
		
	}
	@Autowired
	public Student(int rollno, String sname, String city, String phno, Course course,List<String> subjects) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.city = city;
		this.phno = phno;
		this.course = course;
		this.subjects =subjects;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", city=" + city + ", phno=" + phno + ", course="
				+ course + ", subjects=" + subjects + "]";
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	
	
	
	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
	public void printDetail()
	{
		System.out.println("Student Rolln :"+getRollno());
		System.out.println("Student Name  :"+getSname());
		System.out.println("Student City  :"+getCity());
		System.out.println("Student Phno  :"+getPhno());
		System.out.println("Student Course joined :"+getCourse().getCname());
		System.out.println("Student Course Id :"+getCourse().getCid());
		System.out.println("Student Course Fee :"+getCourse().getCfees());
		System.out.println("Duration : "+getCourse().getCduration());
		System.out.println("Subjects :");
		for(String subject :subjects)
		{
			System.out.println("-"+subject);
		}
	}
	
}
