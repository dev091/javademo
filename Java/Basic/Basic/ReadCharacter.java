/**
 * The 'ReadCharacter' class demonstrates how to read the first character of a user-entered name in Java.
 * It uses the Scanner class to take input from the user, and then extracts the first character
 * of the entered name using the charAt(0) method. The program displays the initial of the name
 * to the console.
 * 
 */
package Basic.Basic;

import java.util.Scanner;

public class ReadCharacter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.println("Enter your name: ");

        // Read the first character of the entered name using charAt(0) method
        char ch = sc.next().charAt(0);

        // Display the initial of the name to the console
        System.out.println("The initial of your name is " + ch);

        // Close the Scanner to prevent resource leak
        sc.close();
    }
}

