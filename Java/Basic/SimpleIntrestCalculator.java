package Basic;

import java.util.Scanner;

public class SimpleIntrestCalculator {

    public static void main(String[] args) {
   	 Scanner sc = new Scanner(System.in);

	System.out.println("enter your principle");
	int principle = sc.nextInt();
    
	System.out.println("enter your rate %");
	int rate = sc.nextInt();

	System.out.println("enter your time");
	int time = sc.nextInt();

	System.out.println("your simple interest is "+ (principle*rate*time/100));


	}
}
    

