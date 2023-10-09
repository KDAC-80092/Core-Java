import java.util.Scanner;

public class Program01 {

//	private static final int case 1 = 0;
	public static int menu()
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("*****************************");
		System.out.println("1.Dosa.\n2.Idli.\n3.Samosa.\n4.Generate Bill n Exit.");
		System.out.println("*****************************");
		System.out.print("Enter choice:");
		choice = sc.nextInt();
		//sc.close();
		
		return choice;
	}

	public static void main(String[] args) {
		
		//fastFood f = new fastFood();
		int ch;
		int total=0;
		while((ch=menu()) !=0 )
		{
			switch(ch)
			{
			case 1:
				System.out.println("Dosa successfully Added");
				total += 50;
				break;
			case 2:
				System.out.println("Idli successfully Added");
				total +=25;
				break;
			case 3:
				System.out.println("Samosa successfully Added");
				total += 10;
				break;
			case 4:
				System.out.println("Your Bill is:"+total);
				System.out.println("Thank You For Shopping With Us.");
				break;
			default:
				System.out.println("Wrong Choice.............)");
				break;
			}
			if(ch == 4)
			{
				break;
			}
		}

	}
}

