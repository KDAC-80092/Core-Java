package com.app.company;

import java.util.*;

public class SalariedEmployee extends Employee {

	private double weeklySalary;

	public SalariedEmployee() {

	}

	public SalariedEmployee(String firstName, String lastName, int ssn, double weeklySalary) {
		super(firstName, lastName, ssn);
		this.weeklySalary = weeklySalary;

	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}
	
	
	@Override
	public void accept() {
//		super.accept();
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Your Weekly Salary is: ");
		this.weeklySalary = s.nextDouble(); 
		
//		s.close();
		
	}
	
	@Override
	public double salaryCalculation() {
		
		return weeklySalary;
		
	}

	@Override
	public String toString() {
		return "Salaried Employee [weeklySalary=" + weeklySalary + ", " + super.toString() + "]";
	}




}
