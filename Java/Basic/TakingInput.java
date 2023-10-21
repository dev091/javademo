package Basic;

import java.util.Scanner;

/**
 * The TakingInput class demonstrates how to use the Scanner class to take user input in Java.
 * It prompts the user to enter a number, reads the input, and prints the entered number.
 */
public class TakingInput {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter your number: ");

        System.out.println("enter your name: ");

        // Read the entered number using nextInt() method
        int num_1 = sc.nextInt();

        String name = sc.nextLine();

        // Display the entered number
        System.out.println("Entered number is " + num_1);

        System.out.println("name is "+name);

        // Close the Scanner to release resources
        sc.close();
    }
}
