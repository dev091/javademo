package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MultilDimensionArraylist {

    
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();

            // Initialization
            for (int i = 0; i < 3; i++) {
                list.add(new ArrayList<>());
            }

            // Add elements
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    list.get(i).add(in.nextInt());
                }
            }

            // Print the ArrayList of ArrayLists
            
                System.out.print(list);
        }
        }
    }

