package Array;

public class Jaggedarray {
    public static void main(String[] args) {
        int a[][] = {{5, 6, 2}, // row 0
                {7, 9, 8, 4}, // row 1
                {3, 4, 2, 1, 5}, // row 2
                {5, 4, 7, 0,11}}; // row 3
        System.out.println(a[1][3]); // row 3, column 2
        System.out.println("Total length of array: " + a.length); // prints the number of rows
        

        int totalElements = 0; //  Declares and initializes a variable totalElements to store the total number of elements in the jagged array.
        for (int[] row : a) { // Starts a for-each loop that iterates over each row in the jagged array a. The row variable represents each row in the loop.
            totalElements += row.length; // Adds the length of each row to the totalElements variable, counting the number of elements in each row.
        }
        System.out.println("Total elements in array: " + totalElements); // prints the total number of elements in the 2D array
        
        // print all elements in matrix format

        for (int i=0 ; i<a.length ;i++){

            for (int j=0 ; j<a[i].length;j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
