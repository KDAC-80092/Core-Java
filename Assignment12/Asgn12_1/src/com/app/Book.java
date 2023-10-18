package com.app;

import java.util.Objects;
import java.util.Scanner;

public class Book {

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

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", qty=" + qty + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof Book) {
			Book other = (Book) obj;
			if (this.isbn.equals(other.isbn))
				return true;
		}
		return false;
	}
	

}
