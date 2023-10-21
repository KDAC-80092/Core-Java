package com.app.test;

import com.app.Date;
import com.app.Displayable;
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
		b.getObj().show();
	}
	
	public static void printAnyBox(Box<?> b)
	{
		System.out.println(b.getObj().toString());
	}
	
	public static void main(String[] args) {
	
	
		Date d = new Date(10,10,2023);
//		System.out.println(d.toString);
//		System.out.println(d.toString());
//		d.show();
		
		Person p = new Person("Himanshu",23);
//		System.out.println(p.toString());
	
		Box<Person> b = new Box<Person>();
		b.setObj(p);
		
		Box<Date> b2 = new Box<Date>();
		b2.setObj(d);
		
		
		Tester.printDisplayableBox(b);
		Tester.printAnyBox(b);
		
		Tester.printDisplayableBox(b2);
		Tester.printAnyBox(b2);
		
		
			
	}

}
