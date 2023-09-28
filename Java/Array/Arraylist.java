package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
   
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        ArrayList<String> list2 = new ArrayList<>(22);
        
        //method to add
        // list.add(11);
        // list.add(12);
        // list.add(11);
        // list.add(15);
        // list.add(1121);
        // list.add(12);
        // list.add(11);
        // list.add(1235);
        // list.add(11);
        // list.add(1322);
        // list.add(1121);
        // list.add(15);
        // list.add(12421);
        // list.add(11332);
        // list.add(11223);
        // list.add(1325);
        
        // list2.add("mohan");
        // list2.add("ravi");
        // list2.add("kishore");
        // System.out.println(list);

        // System.out.println(list.contains(15));
        // list.set(0, 123);
        // System.out.println(list);
        // System.out.println(list2);

        //input

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());

        }
        System.out.println(list);
    }
}
