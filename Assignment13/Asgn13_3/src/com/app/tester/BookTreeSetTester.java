package com.app.tester;

import java.util.*;
import com.app.Book;

public class BookTreeSetTester {

	public static void main(String[] args) {
		Set<Book> b1 = new TreeSet<>();
		
		b1.add(new Book("1250",200,"Rowling",20));
		b1.add(new Book("1251",1000,"Field",30));
		b1.add(new Book("1253",100,"Orlando",40));
		b1.add(new Book("1255",600,"Sunbeam",100));
		b1.add(new Book("1290",800,"Agrawal",200));
		b1.add(new Book("1290",800,"Agrawal",200));	
		
		/*
		 In TreeSet hashCode() and equals() methods will not consider only Comparable will be considered..
		 Off Course depends on situation if we want levels of sorting then we have to write comparator.
		 We have to write our own Comparable when have user-defined class.
		 So, Output in Sorted Order.
		 	Book [isbn = 1251, price = 1000.0, authorName = Field, qty = 30]
			Book [isbn = 1253, price = 100.0, authorName = Orlando, qty = 40]
			Book [isbn = 1255, price = 600.0, authorName = Sunbeam, qty = 100]
			Book [isbn = 1290, price = 800.0, authorName = Agrawal, qty = 200]
			Book [isbn = aert, price = 200.0, authorName = Rowling, qty = 20]
		 */
		
		Iterator<Book> it = b1.iterator();
		while (it.hasNext()) {
			Book b = it.next();
			System.out.println(b);
			
		}
		
		System.out.println("*******************************************************************");
		
//		for (Book b2 : b1) {
//			System.out.println(b2);
//		}
	}

}

