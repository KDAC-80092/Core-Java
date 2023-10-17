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
		System.out.println("Before Sort:");
		for(double ele : arr)
		{
			System.out.println(ele);
		}
		
		
		Arrays.sort(arr);
		
		System.out.println("After Sort:");
		for(double ele : arr)
		{
			System.out.println(ele);
		}
		
		
	}

}
