package com.praveen.MyProject.autowirexml;

public class Department {

	private String dname;
	private String ceo;
	
	public Department() {
		super();
	}

	public Department(String dname, String ceo) {
		super();
		this.dname = dname;
		this.ceo = ceo;
	}

	@Override
	public String toString() {
		return "Department [dname=" + dname + ", ceo=" + ceo + "]";
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	
	
}
