package com.app.test;

import com.app.Date;
import com.app.Person;


class Box<T>
{
	
	T obj;

	public void setObj(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}
	
	
	
}


public class Tester {
	
	public static void printDisplayableBox(Box<? extends Displayable> b)
	{
		
	}
	
	public static void printBox(Box<?> b)
	{
		
	}
	
	public static void main(String[] args) {
		Date d = new Date(10,10,2023);
//		System.out.println(d.toString);
		System.out.println(d.toString());
		d.show();
		
		Person p = new Person("Himanshu",23);
		System.out.println(p.toString());
	}

}
