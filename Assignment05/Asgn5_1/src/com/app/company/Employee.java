//Q1. A company pays its employees on a weekly basis. The employees are of four types:
//Salaried employees are paid a fixed weekly salary regardless of the number of hours worked.
//Hourly employees are paid by the hour and receive overtime pay (i.e., 1.5 times their hourly salary
//rate) for all hours worked in excess of 40 hours.
//Commission employees are paid a percentage of their sales.
//Base-salaried commission employees receive a base salary plus a percentage of their sales.
//For the current pay period, the company has decided to reward salaried-commission employees by
//adding 10% to their base salaries. The company wants to write an application that performs its
//payroll calculations polymorphically.

package com.app.company;

import java.util.Scanner;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private int ssn;

	public Employee() {

	}

	public Employee(String firstName, String lastName, int ssn) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getSsn() {
		return ssn;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Name:");
		firstName = sc.next();

		System.out.print("Enter Last Name:");
		lastName = sc.next();

		System.out.print("Enter Social Security Number:");
		ssn = sc.nextInt();
		
//		sc.close();

	}

	abstract public void salaryCalculation();

	@Override
	public String toString() {
		return "Employee [FullName = " + firstName +" "+ lastName + ", SSN=" + ssn + "]";
	}

}
