package OOPSinJava;

public class Student1 {
    int rollNo ;
    String studentName ;

    public static void main(String[] args) {
        Student1 a = new Student1();
        a.rollNo = 2;
        a.studentName = "John"; 
        System.out.println(a.rollNo);
        System.out.println(a.studentName);

        Student1 b = new Student1();
        b.rollNo = 3;
        b.studentName = "Mariam";
        System.out.println(b.rollNo);
        System.out.println(b.studentName);
    }
    
}
