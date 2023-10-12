//Q3. Create an application that calculates your daily driving cost, so that you can estimate how much
//money could be saved by car pooling, which also has other advantages such as reducing carbon
//emissions and reducing traffic congestion. The application should input the following information
//and display the user’s cost per day of driving to work:
//a) Total miles driven per day.
//b) Cost per gallon of gasoline.
//c) Average miles per gallon.
//d) Parking fees per day.
//e) Tolls per day.


package com.app.drivingCost;

import java.util.Scanner;

public class DailyDrivingCost 
{
	private int miles;
	private int gallon;
	private double avg;
	private int parkingFee;
	private int toll;
	
	public DailyDrivingCost() 
	{
		this(0,0,0,0,0);
	}

	public DailyDrivingCost(int miles, int gallon, double avg, int parkingFee, int toll) {
		this.miles = miles;
		this.gallon = gallon;
		this.avg = avg;
		this.parkingFee = parkingFee;
		this.toll = toll;
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Miles per Day:");
		miles = sc.nextInt();
		
		System.out.println("Enter Gallon:");
		gallon = sc.nextInt();
		
		System.out.println("Enter Average of a Vehicle:");
		avg = sc.nextDouble();
		
		System.out.println("Enter Parking Fee:");
		parkingFee = sc.nextInt();
		
		System.out.println("Enter Toll:");
		toll = sc.nextInt();
		
	}
	
	public void display()
	{
		double calculate;
		calculate = ((miles/avg)*gallon+(parkingFee+toll));
		
		System.out.println("Your Charges Per Day will Be:" + calculate);
	}
	
	
	
	

	
	
}
