package com.app.tester;

import java.util.*;

import com.app.Employee;



public class EmployeeListTester {
	
	public static int menu() {
		Scanner sc = new Scanner(System.in);

			int choice;
			System.out.println("************************************");
			System.out.println("0.EXIT.");
			System.out.println("1.Add.");
			System.out.println("2.Delete.");
			System.out.println("3.Find.");
			System.out.println("4.Sort.");
			System.out.println("5.Edit.");

			System.out.println("************************************");
			System.out.print("Enter Choice:");
			choice = sc.nextInt();
			
			System.out.println("************************************");
			
			return choice;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		Employee e;
		List<Employee> list = new LinkedList<>();
		
		
		class EmpnoSort implements Comparator<Employee>
		{

			@Override
			public int compare(Employee e1, Employee e2) {
				int diff = e1.getEmpno() - e2.getEmpno();
				if(diff == 0)
				{
					 return diff = e1.getName().compareTo(e2.getName());
				}
				return diff;
			}
		}
		
		EmpnoSort es = new EmpnoSort();
		
		
		while((choice = menu()) !=0 )
		{
			switch (choice) {
			
			case 1: // Add
				System.out.print("Enter EmpNo:");
				int empno = sc.nextInt();
				System.out.print("Enter Name:");
				String name = sc.next();
				System.out.print("Enter Salary:");
				double sal = sc.nextDouble();
				
				e = new Employee(empno,name,sal);
				list.add(e);
				
				for (Employee employee : list) {
					System.out.println(employee);
				}
				
				
				break;
			case 2: // Delete
				
				System.out.print("Enter Index To Delete:");
				int index = sc.nextInt();
				index--;
				list.remove(index);
				
				break;
				
			case 3: // Find
				
				System.out.print("Enter empno to find:");
				int empid = sc.nextInt();
				Employee e1 = new Employee();
				e1.setEmpno(empid);
				if(list.contains(e1))
				{
					int index1 = list.indexOf(e1);
					if(index1 == -1)
					{
						System.out.println("Error!");
					}
					else
					{
						System.out.println(list.get(index1));
					}
							
				}
				else
				{
					System.out.println("Not Found.");
				}
				
				break;
			case 4: // Sort
				
				Collections.sort(list,es);
				for (Employee ele : list) {
					System.out.println(ele);
				}
				
				break;
			case 5: // Edit
				
				System.out.println("Enter emp id to be modified: ");
				int id = sc.nextInt();
				Employee key = new Employee();
				key.setEmpno(id);
				int index1 = list.indexOf(key);
				if(index1 == -1)
				{
					System.out.println("Employee not found.");
				}
				else 
				{
					Employee oldEmp = list.get(index1);
					System.out.println("Employee Found: " + oldEmp);
					
					System.out.println("Enter new information for the Employee");
					
					System.out.print("Enter EmpNo:");
					int empno1 = sc.nextInt();
					
					System.out.print("Enter Name:");
					String name1 = sc.next();
					
					System.out.print("Enter Salary:");
					double sal1 = sc.nextDouble();
					
					Employee newEmp = new Employee(empno1,name1,sal1);
//					newEmp.accept();
					list.set(index1, newEmp);
				}
				
				
				break;
				
			default:
				
				System.out.println("Wrong Choice....<>.....:(^_)");
				break;
			}
		}
		
		
		System.out.println("Thank You For Using Our App.................)");
		
	}

}
