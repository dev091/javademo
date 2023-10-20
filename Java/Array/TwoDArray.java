package Array;

public class TwoDArray {
    public static void main(String[] args) {
        int a[][] = {{5,6,2,1}, // row 0
                     {7,9,8,4},   // 8 = row 1 column 2
                     {3,4,2,4},
                     {5,4,7,0}}; // row 2
        System.out.println(a[0][2]); // row - column
        System.out.println("length of array is: "+a.length); 
        System.out.println("total elements of array is: "+a.length*a[0].length);  // total rows * total columns

    }
}
