import java.util.*;

public class Program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("Hello world");
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter number to convert:");
		num = sc.nextInt();
		
		System.out.println("Given number is:"+num+" = "+Integer.toBinaryString(num));
		System.out.println("Given number is:"+num+" = "+Integer.toOctalString(num));
		System.out.println("Given number is:"+num+" = "+Integer.toHexString(num));
		
		sc.close();
	}

}
