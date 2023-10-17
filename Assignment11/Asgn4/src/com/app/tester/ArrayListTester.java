package com.app.tester;

import java.util.*;


import com.app.Book;

public class ArrayListTester {

	public static int menu() {
		Scanner sc = new Scanner(System.in);
//		try {
			int choice;
			System.out.println("************************************");
			System.out.println("0.EXIT.");
			System.out.println("1.Add New Book.");
			System.out.println("2.Display All Books In Forward Order.");
			System.out.println("3.Delete At Book Given Index.");
			System.out.println("4.Check If Book With given Index Is in List Or Not.");
			System.out.println("5.Delete All Books in List.");
			System.out.println("6.Display Number Of Books In List.");
			System.out.println("7.Sort All Books By Price In Desc Order.");

			System.out.println("************************************");
			System.out.print("Enter Choice:");
			choice = sc.nextInt();

			return choice;

//		}

//		finally {
//			sc.close();
//		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Book> list = new ArrayList<>();
		list.add(new Book("121",1200,"ABCD",12));
		int index;
		int choice;
		Book b;
		while((choice = menu()) != 0)
		{
			switch(choice)
			{
			case 1:	//Add book
				b = new Book();
				b.accept();
				list.add(b);
				
				break;
				
			case 2:	//Display All
				if(list.size() != 0) 
				{
					for(Book bk : list)
					{
							System.out.println(bk);
					}
				}
				else 
					System.out.println("Nothing.");
					
				break;
				
			case 3: //remove at index
				System.out.print("Enter Index At Which Element To be Deleted:");
//				Scanner sc = new Scanner(System.in);
				index = sc.nextInt();
				index--;
//				index = new Scanner(System.in).nextInt();
				list.remove(index);
				
				break;
				
			case 4:// check if book present
				
				String isbn;
				System.out.print("Enter isbn number to check:");
				isbn = sc.next();
				Book key = new Book();
				key.setIsbn(isbn);
				if(list.contains(key))
				{
					System.out.println("Key Found.");
				}
				else
				{
					System.out.println("Key Not Found.");
				}
				
				break;
				
			case 5: // Delete All Books
				list.clear();
				System.out.println("Deleted Successfully!");
				
				break;
				
			case 6: // Display Number Of Books
				System.out.println("Size is: " + list.size());
				
				break;
				
			case 7: // Sort By Price Desc
				 class BookPriceComparator implements Comparator<Book>
				 {

				@Override
				public int compare(Book b1, Book b2) {
					int diff = - Double.compare(b1.getPrice(), b2.getPrice());
					return diff;
				}
					 
				 }
				 
				 BookPriceComparator bpc = new BookPriceComparator();
				 list.sort(bpc);
				
				break;
			default:
				System.out.println("Wrong Choice...............)");
				
				break;
				
			}
		}
		
		System.out.println("Thank You For Using Our App..........");
		
		
	}

}
