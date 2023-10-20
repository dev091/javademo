package Method;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
    {
       
        //  int a = 77 ; // a is already inititalized in the block in same method , hence we cannot initialized again
             a = 23 ; // reassign the original variable to some other value  

             System.out.println(a);
        int c = 88 ; // value initialised in the block , will remain in same block
    }

     //  System.out.println(c); // cannot use outside the block
         System.out.println(a); 
        
        
    }


    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
