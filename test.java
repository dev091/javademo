class Test { // class name test
    int a=2;    // instance variable
    String name="Rohan" ;

        public static void main(String[] args) {   
        // declare the variable
        // create the object
            int num = 9;  //local variable
        
            Test obj1 = new Test(); //This is an object of class Test created using the "new" keyword
            Test obj2 = new Test();
        
            obj1.name = "Rahul";
            obj1.a = 10;
        
            System.out.println(obj1.name); // output: Rahul
            System.out.println(obj1.a); // output: 10
            System.out.println(obj2.name); // output: null
            System.out.println(obj2.a); // output: 0
        }
        
    }
