package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arraysort {

    public static void main(String[] args) {
        int arr[] = {6,3,5,1,22,76,4};

        f1(arr);
        System.out.println(Arrays.toString(arr));



    }
    public static void f1(int [] arr){
        Arrays.sort(arr);
    }
    
}
