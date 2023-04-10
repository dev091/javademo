import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

    	// Input the number of rows for the inverted triangle
    	int r = sc.nextInt();

    	// Outer loop for the rows of the inverted triangle
    	for (int i = r; i >= 1; i--) {

        	// Inner loop for the columns of the inverted triangle
        	for (int j = 1; j <= i; j++) {
            	// Print a star symbol for each column within the current row
            	System.out.print("*");
        	}

        	// Move to the next line after each row is completed
        	System.out.println();
			sc.close();
    	}
	}
}

