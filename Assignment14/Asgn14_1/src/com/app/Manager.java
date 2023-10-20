package com.app;

public class Manager implements Emp{

	private double basicSalary;
	private double dearanceAllowance;
	
	public Manager() {
		
	}
	

	public Manager(double basicSalary, double dearanceAllowance) {
		super();
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}



	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}


	public void setDearanceAllowance(double dearanceAllowance) {
		this.dearanceAllowance = dearanceAllowance;
	}
	
	
	public double getBasicSalary() {
		return basicSalary;
	}


	public double getDearanceAllowance() {
		return dearanceAllowance;
	}


	@Override
	public double getSal() {
		return (basicSalary+dearanceAllowance);
	}
	
	@Override
	public double calcIncentives() {
		double incentive;
		incentive = (basicSalary+(basicSalary*0.20));
		return incentive;
	}
	
	@Override
	public String toString()
	{
		return "["+"Basic Salary = " + basicSalary +", Dearance Allowance = "+dearanceAllowance+"]";
	}
	
	
}
