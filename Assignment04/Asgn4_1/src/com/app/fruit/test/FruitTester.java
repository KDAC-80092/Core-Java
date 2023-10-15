package com.app.fruit.test;

import java.util.Scanner;

//import com.app.fruits.Apples;
import com.app.fruits.*;


public class FruitTester 
{

	public static int menu()
	{
		int choice;
		System.out.println("****************************************");
		
		System.out.println("0.EXIT");
		System.out.println("1.Add Mango.");
		System.out.println("2.Add Apple.");
		System.out.println("3.Add Orange.");
		System.out.println("4.Display names of all fruits in the basket.");
		System.out.println("5.Display name,color,weight , taste of all fresh fruits , in the basket.");
		System.out.println("6.Display tastes of all stale(not fresh) fruits in the basket.");
		System.out.println("7.Mark a fruit as stale.");
		
		System.out.println("****************************************");
		
		System.out.print("Enter Choice:");
		choice = new Scanner(System.in).nextInt();
		return choice;
		
		//System.out.println("****************************************");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		int choice;
		int index = 0;
		int size;
		System.out.println("Enter the size of the Basket.");
		size = sc.nextInt();		
		
		Fruits [] arr = new Fruits[size];
		
		while((choice = menu())!=0)
		{
			switch(choice)
			{
				case 1:
					if(index<size)
					{
						arr[index] = new Mangoes();
						arr[index].acceptData();
						index++;
					}
					else
					{
						System.out.println("Basket is Full For Mangoes.");
					}
					
					break;
				
				case 2:
					if(index<size)
					{
						arr[index] = new Apples();
						arr[index].acceptData();
						index++;
					}
					else
					{
						System.out.println("Basket is Full For Apples.");
					}
					
					break;
					
				case 3:
					if(index<size)
					{
						arr[index] = new Oranges();
						arr[index].acceptData();
						index++;
					}
					else
					{
						System.out.println("Basket is Full For Oranges.");
					}
					
					break;
					
				case 4:
					
					for(int i =0;i<index;i++)
					{
						System.out.println("Name is: " +arr[i].getName());
//						System.out.println("");
					}
					
					break;
					
				case 5:
					
					for(int i =0;i<index;i++)
					{
						if (arr[i].isFresh()) {
							System.out.println("Basket is:" + arr[i].toString());
							System.out.println("& Taste is: " + arr[i].Taste());
							System.out.println("----------------------------------------------");
						}
						else
						{
							System.out.println("No Such Fruits are There in basket.");
						}
					}
					
					break;
					
				case 6:
					for(int i = 0;i < index; i++) 
					{
						if (!arr[i].isFresh()) 
						{
	                        System.out.println(arr[i].Taste());
						}
						else
						{
							System.out.println("No Fruit is Stale.");
						}
					}
					
					break;
					
				case 7:
					
					int index1;
					System.out.println("Enter the no.to marks fruit as Stale");
					index1 = sc.nextInt();
					index1 = index1-1;
					if(index1>=0 && index1<=index)
					{
					
						arr[index1].setFresh(false);
						System.out.println("Marked Fruit " + arr[index1].getName() + " as Stale");
//						if()
//						{
//							System.out.println("Basket is:" + arr[index1].toString());
//							System.out.println("& Taste is: " + arr[index1].Taste());
//							System.out.println("----------------------------------------------");
//						}
//						else
//						{
//							System.out.println("Natthi! Nhi Jumbo.");
//						}
						
					}
					else
					{
						System.out.println("There is no such Fruit which You Entered.");
					}
					
					break;
					
				default:
					
					System.out.println("Wrong Choice..................)");
					break;
			}
		}
		
		System.out.println("Thank You For Using Our App.......<>.......................");

	}

}
