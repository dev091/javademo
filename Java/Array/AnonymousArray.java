package Array;

class Calc {
    public int add(int num[]) // method
    {
        int result = 0;
        for (int n : num) {
            result = result + n;
        }
        return result;
    }

}

public class AnonymousArray {
    public static void main(String[] args) {

        Calc obj = new Calc();
        int result = obj.add(new int[] { 5, 6, 4, 3 });
        System.out.println(result);
    }
}