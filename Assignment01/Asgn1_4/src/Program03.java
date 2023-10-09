import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		n = sc.nextInt();
		
		System.out.println("Value of n is:"+n);
		System.out.println();
		
		//Loop to print pattern
		for(int row=0;row<n;row++)
		{
			//Loop to print spaces
			for(int sp=0;sp<n-row-1;sp++)
			{
				System.out.print(" ");
			}
			
			//Loop to print '*'
			for(int col=0;col<row+1;col++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		sc.close();

	}

}
