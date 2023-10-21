package com.app.test;

import java.util.Scanner;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

import com.app.Book;

public class Program01 {

	public static int menu() {
		Scanner s = new Scanner(System.in);

		int choice;
		System.out.println("************************************");
		System.out.println("0.EXIT.");
		System.out.println("1.Add New Book.");
		System.out.println("2.Display all books in forward order using random access.");
		System.out.println("3.Search a book with given isbn.");
		System.out.println("4.Delete a book at given index.");
		System.out.println("5.Delete a book with given isbn.");
		System.out.println("6.Reverse the list.");
		System.out.println("7.Save Books in File.");
		System.out.println("8.Load Books From File.");

		System.out.println("************************************");
		System.out.print("Enter Choice:");
		choice = s.nextInt();

		System.out.println("************************************");

		return choice;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Book> list = new ArrayList<>();
		list.add(new Book("121", 1200, "ABCD", 12));
		int index;
		int choice;
		Book b;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1: // Add book

				System.out.print("Enter isbn:");
				String isbn1 = sc.next();

				System.out.print("Enter Price:");
				double price = sc.nextDouble();

				System.out.print("Enter Author Name:");
				String authorName = sc.next();

				System.out.print("Enter Quantity To Add:");
				int qty1 = sc.nextInt();

				Book key = new Book();
				key.setIsbn(isbn1);
				if (list.contains(key)) {
					// Add at index
					int index1 = list.indexOf(key);
					if (index1 == -1) {
						System.out.println("Error!");
					} else {
						System.out.println("Book Already Exists.Quantity Added Successfully!.");
						key = list.get(index1);
						key.setQty(key.getQty() + 1);
//								list.get(index1).increaseQty(qty1);
					}

				} else {
					b = new Book(isbn1, price, authorName, qty1);
					list.add(b);
				}

				break;

			case 2: // Display all books in forward order using random access
				if (list.size() != 0) {
					for (int i = 0; i < list.size(); i++) {
						key = list.get(i);
						System.out.println(key);
					}
				} else {
					System.out.println("No Element Exists.");
				}

				break;

			case 3: // Search a book with given isbn
				System.out.print("Enter isbn to Search:");
				String isbn = sc.next();
				Book key1 = new Book();
				key1.setIsbn(isbn);
				int index2 = (list.indexOf(key1));
				if (index2 == -1) {
					System.out.println("Key Not Found");
				} else {
					key1 = list.get(index2);
					System.out.println(key1);
//							System.out.println("Key Found.");
				}

				break;

			case 4:// Delete a book at given index
				System.out.print("Enter Index At Which Element To be Deleted:");
				index = sc.nextInt();
//						index--;
				list.remove(index);

				break;

			case 5: // Delete a Book With Given ISBN
				System.out.print("Enter isbn to Search:");
				isbn = sc.next();
				Book k = new Book();
				k.setIsbn(isbn);
				if (list.contains(k)) {
					int ind = list.indexOf(k);
					if (ind == -1) {
						System.out.println("Not Available.");
					} else {
						list.remove(ind);
						System.out.println("Deleted Successfully!");
					}
				} else {
					System.out.println("Entered Isbn Not Found.");
				}

				break;

			case 6: // Reverse the list

				Collections.reverse(list);
				for (Book book : list)
					System.out.println(book);

//						System.out.println("Size is: " + list.size());

				break;

			case 7: // 
				
				try(FileOutputStream fout = new FileOutputStream("Book.bin"))
				{
					try(DataOutputStream dout = new DataOutputStream(fout))
					{
						for(Book b1 : list) {
							dout.writeUTF(b1.getIsbn());
							dout.writeDouble(b1.getPrice());
							dout.writeUTF(b1.getAuthorName());
							dout.writeInt(b1.getQty());
						}
					}	// dout.close();
				}	//fout.close();
				catch(Exception e)
				{
					e.printStackTrace();
				}
				System.out.println("Saved Successfully.");
				
				break;
				
			case 8:
				
				try(FileInputStream fin = new FileInputStream("Book.bin"))
				{
					try (DataInputStream sin = new DataInputStream(fin))
					{
						while(true)
						{
							Book bookk = new Book();
							bookk.setIsbn(sin.readUTF());
							bookk.setPrice(sin.readDouble());
							bookk.setAuthorName(sin.readUTF());
							bookk.setQty(sin.readInt());
							System.out.println(bookk);
						}
					} // din.close();
				}	// din.close();
				catch(EOFException e)
				{
					
				}
				
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				break;
				
			default:
				System.out.println("Wrong Choice...............)");

				break;

			}
		}

		System.out.println("Thank You For Using Our App..........");

	}
}
