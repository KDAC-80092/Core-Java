package com.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try(FileWriter fw = new FileWriter("File.txt"))
		{
			try(BufferedWriter bw = new BufferedWriter(fw))
			{
				for(int i = 1;i<=4;i++)
				{
					System.out.print("Enter a line:");
					String line = sc.nextLine();
					bw.write(line);
					bw.newLine();
					
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
