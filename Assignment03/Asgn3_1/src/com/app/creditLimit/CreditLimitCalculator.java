//Q1. (Credit Limit Calculator)
//Develop a Java application that determines whether any of several department-store customers has
//exceeded the credit limit on a charge account.
//For each customer,the following facts are available:
//a) account number
//b) balance at the beginning of the month
//c) total of all items charged by the customer this month
//d) total of all credits applied to the customer’s account this month
//e) allowed credit limit.
//The program should input all these facts as integers, calculate the new balance (= beginning
//balance+ charges – credits), display the new balance and determine whether the new balance
//exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the
//program should display the message "Credit limit exceeded".




package com.app.creditLimit;

import java.util.Scanner;

public class CreditLimitCalculator {
	
	int accno;
	int beginningBalance;
	int monthCharges;
	int creditsApplied;
	int creditLimit;
	public CreditLimitCalculator() {
		this(0,0,0,0,0);
	}
	public CreditLimitCalculator(int accno, int beginningBalance, int monthCharges, int creditsApplied, int creditLimit) {
		
		this.accno = accno;
		this.beginningBalance = beginningBalance;
		this.monthCharges = monthCharges;
		this.creditsApplied = creditsApplied;
		this.creditLimit = creditLimit;
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account Number:");
		accno = sc.nextInt();
		
		System.out.println("balance At the Beginning of the Month:");
		beginningBalance = sc.nextInt();
		
		System.out.println("Enter Monthly Charges:");
		monthCharges = sc.nextInt();
		
		System.out.println("Total of All Credits Applied to the Account this Month:");
		creditsApplied = sc.nextInt();
		
		System.out.println("Allowed Credit Limit:");
		creditLimit = sc.nextInt();
	}
	
	private int calculate()
	{
		return (beginningBalance + monthCharges - creditsApplied);
	}
	
	public void display()
	{
		if(calculate() >= creditLimit)
		{
			System.out.println("Credit Limit Exceeded! Please Pay the Bill First.");
		}
		else
		{
			System.out.println("Your New Balance(Unbillable Spends) To pay The Bill is:" + calculate());
		}
	}
	
}
