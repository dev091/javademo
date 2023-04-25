package Array;

public class Reverse {
    public static void main(String[] args) {
        int []x = {2,3,9,8,7};
        int n = x.length;
        for( int i=4 ; i>=0 ; i--){
            // swap the elements between x[i], x[n-i-1] 
            System.out.print(x[i]); // 
        }
        System.out.println();
    }
    
}
