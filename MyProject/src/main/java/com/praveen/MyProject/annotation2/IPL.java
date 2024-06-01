package com.praveen.MyProject.annotation2;

public class IPL {

	private int edition;
	private int particountry;
	private String startmonth;
	public IPL() {
		super();
	}
	public IPL(int edition, int particountry, String startmonth) {
		super();
		this.edition = edition;
		this.particountry = particountry;
		this.startmonth = startmonth;
	}
	
	
	@Override
	public String toString() {
		return "IPL [edition=" + edition + ", particountry=" + particountry + ", startmonth=" + startmonth + "]";
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public int getParticountry() {
		return particountry;
	}
	public void setParticountry(int particountry) {
		this.particountry = particountry;
	}
	public String getStartmonth() {
		return startmonth;
	}
	public void setStartmonth(String startmonth) {
		this.startmonth = startmonth;
	}
	
	
}
