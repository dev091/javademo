package Array;

import java.util.Scanner;
import java.util.Arrays;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        // // input using for loop
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // // other way of taking input
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }
        //      System.out.println();
        // // for each loop
        // for (int i : arr) {
        //     System.out.println(i);
        // }


        //array of objects
        String[] str = new String[4];
        System.out.println("Enter 4 strings:");
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        // Printing the array of strings using Arrays.toString
        System.out.println("Array elements (strings): " + Arrays.toString(str));
        // modify
        str[1]= "Rahul";

        System.out.println(Arrays.toString(str));

    }
}


    
