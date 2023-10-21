package Basic;

import java.util.*;

public class input {

    public static void main(String[] args) {
   	 
  	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter your name");
		String name = sc.nextLine();     // we can take spaces
		System.out.println("name is " + name);
	}
 	 
//  	System.out.println("Enter your Lucky no :");
//   	int num_1 = sc.nextInt();
//   	System.out.println("your lucky no is " +num_1);
    }

}
