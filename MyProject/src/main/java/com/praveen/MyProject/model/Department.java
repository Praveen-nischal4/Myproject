package com.praveen.MyProject.model;

public class Department {

	private int deptid;
	private String dname;
	private String grade;
	
	public Department()
	{
		
	}
	
	public Department(int deptid, String dname, String grade) {
		super();
		this.deptid = deptid;
		this.dname = dname;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", dname=" + dname + ", grade=" + grade + "]";
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
