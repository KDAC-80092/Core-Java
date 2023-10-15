package com.app.company;

import java.util.Scanner;

public class BasePlusCommissionEmployee extends Employee {

	private double grossSales;
	private double commissionRate;
	private double baseSalary;
	
	
	public BasePlusCommissionEmployee() {
		super("","",0);
		this.grossSales = 0.0;
		this.commissionRate = 0.0;
		this.baseSalary = 0.0;
	}



	public BasePlusCommissionEmployee(String firstName, String lastName, int ssn,double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, ssn);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		this.baseSalary = baseSalary;
	}
	
	@Override
	public void accept() {
		super.accept();
		Scanner sc  = new Scanner(System.in);
		
		grossSales = sc.nextDouble();
		commissionRate = sc.nextDouble();
		baseSalary = sc.nextDouble();
	}
	
	
	@Override
	public void salaryCalculation() {
		
		System.out.println("Your Base + Commission is:" + ((commissionRate * grossSales)+ baseSalary));

	}



	@Override
	public String toString() {
		return "BasePlusCommissionEmployee [grossSales=" + grossSales + ", commissionRate=" + commissionRate
				+ ", baseSalary=" + baseSalary + ", toString()=" + super.toString() + "]";
	}
	

	

}
