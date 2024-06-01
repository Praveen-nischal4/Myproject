package com.praveen.MyProject;

public class Course {

	private int cid;
	private String cname;
	private int cduration;
	private double cfees;
	
	public Course()
	{
		
	}
	public Course(int cid, String cname, int cduration, double cfees) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cduration = cduration;
		this.cfees = cfees;
	}
	
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cduration=" + cduration + ", cfees=" + cfees + "]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCduration() {
		return cduration;
	}
	public void setCduration(int cduration) {
		this.cduration = cduration;
	}
	public double getCfees() {
		return cfees;
	}
	public void setCfees(double cfees) {
		this.cfees = cfees;
	}
	
	
	
}
