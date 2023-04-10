package Array;

public class Jaggedarray {
    public static void main(String[] args) {
        int a[][] = {{5, 6, 2}, // row 0
                {7, 9, 8, 4}, // row 1
                {3, 4, 2, 1, 5}, // row 2
                {5, 4, 7, 0}}; // row 3
        System.out.println(a[3][2]); // row 3, column 2
        System.out.println("Total length of array: " + a.length); // prints the number of rows
        int totalElements = 0;
        for (int i = 0; i < a.length; i++) {
            totalElements += a[i].length;
        }
        System.out.println("Total elements in array: " + totalElements); // prints the total number of elements in the 2D array
    }
}

    
    