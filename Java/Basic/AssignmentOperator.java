package Basic;

public class AssignmentOperator {

    public static void main(String[] args) {
   	 
   int p = 10 ;
	int q  ;
    
 	q=p;
	System.out.println(q);
    
	p+=q ;
	//  p = p+q , p = 10 + 10 = 20
    
	System.out.println(p);
    
	p-=q ; // p = p- q , 20( previous value of P is 20) 20- 10 = 10
	System.out.println(p);
    
	p*=q ; // p  =p*q  , 10*10 = 100
    
	System.out.println(p);
    
	p/=q ; // p = p/q , 100/10 = 10
	System.out.println(p);
    }

}
