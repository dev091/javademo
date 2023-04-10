package Array;

public class TwoDArray {
    public static void main(String[] args) {
        int a[][] = {{5,6,2,1}, // row 1
                     {7,9,8,4},   // 8 = row 1 column 2
                     {3,4,2,1},
                     {5,4,7,0}}; // row 2
        System.out.println(a[1][31]); // row - column
    }
}
