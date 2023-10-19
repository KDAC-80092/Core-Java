package com.app.tester;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import com.app.Book;

public class BookTreeTester {

	public static void main(String[] args) {
		
		
		class BookPriceComparator implements Comparator<Book>
		{

			@Override
			public int compare(Book book, Book book1) {
				int diff = - Double.compare(book.getPrice(), book1.getPrice());
				return diff;
			}
			
		}
		
		BookPriceComparator bpc = new BookPriceComparator();
		
		TreeSet<Book> b1 = new TreeSet<>(bpc);
		
		b1.add(new Book("1250",200,"Rowling",20));
		b1.add(new Book("1251",1000,"Field",30));
		b1.add(new Book("1253",100,"Orlando",40));
		b1.add(new Book("1255",600,"Sunbeam",100));
		b1.add(new Book("1290",800,"Agrawal",200));
		b1.add(new Book("1290",800,"Agrawal",200));	
		
		
		Iterator<Book> itr = b1.iterator();
		System.out.println("According To Descending Order Of Price Using Comparator");
		while(itr.hasNext())
		{
			Book book = itr.next();
			System.out.println(book);
		}
		
		System.out.println();
		System.out.println("Reverse Order:");
		System.out.println();
		Iterator<Book> revSet = b1.descendingIterator();
		while(revSet.hasNext())
		{
			Book b = revSet.next();
			System.out.println(b);
		}
		
	}

}
