package Array;

public class Max { // Changed class name to start with an uppercase letter
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 199};

        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
