package Basic;

public class LogicalOperator {

    public static void main(String[] args) {
   	 
 	int a = 3 , b = 4 , c=5;
	 
 	// AND OPERATOR
 	System.out.println((a>b) && (b>c)); // false
 	System.out.println((a<b) && (b<c)); // TRUE
	 
 	// OR OPERATOR
 	System.out.println((a>b) || (b<c)); // true
 	System.out.println((a>b) || (b>c)); // false
	 
  // NOT OPERATOR
 	System.out.println(!(a>b)); // true
 	System.out.println(!(c>b)); // false
    
    }

}

