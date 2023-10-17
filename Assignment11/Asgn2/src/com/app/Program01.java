package com.app;

import java.util.Arrays;
import java.util.Comparator;

public class Program01 {

	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		Double[] arr = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		class SortComparator implements Comparator<Double>
		{

			@Override
			public int compare(Double d1, Double d2) {
				int diff = Double.compare(d1,d2);
				return diff;
			}
			
			
		}
		
		
		
		
		
		
//		System.out.println("Before Sort:");
//		for(double ele : arr)
//		{
//			System.out.println(ele);
//		}
//		
//		
		Arrays.sort(arr,new SortComparator());
//		
		System.out.println("After Sort:");
//		for(double ele : arr)
//		{
//			System.out.println(ele);
//		}

//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		for (Double double1 : arr) {
			System.out.println(double1);
		}
		
	}

}
