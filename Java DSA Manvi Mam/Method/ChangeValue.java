package Method;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // method by change value to change index of arr[0] from 1 to 99
        int arr [] = {1,2,3,4,5};
        change(arr);

        System.out.println(Arrays.toString(arr));

    }
     static void change(int[] nums){

     

     nums[0]= 99 ;
}
}