//Q2. Create a class called Employee that includes three fields—a first name (type String), a last
//name (type String) and a monthly salary (double). Provide a constructor that initializes the three
//instance variables. Provide a set and a get method for each instance variable. If the monthly salary
//is not positive, do not set its value. Write a test application named EmployeeTest that demonstrates
//class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary.
//Then give each Employee a 10% raise and display each Employee’s yearly salary again.

package Q2;

import java.util.Scanner;

public class Employee {

	private String firstName;
	private String lastName;
	private double monthSalary;
	public Employee() {
		this("","",0.0);
	}
	
	public Employee(String firstName, String lastName, double monthSalary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthSalary = monthSalary;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMonthSalary(double monthSalary) {
		this.monthSalary = monthSalary;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public double getMonthSalary() {
		return monthSalary;
	}
	
	public void acceptEmployee()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Name:");
		firstName = sc.nextLine();
		
		System.out.print("Enter Last Name:");
		lastName = sc.nextLine();
		
		System.out.print("Enter Monthly Salary:");
		monthSalary = sc.nextDouble();
		
	}
	
	private double yearSalary()
	{
		return monthSalary*12;
	}
	
	private double increaseSalary()
	{
		return ((monthSalary*12)+monthSalary*12*0.10);
	}
	
	public void displayEmployee()
	{
		if(monthSalary>0)
		{
			System.out.println("Your Name is: " + firstName+" "+ lastName);
//			System.out.println("Last Name is:" + lastName);
			System.out.println("Yearly Salary is:" + yearSalary());
			System.out.println("Now You Upadated Salary is:" + increaseSalary()/12);
		}
		else
		{
			System.out.println("Salary CanNot Be Negative!.");
		}
	}
	
	
	
	
}
