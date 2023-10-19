package com.app;

import java.util.*;


public class Book implements Comparable<Book> {

	private String isbn;
	private double price;
	private String authorName;
	private int qty;

	public Book() {

	}

	public Book(String isbn, double price, String authorName, int qty) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.qty = qty;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getIsbn() {
		return isbn;
	}

	public double getPrice() {
		return price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public int getQty() {
		return qty;
	}
	
//	public void increaseQty(int qty)
//	{
//		this.qty = this.qty+qty;
//	}

	public void accept() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter isbn:");
		isbn = sc.next();

		System.out.print("Enter Price:");
		price = sc.nextDouble();

		System.out.print("Enter Author Name:");
		authorName = sc.next();

		System.out.print("Enter Quantity:");
		qty = sc.nextInt();

	}


//	public int hashCode()
//	{
//		int hash = Objects.hash(this.isbn);
//		return hash;
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (obj instanceof Book) {
//			Book other = (Book) obj;
//			if (this.isbn.equals(other.isbn))
//				return true;
//		}
//		return false;
//	}
	
	@Override
	public String toString() {
		return "Book [isbn = " + isbn + ", price = " + price + ", authorName = " + authorName + ", qty = " + qty + "]";
	}

//	@Override
//	public int compareTo(Book b) {
//		int diff = this.isbn.compareTo(b.isbn);
//		return diff;
//	}
	
	@Override
	public int compareTo(Book other)
	{
		int diff = this.isbn.compareTo(other.isbn);
		return diff;
	}
	

}

