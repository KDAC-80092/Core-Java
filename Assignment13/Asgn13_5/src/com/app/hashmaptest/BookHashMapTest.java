package com.app.hashmaptest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.app.Book;

public class BookHashMapTest {

	public static void main(String[] args) {
		Map<String,Book> map = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("***************************************");
			
			System.out.println("0.Exit.");
			System.out.println("1.Add Book.");
			System.out.println("2.Find Book.");
			System.out.println("3.Display All");
			System.out.print("Enter Choice:");
			choice = sc.nextInt();
			
			System.out.println("***************************************");
			
			switch (choice) {
			case 1:	// Add Book
				
				Book b = new Book();
				b.accept(sc);
				map.put(b.getIsbn(), b);
				
				break;
				
			case 2: // Find Book
				
				String isbn;
				System.out.print("Enter ISBN to Find:");
				isbn = sc.next();
				
				Book b2 = map.get(isbn);
				if(b2 != null)
					System.out.println(b2);
				else
				{
					System.out.println("Enter Valid ISBN Number.");
				}
				
				
				break;
			case 3:
				
			    Set<Entry<String,Book>> entries = map.entrySet();
			    for(Entry<String,Book> entry:entries)
			    	System.out.println(entry.getValue());
				
//				System.out.println(map.toString());
				
				break;

			default:
				
				System.out.println("Wrong! Choice..........");
				
				break;
			}
			
		}while(choice != 0);
		
		
		System.out.println("Thank You For Using Our App..................:)");
		
		

	}

}
