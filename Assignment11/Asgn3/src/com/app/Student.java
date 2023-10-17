package com.app;

public class Student {

	private int roll;
	private String name;
	private String city;
	private double marks;

	public Student() {

	}

	public Student(int roll, String name, String city, double marks) {
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public double getMarks() {
		return marks;
	}

	@Override
	public String toString() {

		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

}
