package com.praveen.MyProject.model2;

public class Languages {

	private String name;
	private int lcode;
	
	public Languages() {
		super();
	}

	public Languages(String name, int lcode) {
		super();
		this.name = name;
		this.lcode = lcode;
	}

	@Override
	public String toString() {
		return "Languages [name=" + name + ", lcode=" + lcode + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLcode() {
		return lcode;
	}

	public void setLcode(int lcode) {
		this.lcode = lcode;
	}
	
	
	
}
