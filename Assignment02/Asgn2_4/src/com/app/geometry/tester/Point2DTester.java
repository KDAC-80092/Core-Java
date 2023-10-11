package com.app.geometry.tester;
import java.util.*;

import com.app.geometry.Point2D;

public class Point2DTester {

	public static void main(String[] args) {
		double x1,y1,x2,y2;
		Scanner sc = new Scanner(System.in);
		
		//Take Input For First Point
		System.out.println("Enter x_axis for first coordinate.");
		x1 = sc.nextDouble();
		System.out.println("Enter y_axis for first coordinate.");
		y1 = sc.nextDouble();
		
		//Take Input For 2nd Point
		System.out.println("Enter x_axis for 2nd coordinate.");
		x2 = sc.nextDouble();
		System.out.println("Enter y_axis for 2nd coordinate.");
		y2 = sc.nextDouble();
		
		//creating two objects
		Point2D p1 = new Point2D(x1,y1);
		Point2D p2 = new Point2D(x2,y2);
		
		//Showing the details of Point 1 and Point 2
		System.out.println("Point 1 Details Are:" + p1.getDetails());
		System.out.println("Point 2 Details Are:" + p2.getDetails());
		
		// Checking for the condition if the points are at same distance or at other.
		if(p1.isEqual(p2))
		{
			System.out.println("Point of 1st Co-ordinate and Points of 2nd Co-ordinate are at same position.");
		}
		else
		{
			System.out.println("Point of 1st Co-ordinate and Points of 2nd Co-ordinate are at different position");
			System.out.println("Distance between the points is:" + p1.calculateDistance(p2));
		}
		
		
		sc.close();

	}

}
