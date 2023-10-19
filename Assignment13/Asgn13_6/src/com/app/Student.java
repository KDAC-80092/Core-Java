package com.app;

import java.util.Objects;
import java.util.Scanner;

public class Student {
	int roll;
	String name;
	public Student() {
		
	}
	
	public Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Roll Number:");
		roll = sc.nextInt();
		
		System.out.print("Enter Name:");
		sc.nextLine();
		name = sc.nextLine();
	}
	
	
	public int hashCode()
	{
		int hash = Objects.hash(this.roll);
		return hash;
	}
	
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(obj instanceof Student) {
			Student other = (Student) obj;
			if(this.roll == other.roll)
				return true;
		}
		return false;
			
	}
	
	@Override
	public String toString()
	{
		return "[ Roll = " + roll + ", Name = " + name + "]" ;
	}
	
	
	
	

	
}
