import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		n = sc.nextInt();
		
		System.out.println("Value of n is:"+n);
		System.out.println();
		
		//Loop for the number of rows
		for(int row=0;row<n;row++)
		{
			// Loop to print spaces as per required
			for(int sp=0;sp<n-row-1;sp++)
			{
				System.out.print(" ");
			}
			
			//Loop to print "*" 
			for(int col = 0;col<2*row+1;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Loop to print inverted triangle pattern
		for(int row=0;row<n-1;row++)
		{
			//Loop to print inverted triangle space
		    for(int sp=0;sp<row+1;sp++)
		    {
		        System.out.print(" ");
		    }
		    
		    //Loop to print inverted triangle
		    for(int col=0;col<((2*(n-1))-(2*row+1));col++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
		sc.close();

		
	}

}
