//  class  calculator {
// public int add(int a, int b){ 
//         int r = a + b; 
//         return r;
//     } 
// }
// public class object {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 5;
        
//         calculator calc = new calculator();
//         int result = calc.add(a,b);
//         System.out.println(result);
//     }
// }



// class Student {
//     int roll;
//     String name;

//     Student(int id , String n) {
//         roll = id;
//         name = n;
//     }
//     void show() {
//         System.out.println(roll + " " + name);
//     }
// }
// public class main {
//     public static void main(String[] args) {
        
//         Student s1 = new Student(1, "Tushar");
//         Student s2 = new Student(2, "Navya");
//         Student s3 = new Student(3, "aarya");

//         s1.show ();
//         s2.show (); 
//         s3.show (); 
//     }
// }



// class Student {
//     int roll;
//     String name;    
//     int marks;

//     Student (int r , String n , int m) {
//         roll = r;
//         name = n;
//         marks = m;
//     }
//     void result() {
//         if (marks >= 45)
//         System.out.println(name + " is pass");
//         else    
//         System.out.println(name + " is fail but she is tushar girlfrieng so she is pass ");  
//     }
// }
// public class main {
//     public static void main(String[] args) {
//         Student s1 = new Student(1, "Tushar", 80);      
//         Student s2 = new Student(2, "Navya", 40);

//         s1.result();
//         s2.result();
//     }
// }




// class Mobile{
//     public void call() {
//         System.out.println("calling...");
//     }
//     public void message() {
//         System.out.println("messaging...");
//     }
// public int battery() {
//     return 78;
// }
// }
// public class Demo {
//     public static void main(String[] args) {
        
//         Mobile m = new Mobile();
//         m.call();
//         m.message();

//         int b = m.battery();
//         System.out.println(b);
//     }
// }



class Calculator {
    public int add(int a, int b,int c) {
       return a+b+c;
       
    }
    public int add (int a,int b) {
        return a+b;
    }
    public double Add (double a,double b) {
        return a+b;
    }
 }
 public class Demo {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        
        int r1 = cal.add(10,20,30); 
        System.out.println(r1);

        int r2 = cal.add(20,50);
        System.out.println(r2);

        double r3 = cal.Add(23.4,45.8);
        System.out.println(r3);
    }
 }




