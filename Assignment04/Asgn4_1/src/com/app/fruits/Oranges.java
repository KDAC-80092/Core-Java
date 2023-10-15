package com.app.fruits;

public class Oranges extends Fruits {

	public Oranges() {
		super("Oranges");
		
	}
	
	public Oranges(String color, double weight) {
        super("Oranges", color, weight);
	}
	
	@Override
	public String Taste()
	{
		return "Sour";
	}

	
	
}
