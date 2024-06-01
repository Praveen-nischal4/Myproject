package com.praveen.MyProject.demo;

import java.util.List;
import java.util.Map;

public class Teacher {

	private String tid;
	private String name;
	private String mobile;
	
	private List<String> Qualification;
	private Map<String,String> Subject;
	public Teacher() {
		super();
	}

	public Teacher(String tid, String name, String mobile,List<String> Qualification,Map<String,String> Subject) {
		super();
		this.tid = tid;
		this.name = name;
		this.mobile = mobile;
		this.Qualification=Qualification;
		this.Subject=Subject;
	}

	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", name=" + name + ", mobile=" + mobile + ", Qualification=" + Qualification
				+ ", Subject=" + Subject + "]";
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public List<String> getQualification() {
		return Qualification;
	}

	public void setQualification(List<String> qualification) {
		Qualification = qualification;
	}

	public Map<String, String> getSubject() {
		return Subject;
	}

	public void setSubject(Map<String, String> subject) {
		Subject = subject;
	}
	
	
}
