package Array;

public class Jaggedarray1 {

	public static void main(String[] args) {
        int a[][]={{5,6,2},
                   {7,8,9,5},
                   {3,5,4,1}};
                   System.out.println(a[0][2]);
                   System.out.println(a.length);
                   int totalElements = 0;
                   for (int i=0 ;i<a.length;i++){
                    totalElements = totalElements+a[i].length;
                   }
                   System.out.println(totalElements);
                   }
}
