package Array;

public class ArrayPractice {

    public static void main(String[] args) {
        // 1. Declaration and Initialization:
        int num []= {10,20,30,40,50};
        

        //1.2. Accessing Elements:
        System.out.println(num[1]);

        //1.3. Updating Elements:
        num[2] = 31;
        System.out.println(num[2]);

        //1.4. Array Length:
        System.out.println(num.length);
       
        //1.5 Iteration:

        //for loop

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
            
        }
        // for each loop
        for (int i : num) {
            System.out.println(i+" ");
            
        }

        //1.6. Searching for an Element:

        int target = 31 ; 
        for (int i = 0; i < num.length; i++) {
            if (num[i]== target){
            System.out.println("number found at index "+ i);
                break ;
            }

        }
     //1.7 printing value and index
        for (int i = 0; i < num.length; i++) {
            System.out.println("item at index "+i+ " : "+ num[i]);
            
        }
    }
    
}
