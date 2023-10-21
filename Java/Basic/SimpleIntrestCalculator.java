package Basic;

import java.util.Scanner;

public class SimpleIntrestCalculator {

    public static void main(String[] args) {
   	 Scanner sc = new Scanner(System.in);

	System.out.println("enter your principle");
	float principle = sc.nextFloat();
    
	System.out.println("enter your rate %");
	float rate = sc.nextFloat();

	System.out.println("enter your time");
	float time = sc.nextFloat();

	System.out.println("your simple interest is "+ (principle*rate*time/100));

    sc.close();
	}
}
    

