package com.praveen.MyProject.autowireannotation;

import org.springframework.stereotype.Component;

@Component
public class School {

	private int sid;
	private String sname;
	private String address;
	public School() {
		super();
	}
	public School(int sid, String sname, String address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}
	@Override
	public String toString() {
		return "School [sid=" + sid + ", sname=" + sname + ", address=" + address + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
