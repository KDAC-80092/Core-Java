package com.app.fruits;

public class Mangoes extends Fruits {

	public Mangoes() {
		super("Mango");
		
	}
	
	public Mangoes(String color, double weight) {
        super("Mango", color, weight);
    }

	@Override
	public String Taste()
	{
		return "Sweet";
	}
	
	
	
}
