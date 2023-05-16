package OOPSinJava;

public class Triangle1 {
    int x = 3;int y = 4 ; int z = 5   ;
    
    public static void main(String[] args) {
        Triangle1 a = new Triangle1();
        int perimeter = a.x + a.y + a.z ;
        System.out.println(perimeter + " is perimeter of triangle");
    }
}
