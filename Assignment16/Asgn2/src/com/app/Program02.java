package com.app;

import java.util.List;
import java.util.Scanner;

public class Program02 {

	public static int menu()
	{
		Scanner s = new Scanner(System.in);
		int choice;
		
		System.out.println("**************************************************************");
		System.out.println("0.Exit. ");
		System.out.println("1.Insert. ");
		System.out.println("2.Update. ");
		System.out.println("3.Delete. ");
		System.out.println("4.Display All. ");
		
		System.out.println("**************************************************************");
		System.out.print("Enter Choice:");
		choice  = s.nextInt();
		
		System.out.println("**************************************************************");
		return choice;

	}
	
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int choice;
		User u = new User();
		int cnt;
		
		while((choice = menu()) != 0 )
		{
			switch (choice) 
			{
			case 1:	// Add User
				
				try(UserDAO udao = new UserDAO())
				{
					u.accept();
					cnt = udao.addUser(u);
					System.out.println("Row Inserted: "+ cnt);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				break;
				
			case 2: // Update
				
				try(UserDAO udao = new UserDAO())
				{
					System.out.print("Enter id to update the record:");
					int id = sc.nextInt();
					
					System.out.print("Enter First Name To Update The Record:");
					String fname = sc.next();
					
					System.out.print("Enter First Name To Update The Record:");
					String lname = sc.next();
					
					u.setFname(fname);
					u.setLname(lname);
					u.setId(id);
					
					cnt = udao.updateUser(u);
					System.out.println("Row Updated: "+ cnt);
					
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				break;
				
				
			case 3: // Delete
				
				try(UserDAO udao = new UserDAO())
				{
					System.out.print("Enter ID to be Deleted:");
					int id = sc.nextInt();
					
					cnt = udao.deleteUser(id);
					System.out.println("Row Deleted: "+cnt);
				}
				
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				break;
				
			case 4: // Display All
				
				try(UserDAO udao = new UserDAO())
				{
					List<User> list = udao.displayAll();
//					list.forEach(c -> System.out.println(c));
					for (User u1 : list) {
						System.out.println(u1);
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				
				break;

			default:
				
				System.out.println("Wrong! Choice..........:(");
				break;
			}
				
		}
		
		System.out.println("Thank You>>>>>)");

	}

}
