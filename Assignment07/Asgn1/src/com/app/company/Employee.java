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

	abstract public double salaryCalculation();

	@Override
	public String toString() {
		return "Employee [FullName = " + firstName +" "+ lastName + ", SSN=" + ssn + "]";
	}

}