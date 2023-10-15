//Q2. Copy the Point2D class , along with the package from previous assignment.
//a) Create a class "TestPointArray1.java" in "tester" package for the following
//b) Accept , how many no of points to plot from user.
//c) Create suitable data structure
//Hint : Point2D[] points=new Point2D[sc.nextInt()];
//d) Prompt user for x & y co ordinates n store the data suitably
//Hint : for loop
//e) Supply Menu to user with various Options like following
//1. Display details of a specific point
//User i/p : index
//O/p : x & y co-ordinates should be displayed. or error message(eg : Invalid index , pls retry!!!!)
//2) Display x, y co-ordinates of all points
//Hint : for-each
//3) User i/p : 2 indices for the points , validate the indices
//Display distance between specified points (iff they are not located at the same position)
//eg : sop("Enter index of strt point n end point");
//validation : boundary condition (0<=index<length-1)
//isEqual -- false --compute distance --display it.
//4. Exit


package com.app.point.tester;

import java.util.Scanner;

import com.app.point.Point2D;

public class TestPointArray1 {
	
	
	public static int menu()
	{
		int choice;
		System.out.println("**************************************");
		System.out.println("1.Display details of a specific point.");
		System.out.println("2.Display x, y co-ordinates of all points.");
		System.out.println("3.Display distance between specified points.");
		System.out.println("4.EXIT");
		System.out.println("**************************************");
		
		System.out.print("Enter Choice:");
		choice = new Scanner(System.in).nextInt();
		
		
		return choice;
	}

	public static void main(String[] args) {
		
		int choice;
		double x,y;
		int size;
		int index1,index2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number Of Points:");
		size = sc.nextInt();
		
		Point2D [] arr = new Point2D[size];
		
		for(int i = 0;i<size;i++)
		{
			System.out.println("Enter x_axis for "+(i+1)+" co-ordinate");
			x = sc.nextDouble();
			System.out.println("Enter y_axis for "+(i+1)+" co-ordinate");
			y = sc.nextDouble();
			arr[i] = new Point2D(x,y);		
		}
		
		while((choice = menu())!=0)
		{
			
			switch(choice)
			{
			
			case 1:
				
				System.out.print("Enter the point To Display The Value:");
				index1 = sc.nextInt();
				index1 = index1-1;
				if((index1>=0 && index1<size))
				{
					System.out.println("Point " + (index1+1) + " is:" + arr[index1].getDetails() );
				}
				else
				{
					System.out.println("Invalid co-ordinates.");
				}
				break;
				
			case 2:
				
				for(int i = 0;i<size;i++)
				{
					System.out.println("Point " +(i+1)+ " Details Are:" + arr[i].getDetails());
				}
				
				break;
				
			case 3:
				
				System.out.print("Enter the 1st value For Distance:");
				index1 = sc.nextInt();
				System.out.print("Enter the 2nd value For Distance:");
				index2 = sc.nextInt();
				index1 = index1-1;
				index2 = index2-1;
				
				if((index1>=0 && index1<size) && (index2>=0 && index2<size))
				{
					if(arr[index1].isEqual(arr[index2]))
					{
						System.out.println("Points of " +(index1+1)+ " Co-ordinate and Points of " +(index2+1)+ " Co-ordinate are at same position.");
					}
					else
					{
						System.out.println("Distance between " +(index1+1) + " & " + (index2+1) + " points is:" + arr[index1].calculateDistance(arr[index2]));
					}
				}
				else
				{
					System.out.println("Invalid co-ordinates.");
				}
				
				break;
				
			case 4:
				
				System.out.println("Thank You For Using Our App...........<>......");
				
				break;
				
			default:
				System.out.println("Invalid Choice................)");
				break;
				
			}
			
			if(choice == 4)
			{
				break;
			}
		
		}
		

	}

}
