package OOPSinJava;



public class StudentClass {
    // creating a new data type = student 
    public static class student {   
        String name;
        int rollno;
        double percentage ;
    }
    
    
    public static void main(String[] args) {

        

        student x = new student(); // declaration
        x.name  = "Rahul";
        x.rollno = 33 ;
        x.percentage = 96.6 ;
        System.out.println(x.rollno +" "+ x.name +" "+ x.percentage);

        student s = new student();
        s.name = "Rohit";
        s.rollno = 32 ;
        s.percentage = 95.7;
        System.out.println(s.rollno+" "+s.name+" "+s.percentage);
    }
}
