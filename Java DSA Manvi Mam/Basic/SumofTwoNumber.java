package Basic;

import java.util.Scanner;

public class SumofTwoNumber {

    public static void main(String[] args) {
   	 // TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);   // scanner class 
    
	System.out.println("enter ist num");
	int num_1 = sc.nextInt();
    
	System.out.println("enter 2nd num");
	int num_2 = sc.nextInt();
    
	int sum = num_1 + num_2 ;
	System.out.println("Your sum is " + sum);
    }

}

