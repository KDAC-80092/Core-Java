package com.app.company.test;

import com.app.company.*;

public class CompanyTester {

	public static void main(String[] args) {
		
		Employee employee;
		employee = new SalariedEmployee();
		employee.accept();
		
		System.out.println("************************************************");
		
		System.out.println(employee.toString());
		employee.salaryCalculation();
		
		System.out.println("************************************************");
		employee = new HourlyEmployee();
		employee.accept();
		
		System.out.println("************************************************");
		System.out.println(employee.toString());
		employee.salaryCalculation();
		
		System.out.println("************************************************");
		
		employee = new CommissionEmployee();
		employee.accept();
		System.out.println("************************************************");
		System.out.println(employee.toString());
		employee.salaryCalculation();
		
		System.out.println("************************************************");
		employee.accept();
		System.out.println("************************************************");
		System.out.println(employee.toString());
		employee.salaryCalculation();
		
		
	}

}
