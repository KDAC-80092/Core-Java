package com.app;

import java.util.*;

public class LengthOfString {
	
	

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("HRA");
		list.add("Client");
		list.add("Prashant");
		list.add("Naveen");
		list.add("Adnan");
		list.add("Shyama Prasad");
		list.add("Sachin Tendulkar");
		
		
		class StringLengthComparator implements Comparator<String>
		{

			@Override
			public int compare(String s1, String s2) {
				int diff;
				diff = s1.length()-s2.length();
				return diff;
			}
			
		}
		StringLengthComparator slc = new StringLengthComparator();
		
		
		
		System.out.println(Collections.max(list,slc));
//		System.out.println(Collections.min(list,slc));

	}

}
