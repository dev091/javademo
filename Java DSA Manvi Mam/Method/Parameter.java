package Method;

import java.util.Scanner;

public class Parameter {
    public static void main(String[] args) {
        // method 
    
    int ans = sum3(20, 30);
    System.out.println(ans);
    }

    // pass the value of numbers when using a method in main()

    static int sum3(int a , int b){

    int sum = a+b ;

    return sum;
    }
}

