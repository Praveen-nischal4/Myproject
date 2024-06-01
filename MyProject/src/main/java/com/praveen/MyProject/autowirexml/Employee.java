package com.praveen.MyProject.autowirexml;

public class Employee {

	private int empid;
	private String empname;
	private String email;
	private double salary;
	private Department department;
	
	public Employee() {
		super();
	}

	public Employee(Department department)    //byname check this department argument in constructor ie  its written department so we take that 
	{
		this.department=department;
	}
	public Employee(int empid, String empname, String email, double salary,Department department) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.email = email;
		this.salary = salary;
		this.department=department;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", email=" + email + ", salary=" + salary
				+ ", department=" + department + "]";
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
