package com.app.company.test;

import com.app.company.*;


class Box<T extends Employee>
{
	private T obj;
	
	
	
	public Box() {
		
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}



	public double getTotalSalary()
	{
		return obj.salaryCalculation();
	}
	
	public void setSalary()
	{
		obj.accept();
	}
	
	
}

public class CompanyTest {

	public static void main(String[] args) {
		
		Box<Employee> b1;
		b1 = new Box<>();
		//b1.setSalary(new CommissionEmployee());
		b1.setObj(new CommissionEmployee());
		b1.setSalary();
		System.out.println("Salary is: " + b1.getTotalSalary());
		
//		b1.setObj(new SalariedEmployee());
//		b1.setSalary();
//		System.out.println(b1.getTotalSalary());
		
		System.out.println("*******************************************");
		Box<Employee> b2 = new Box<>();
		b2.setObj(new SalariedEmployee());
		b2.setSalary();
		System.out.println(b2.getTotalSalary());
		

	}

}
