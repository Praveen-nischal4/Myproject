package com.praveen.MyProject.autowireannotation;

import org.springframework.stereotype.Component;

@Component
public class Person {

	private String myname;
	private String city;
	private String email;
	public Person() {
		super();
	}
	public Person(String myname, String city, String email) {
		super();
		this.myname = myname;
		this.city = city;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Person [myname=" + myname + ", city=" + city + ", email=" + email + "]";
	}
	public String getMyname() {
		return myname;
	}
	public void setMyname(String myname) {
		this.myname = myname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
