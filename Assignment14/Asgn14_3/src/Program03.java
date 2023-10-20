import java.util.Scanner;

@FunctionalInterface
interface  Arithmetic
{
	double calc(double a,double b);
}


public class Program03 {

	static void calculate(double num1, double num2, Arithmetic op) {
			double result = op.calc(num1, num2);
			System.out.println("Result: "+result);
		}
	
	
	public static void main(String[] args) {
		int choice;
		double num1,num2;
		Scanner sc = new Scanner(System.in);
			do {
				System.out.println("0.Exit");
				System.out.println("1.Addition.");
				System.out.println("2.Subtraction.");
				System.out.println("3.Multiplication.");
				System.out.println("4.Division.");
				System.out.print("Enter choice:");
				choice = sc.nextInt();
				
				System.out.println("************************************************************");
				System.out.print("Enter num1:");
				num1 = sc.nextDouble();
				System.out.print("Enter num2:");
				num2 = sc.nextDouble();
				
				switch (choice) {
				case 1:
					
					calculate(num1,num2,(a,b) -> a+b);
					
					
					break;
					
				case 2:
					
					calculate(num1,num2,(a,b) -> a-b);
					
					break;
					
				case 3:
					
					calculate(num1,num2,(a,b) -> a*b);
					
					break;
					
				case 4:
					
					calculate(num1,num2,(a,b) -> a/b);
					
					break;
						

				default:
					
					if(choice == 0)
						break;
					
					System.out.println("Wrong! Choice......................:)");
					break;
				}
				
			}while(choice !=0);

	}

}
