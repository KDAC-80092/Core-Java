package com.app.tester;

//import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

import com.app.Student;

public class StudentTest {

	public static void main(String[] args) {
		
		Map<Integer,Student> map = new LinkedHashMap<>();
		Student s;
		
		int choice;
		
		do
		{
			System.out.println("********************************");
			System.out.println("0.Exit.");
			System.out.println("1.Add Student.");
			System.out.println("2.Find A Student.");
			System.out.println("3.Display All.");
			System.out.print("Enter Choice:");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			
			System.out.println("********************************");
			
			switch (choice) {
			case 1: // Add Student
				s = new Student();
				s.accept();
				map.put(s.getRoll(), s);
				
				
				break;
				
			case 2: // Find Student
				
				System.out.print("Enter Roll Number To Find:");
				Integer roll = sc.nextInt();
				
				Student s1 = map.get(roll);
				if(s1 != null)
					System.out.println(s1);
				else
					System.out.println("Not Valid Roll Number.");
				
				
				
				break;
			case 3:	// Display All
				
				Set<Entry<Integer,Student>> entries = map.entrySet();
				
				for(Entry<Integer,Student> entry : entries)
					System.out.println(entry.getValue());
				
				break;
				
			default: // Default
				
				if(choice == 0)
					break;
				
				System.out.println("Wrong! Choice....................");
				break;
			}
			
		}while(choice != 0);
		
		System.out.println("Thank You for Using Our App.........................:)");

	}

}
