package Array;
import java.util.Arrays;

public class Updatearray {
    public static void main(String[] args) {
        int[] a = {5, 7, 8, 1, 12};
        a[0] = 9;
        System.out.println(Arrays.toString(a));
        for (int i=4 ; i>=0 ; i--){
            System.out.print(a[i]); // reverse an array
            
        }
    }
}
