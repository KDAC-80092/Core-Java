package com.app;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class Program03 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[2];
		for(int i = 0;i<2;i++)
		{
			int roll;
			String name;
			String city;
			double marks;
			System.out.print("Enter roll:");
			roll = sc.nextInt();
			
			System.out.print("Enter Name:");
			name = sc.next();
			
			System.out.print("Enter City:");
			city = sc.next();
			
			System.out.print("Enter marks:");
			marks = sc.nextDouble();
			
			
			
			arr[i] = new Student(roll,name,city,marks);
		}
		
//		System.out.println("Before Sort:");
//		for(Student s : arr)
//			System.out.println(s);
//		
//		//sort by marks -- Comparable
//		
//		Arrays.sort(arr);
//		
//		System.out.println("After Sort:");
//		for(Student s : arr)
//			System.out.println(s);
		
		
		class StudentCityMarksName implements Comparator<Student>
		{
			@Override
			public int compare(Student s1, Student s2) {
				int diff = - s1.getCity().compareTo(s2.getCity());
				if(diff == 0)
				{
					diff = - Double.compare(s1.getMarks(),s2.getMarks());
				}
				if(diff == 0)
				{
					diff = s1.getName().compareTo(s2.getName());
				}
				return diff;
			}
		}
		
		StudentCityMarksName scmn = new StudentCityMarksName();
		Arrays.sort(arr,scmn);
		
		System.out.println("After Sorting by City,Marks,Name:");
		for(Student s : arr)
		{
			System.out.println(s);
		}
		
		
	}

}
