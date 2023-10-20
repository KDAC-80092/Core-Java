package com.app;

import java.util.Random;
import java.util.stream.Stream;

public class Program07 {

	public static void main(String[] args) {
		Random r = new Random();
		
		Stream<Integer> stream = Stream.generate(() -> r.nextInt(10)).limit(10);
		int result = stream.reduce(0, (a,e) -> a+e);
		System.out.println("Result: " + result);
		
		

	}

}
