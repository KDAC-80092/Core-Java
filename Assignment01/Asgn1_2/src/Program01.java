import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double num1,num2;
		
		System.out.println("Enter 1st decimal numbers:");
		if(sc.hasNextDouble())
		{
//			System.out.println("Enter 1st decimal numbers:");
			num1 = sc.nextDouble();
			
			System.out.println("Enter 2nd decimal numbers:");
			if(sc.hasNextDouble())
			{
	//			System.out.println("Enter 2nd decimal numbers:");
				num2 = sc.nextDouble();
				System.out.println("Average of the numbers is:"+(num1+num2)/2);
			}
			else
			{
				System.out.println("Not a Decimal Value.");
			}
			
//			System.out.println("Average of the numbers is:"+(num1+num2)/2);
		}
		else
		{
			System.out.println("Either 1st or 2nd is not decimal value.");
		}
		

	}

}
