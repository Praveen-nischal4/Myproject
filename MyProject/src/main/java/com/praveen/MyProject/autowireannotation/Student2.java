// field injection using autowired

package com.praveen.MyProject.autowireannotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Student2 {

	private String name;
	private int rollno;
	private String grade;
	private int rank;
	
	@Autowired
	private School school;
	
	
	public Student2() {
		super();
	}
	
	public Student2(String name, int rollno, String grade, int rank) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.grade = grade;
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return "Student2 [name=" + name + ", rollno=" + rollno + ", grade=" + grade + ", rank=" + rank + ", school="
				+ school + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}
	
	
}
