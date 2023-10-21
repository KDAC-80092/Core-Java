package com.app;

import java.io.BufferedReader;
import java.io.FileReader;

public class Program04 {

	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("/home/himanshu/Desktop/Java/Assignments/Assignment15/Asgn15_3/File.txt");)
		{
			try(BufferedReader br = new BufferedReader(fr))
			{
				String line;
				while((line = br.readLine()) != null)
				{
					System.out.println(line);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}

 // -->  /home/himanshu/Desktop/Java/Assignments/Assignment15/Asgn15_3