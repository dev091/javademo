package Array;

import java.util.Arrays;

public class RemoveEvenArray {
    // method to remove even numbers from an array and return the resulting array
    public static int[] RemoveEven(int[] arr) {
        int oddcount = 0;
        // count the number of odd numbers in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddcount++;
            }
        }    
        
        // create a new array to store the odd numbers
        int[] result = new int[oddcount];
        int idx = 0;
        // iterate over the input array and copy the odd numbers to the new array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[idx] = arr[i];
                idx++;
            }
        }
        // return the resulting array with only odd numbers
        return result;
    }
    
    // method to print an array to the console
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // input array
        int[] arr = {3, 4, 5, 6, 7, 8, 9};
        
        // print the input array
        printArray(arr);
        
        // remove even numbers and store the resulting array
        int[] result = RemoveEven(arr);
        
        // print the resulting array with only odd numbers
        printArray(result);
    }
}
