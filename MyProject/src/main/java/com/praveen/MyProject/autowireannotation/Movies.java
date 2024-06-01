//when @Autowired is used on a constructor, it's known as constructor injection
//When @Autowired is used on a property like private Person person, it is called field injection
//You can also use @Autowired on setter methods. This is called setter injection. 
// means  When Spring sees @Autowired on a setter method, it will use that method to inject the dependency.

package com.praveen.MyProject.autowireannotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Movies {

	private String moviename;
	private String hero;
	private double ticketsprize;
	
	
	private Person person;
	
	public Movies() {
		super();
	}

	
	public Movies(String moviename, String hero, double ticketsprize) {
		super();
		this.moviename = moviename;
		this.hero = hero;
		this.ticketsprize = ticketsprize;
		
	}

	@Override
	public String toString() {
		return "Movies [moviename=" + moviename + ", hero=" + hero + ", ticketsprize=" + ticketsprize + ", person="
				+ person + "]";
	}

	

	

	public String getMoviename() {
		return moviename;
	}


	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}


	public String getHero() {
		return hero;
	}

	public void setHero(String hero) {
		this.hero = hero;
	}

	public double getTicketsprize() {
		return ticketsprize;
	}

	public void setTicketsprize(double ticketsprize) {
		this.ticketsprize = ticketsprize;
	}

	public Person getPerson() {
		return person;
	}
	
	@Autowired                                        //setter injection
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
