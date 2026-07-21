
// class  method {
//      static void Hello() {
//         for (int i=1; i<=3; i++) {
//         System.out.println("Hello Tushar");
//         }
//     }
//     public static void main(String[] args) {
//         Hello();
//     }
// }
  



// class  method {
//      static void Hello() {
//         for (int i=1; i<=3; i++) {
//         System.out.println("Hello Tushar");
//         }
//     }
//     static void massage(){
//             System.out.println(" what");
//         }
//         static void by() {
//         for (int i=1; i<=3; i++) {
//         System.out.println("Hello Tushar");
//         }
//     }
//     public static void main(String[] args) {
//         Hello();
//         massage();
//         by();
//     }
// }



// class method {
//     static void add (int a , int b) {
//         System.out.println(a+b);
//     }
//     public static void main(String[] args) {
//         add(20,45);
//         add(45,78);
//     }
// }




// class method {
//     static int add(int a, int b) {
//         return a + b;        
//     }
//     public static void main (String [] args){
//         int ans = add (45,65);
//         System.out.println(ans);
//     }
// }


// class method {
//     static int mult(int a, int b){
//         return a * b;
//     }
//     public static void main(String[] args) {
//         int ans = mult(5,9);
//         System.out.println(ans);
//     }
// }



// class method {
//     static void add(int a, int b) {
//         System.out.println(a+b);        
//     }
//     static void add(int a, int b,int c) {
//         System.out.println(a+b+c);
//     }
//     public static void main(String[] args) {
//         add (34,567);
//         add (34,54,45);
//     }
// }


// problem solve for PDF in JAVA METHOD


// Write a method to print Hello World. 

// class method {
//     static void main() {
//         System.out.println("Hello");
//     }
//     public static void main(String[] args) {
//         main ();
//     }
// }



//  Call the same method three times.

// class method {
//     static void main() {
//         for (int i=1; i<=3; i++) {
//             System.out.println("Hello World");
//         }
//     }
//     public static void main(String[] args) {
//         main();
//     }
// }





//  Create two methods and call both.

// class method {
//     static void sum (int a, int b) {
//         System.out.println(a+b);
//     }
//     static void add(int a, int b, int c) {
//         System.out.println(a+b+c);
//     }
//     public static void main(String[] args) {
        
//         sum(45,45);
//     }
// }




//  Write a method to print Welcome.

// class method {
//     static void main () {
//         System.out.println("Welcome");
//     }
//     public static void main(String[] args) {
//         main();
//     }
// }


//  Write square(int n).

// class method {
//     static void main (int n) {
//         System.out.println(n*n);
//     }
//     public static void main(String[] args) {
//         main(10);
//     }
// }


// Write max(int a,int b)

// import java.util.Scanner;
// class method {
//     static void main(int  a, int b) {
//         if (a<b){
//             System.out.println(b);
//         }
//         else {
//             System.out.println(a);
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter ");
//         int a = sc.nextInt();

//         System.out.println("enter");
//         int b = sc.nextInt();

//         main(a,b);
//     }
// }



// Write a method returning cube.

// class method {
//     static int cube(int n ) {
//         return n*n*n;
//     }
//     public static void main (String[]args) {
//         int ans = cube(5);
//         System.out.println(ans);
//     }
// }


// Return largest of three numbers.

// class method {
//     static int larg (int a, int b, int c) {
//         if (a>b && a>c) {
//             return a;
//         }
//         else if(b>a && b>c){
//             return b;
//         }
//         else
//         return c;
//     }
//     public static void main(String[] args) {
//         int ans = larg (34,67,12);
//         System.out.println(ans);
//     }
// }




// Overload display(String) and display(String,int)

// class method {
//     static void display(String name) {
//         System.out.println(name);
//     }
//     static void display(String name,int age) {
//         System.out.println( name );
//         System.out.println(age);
//     }
//     public static void main(String[] args) {
//         display("Tushar");
//         display("Tushar",22);
//     }
// }



//  Overload area() for square and rectangle.

// class method {
//     static int area (int side){
//         return  side*side;
//     }
//     static int area(int length, int width) {
//         return length*width;
//     }
//     public static void main(String[] args) {
//         System.out.println(area(4));
//         System.out.println(area(5,8));
//     }
// }



//  Overload show(int), show(double), show(String).

// class method {
//     static void main(int a) {
//         System.out.println("Integer = " +a);
//     }
//     static void main(double a) {
//         System.out.println("Double = "+a);
//     }
//     static void main(String a) {
//         System.out.println("String = "+a);
//     }
//     public static void main(String[] args) {
//         main(5);
//         main("Tushar");
//         main(67.7);
//     }
// }



// Factorial using recursion.

// class method {
//     static int fact(int n) {
//         if (n == 0) {
//         return 1;
//     }
//     return n * fact (n - 1 );
// }
//         public static void main (String[]args) {
//             System.out.println(fact(5));
//         }
//     }



// Fibonacci using recursion.

class method {

    static int fib(int n) {

        if (n == 0 || n == 1)
            return n;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        System.out.println(fib(5));

    }
}
