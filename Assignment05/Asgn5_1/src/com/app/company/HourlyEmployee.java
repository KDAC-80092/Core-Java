package com.app.company;

import java.util.Scanner;

public class HourlyEmployee extends Employee {

	double wage;
	double hours;
	
	
	
	public HourlyEmployee() {
		super("","",0);
		this.wage = 0;
		this.hours = 0;
		
	}



	public HourlyEmployee(String firstName, String lastName, int ssn, double wage, double hours) {
		super(firstName, lastName, ssn);
		this.wage = wage;
		this.hours = hours;
		
	}
	
	
	@Override
	public void accept() 
	{
		super.accept();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Hourly Wage:");
		this.wage = sc.nextDouble();
		
		System.out.print("Enter Hours Worked:");
		this.hours =sc.nextDouble();
		
//		sc.close();
		
	}

	

	@Override
	public void salaryCalculation() 
	{
		if(hours <= 40)
		{
			System.out.println("Salary is: " + wage*hours);
		}
		else if(hours>40)
		{
			System.out.println("Salary is: " + (40*wage)+(hours-40)*(wage*1.5));
		}
		
	}



	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + ", hours=" + hours + ", toString() = " + super.toString() + "]";
	}
	
	
	
}
