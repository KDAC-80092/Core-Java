package com.app.tester;

import java.util.*;
import com.app.Book;

public class BookLinkedHashSetTester {

	public static void main(String[] args) {
		Set<Book> b1 = new LinkedHashSet<>();
		
		b1.add(new Book("aert",200,"Rowling",20));
		b1.add(new Book("aert",1000,"Field",30));
		b1.add(new Book("1253",100,"Orlando",40));
		b1.add(new Book("1255",600,"Sunbeam",100));
		b1.add(new Book("1290",800,"Agrawal",200));
		b1.add(new Book("1290",800,"Agrawal",200));	//Before Writing hashcode duplicate values are refleting
				/*
				 //Before Writing hashCode(). O/P.
				  //Output is in order of insertion.
					Book [isbn = aert, price = 200.0, authorName = Rowling, qty = 20]
					Book [isbn = aert, price = 1000.0, authorName = Field, qty = 30]
					Book [isbn = 1253, price = 100.0, authorName = Orlando, qty = 40]
					Book [isbn = 1255, price = 600.0, authorName = Sunbeam, qty = 100]
					Book [isbn = 1290, price = 800.0, authorName = Agrawal, qty = 200]
					Book [isbn = 1290, price = 800.0, authorName = Agrawal, qty = 200]
				*/
		
				// After Writing hashCode it will suppress the duplicte value. 
		
				/*
				 //After Writing HashCode(). O/P.
				 //Output is in order of insertion.
					Book [isbn = aert, price = 200.0, authorName = Rowling, qty = 20]
					Book [isbn = 1253, price = 100.0, authorName = Orlando, qty = 40]
					Book [isbn = 1255, price = 600.0, authorName = Sunbeam, qty = 100]
					Book [isbn = 1290, price = 800.0, authorName = Agrawal, qty = 200]
				*/
		
		
		Iterator<Book> itr = b1.iterator();
		while(itr.hasNext())
		{
			Book b = itr.next();
			System.out.println(b);
		}
		
		System.out.println("*******************************************************************");
		
//		for (Book b2 : b1) {
//			System.out.println(b2);
//		}
	}

}

