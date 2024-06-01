package com.praveen.MyProject.map2;

public class Grade {

	private int score;
	private String letter;
	
	public Grade()
	{
		
	}
	public Grade(int score, String letter) {
		super();
		this.score = score;
		this.letter = letter;
	}
	
	@Override
	public String toString() {
		return "Grade [score=" + score + ", letter=" + letter + "]";
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getLetter() {
		return letter;
	}
	public void setLetter(String letter) {
		this.letter = letter;
	}
	
	
}
