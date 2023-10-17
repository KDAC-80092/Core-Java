package com.app;
import java.util.Scanner;

public class Demo01 {
	
	
//	public static void findMin(int[] arr)
//	{
//		int store = 0;
//		for(int i=0;i<5;i++)
//		{
//			for(int j = 0;j<5;j++)
//			{
//				if(arr[i]>arr[j])
//				{
//					store = arr[j];
//				}
//			}
//		}
//		
//		System.out.println("Min is: " + store);
//	}
	
	public static<T extends Number> T findMin(T[] arr)
	{
		T store = arr[0];
		for(T ele:arr)
		{
			if(ele.doubleValue()<store.doubleValue())
			{	
				store = ele;
			}
		
		}
		return store;
		
//		System.out.println("Min is: " + );
	}

	public static void main(String[] args) {
		
		
//		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
//		arr = sc.nextInt();
//		for(int i = 0;i<5;i++)
//		{
//			System.out.println("Enter "+(i+1)+ " element: ");
//			
//			arr[i] = sc.nextInt();
//		}
//		
//		
//		Demo01.findMin(arr);
		
		Double[] arr = {3.3,3.6,5.6,9.6};
		
//		double arr1=findMin(arr);
		System.out.println("Minimum Value is: "+Demo01.findMin(arr));
		
		
		
		
	}

}
