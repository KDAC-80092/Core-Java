package com.app;

public class Person implements Displayable {

	private String name;
	private int age;
	
	
	

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public void show() {
		
		

	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", toString()=" + "]";
	}
	
	

}
