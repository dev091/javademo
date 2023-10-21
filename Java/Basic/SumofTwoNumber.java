package Basic;

import java.util.Scanner;

public class SumofTwoNumber {

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first num ");

		int num_1 = sc.nextInt();
		
		System.out.println("enter 2nd num ");

		int num_2 = sc.nextInt();
		
     // Adding parentheses to ensure addition is performed before string concatenation , otherwise it will take whole as string
		System.out.println("sum of two numbers is "+( num_1+num_2));
	}

}



