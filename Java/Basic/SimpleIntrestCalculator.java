package Basic;

import java.util.Scanner;

public class SimpleIntrestCalculator {

    public static void main(String[] args) {
   	 // TODO Auto-generated method stub
    	Scanner sc = new Scanner(System.in);
   	 
    	System.out.println("enter principal");
    	int principal = sc.nextInt();
   	 
    	System.out.println("enter rate");
    	int rate = sc.nextInt();
   	 
    	System.out.println("enter time");
    	int time = sc.nextInt();
   	 
  	int  simple_interest = (principal*rate*time)/100 ;
    	System.out.println("your simple interest is "+simple_interest);
    }


}
    

