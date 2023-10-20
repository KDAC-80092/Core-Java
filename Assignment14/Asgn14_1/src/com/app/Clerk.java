package com.app;

public class Clerk implements Emp{

	private double salary;

	public Clerk() {
		
	}

	public Clerk(double salary) {
		this.salary = salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}
	
	@Override
	public double getSal() {
		return salary;
	}
	
	
//	Create another class Clerk (with ﬁeld salary) inherited from Emp interface. In this class override getSal() method (salary). Do
//	not override, calcIncentives() in Clerk class
	
}
