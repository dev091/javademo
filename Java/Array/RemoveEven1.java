package Array;

import java.util.Arrays;

public class RemoveEven1 {
    public static void main(String[] args) {
        int x[] = {2, 3, 4, 5, 6, 7};

        for (int i = 0 ; i<x.length ; i++){
            if(x[i]%2!=0){
            System.out.print(x[i]+",");

            }
        }
        System.out.println();
    }
}
