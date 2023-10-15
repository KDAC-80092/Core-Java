package com.app.fruits;

public class Apples extends Fruits {

	public Apples() {
		
		super("Apple");	
	}
	
	public Apples(String color, double weight) {
        super("Apple", color, weight);
	}
	
	
	@Override
	public String Taste()
	{
		return "Sweet 'n' Sour.";
	}
	
	

	
	
}
