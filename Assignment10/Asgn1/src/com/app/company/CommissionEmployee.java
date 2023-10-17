package com.app.company;

import java.util.Scanner;

public class CommissionEmployee extends Employee {

	private double grossSales;
	double commissionRate;
	
	
	
	
	public CommissionEmployee() {
		super();
		
	}
	


	public CommissionEmployee(String firstName, String lastName, int ssn,double grossSales, double commissionRate) {
		super(firstName, lastName, ssn);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	

	
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}



	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}



	public double getGrossSales() {
		return grossSales;
	}



	public double getCommissionRate() {
		return commissionRate;
	}



	@Override
	public void accept() {
//		super.accept();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Gross Sales:");
		grossSales = sc.nextDouble();
		System.out.print("Enter Commission Rate:");
		commissionRate = sc.nextDouble();
		
//		sc.close();
	}



	@Override
	public double salaryCalculation() {
		
		return (commissionRate * grossSales);
		
	}



	@Override
	public String toString() {
		return "CommissionEmployee [grossSales=" + grossSales + ", commissionRate=" + commissionRate + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
