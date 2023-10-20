package com.app;

@FunctionalInterface
interface Check<T>
{
	boolean compare(T a,T b);
}

public class Program05 {

	static<T> int countIf(T[] arr,T key,Check<T> c)
	{
		int count = 0;
		for(T ele : arr) {
			if(c.compare(ele, key))
				count++;
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		Integer [] arr = {44, 77, 99, 22, 55, 66};
		Integer key = 50;
		
		int cnt = countIf(arr, key, (x,y)-> x > y);
		System.out.println("Count = " + cnt); // 4 (because 4 elements in array 
											 //	are greater than given key i.e. 50)
		
		Double[] arr1 = {1.1,1.2,1.3,3.3,2.6,1.2,1.2,7.8};
		Double key1 = 1.2;
		
		cnt = countIf(arr1, key1, (x,y)-> x.equals(y));
		System.out.println("Double Count is: "+cnt);
		
		
	}
}