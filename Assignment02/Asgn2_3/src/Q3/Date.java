//Q3. Create a class called Date that includes three fields—a month (type int), a day (type int) and a
//year (type int). Provide a constructor that initializes the three instance variables and assumes that
//the values provided are correct. Provide a set and a get method for each instance
//variable. Provide a method displayDate that displays the month, day and year separated by forward
//slashes (/). Write a test application named DateTest that demonstrates class Date’s capabilities.


package Q3;

import java.util.Scanner;

public class Date {

	private int day;
	private int month;
	private int year;
	public Date() {
		this(01,01,1970);
	}
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	
	
	public void acceptDate()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Day:");
		day = sc.nextInt();
		
		System.out.print("Enter Month:");
		month = sc.nextInt();
		
		System.out.print("Enter Year:");
		year = sc.nextInt();
		
		
	}
	
	public void displayDate()
	{
		System.out.println("Date is: " + day + "/" + month + "/" + year);
	}
	
	
}
