package OOPSinJava;

public class Triangle {
    int x = 3, y = 4, z = 5;

    public static void main(String[] args) {
        Triangle a = new Triangle();
        int perimeter = a.x + a.y + a.z;
        System.out.println("Perimeter of triangle: "+ perimeter);
    }
}