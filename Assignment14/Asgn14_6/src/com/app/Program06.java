package com.app;

import java.util.Scanner;
import java.util.stream.Stream;

public class Program06 {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size;
		System.out.print("Enter a number to Find:");
		size = sc.nextInt();
		
		Stream<Integer> strm = Stream.iterate(1, x -> x+1).limit(size);
		int result = strm.reduce(1, (a,e) -> a*e);
		System.out.println("Result: " + result);
		
	}

}
