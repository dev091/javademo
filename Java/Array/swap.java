package Array; // This is a package declaration. It specifies that this class belongs to the "Array" package.

import java.util.Arrays; // Import the Arrays class from the java.util package for array-related operations.

public class swap { // Define a class named "swap." Class names in Java should start with an uppercase letter.
    /**
     * @param args
     */
    public static void main(String[] args) { // The main method, the entry point of your program.
        int arr[] = {1, 4, 5, 7, 19}; // Declare and initialize an integer array named "arr" with five elements.

        swap(arr, 1, 3); // Call the "swap" method to swap elements at indices 1 and 3 of the "arr" array.
        System.out.println(Arrays.toString(arr)); // Print the contents of the "arr" array using "Arrays.toString."

        // The program execution starts from here when you run this Java class.
    }
        
    static void swap(int[] arr, int index1, int index3) { // Define a static method "swap" that takes an array and two indices.
        int temp = arr[index1]; // Store the value at index1 in a temporary variable "temp."
        arr[index1] = arr[index3]; // Assign the value at index3 to index1, effectively swapping them.
        arr[index3] = temp; // Assign the value of "temp" (which was originally at index1) to index3 to complete the swap.
    }
}
