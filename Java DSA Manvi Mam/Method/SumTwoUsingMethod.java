package Method;

import java.util.Scanner;

public class SumTwoUsingMethod {
    public static void main(String[] args) {
        //method 
    sum();
    sum();
    sum();
    sum();

    
    }

   
    static void sum() {
        Scanner sc = new Scanner(System.in);

     System.out.print("enter a value:");
     
     int num1 = sc.nextInt();

     System.out.print("enter value of b:");

     int num2 = sc.nextInt();

     int sum = num1 + num2 ;

     System.out.println("the sum of a + b is =" + sum);


    }
}
