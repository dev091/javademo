package Array;

import java.util.Arrays;

public class RemoveEven {
    public static void main(String[] args) {
        int x[] = {2, 3, 4, 5, 6, 7};
        int oddcount = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 != 0) {
                oddcount++;
            }
        }

        int[] result = new int[oddcount];
        int idx = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 != 0) {
                result[idx] = x[i];
                idx++;
            }
        }

        System.out.println("Original Array: " + Arrays.toString(x));
        System.out.println("Array after removing even numbers: " + Arrays.toString(result));
    }
}
