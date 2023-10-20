package com.app.test;

import com.app.*;

public class Program01 {

	public static void main(String[] args) {
		Emp [] arr = new Emp[3];
		arr[0] = new Manager(5000,800);
		arr[1] = new Labor(300,400);
		arr[2] = new Clerk(20000);
		
		double totalSal = Emp.calcTotalIncome(arr);
		System.out.println("Total Salary is: " + totalSal);

	}
}
