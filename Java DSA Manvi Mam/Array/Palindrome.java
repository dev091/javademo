package Array;

public class Palindrome {
    public static void main(String[] args) {
        
        int []x = {1,2,3,2,4};
        int n = x.length;
        boolean isPalindrome = true;
        for(int i=0 ; i<n/2 ; i++){
            if(x[i] != x[n-i-1]) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) {
            System.out.println("The array is a palindrome");
        } else {
            System.out.println("The array is not a palindrome");
        }
    }
}
