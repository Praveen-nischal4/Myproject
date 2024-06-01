package com.praveen.MyProject.model;

public class Employee {

	private int empid;
	private String ename;
	private double salary;
	private String address;	
	private Department dept;
	
	public Employee()
	{
		
	}	

	public Employee(int empid, String ename, double salary, String address, Department dept) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.address = address;
		this.dept = dept;
	}



	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + ", address=" + address
				+ ", dept=" + dept + "]";
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}



	public Department getDept() {
		return dept;
	}



	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
	public void displayDetails()
	{
		System.out.println("Employee Id :"+getEmpid());
		System.out.println("Employe Name : "+getEname());
		System.out.println("Employe Salary :"+getSalary());
		System.out.println("Employee Address :"+getAddress());
		System.out.println("Employee Department ID:"+getDept().getDeptid());
		System.out.println("Employee Department Name :"+getDept().getDname());
		System.out.println("Employee Department Grade :"+getDept().getGrade());
	}
}
