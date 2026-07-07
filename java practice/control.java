
// class control {
//     public static void main (String [] args){
//         System.out.println("Hello World");
//     }
// }



// class control {
//     public static void main (String [] args){
//         int n = 10;
//         double percentage = 75.5;
//         char grade = 'A';
//         boolean isPassed = true;
//         String name = "Tushar";

//         System.out.println("n = " + n);
//         System.out.println("percentage = " + percentage);
//         System.out.println("grade = " + grade);
//         System.out.println("isPassed = " + isPassed);
//         System.out.println("name = " + name);

//     }
// }



// class control {
//     public static void main (String [] args){
//         int n = 10;
//         double m = 75.5;
//         double sum = n + m;

//         System.out.println("Sum = " + sum);
//     }
// }

// import java.util.Scanner;
// class control {
//     public static void main (String [] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter your name");
//         String name = sc.nextLine();

//         System.out.println(name);
//     }
// }




//     import java.util.Scanner;
//     class control {
//     public static void main (String [] args){
//         Scanner sc = new Scanner(System.in);

//         while (true) {
//         System.out.println("Enter length = ");
//         double length = sc.nextDouble();

//         System.out.println("Enter breadth = ");
//         double breadth = sc.nextDouble();

//         double area = length * breadth;
//         System.out.println("Area of rectangle = " + area);

//         System.out.println("yes/no");
//         String ch = sc.next();

//         if (ch.equals("no"))
//         break;
//         }
//     }
// }




// import java.util.Scanner;
// class control {
//     public static void main (String [] args){
//          Scanner sc = new Scanner(System.in);
         
//          while (true) {
//          System.out.println("Enter no = ");
//          int n = sc.nextInt();

//             if (n%2==0){
//                 System.out.println(n + " is even");
//             } else {
//                 System.out.println(n + " is odd");

                
//             } System.out.println("yes/no");
//                 String ch = sc.next();  

//                 if (ch.equals("no"))
//                 break;
//          }
//     }
// }


// import java.util.Scanner;
// class control {
//     public static void main (String [] args) {

//         while (true) {
//         Scanner sc = new Scanner(System.in);
//         int n = 0;
//         System.out.println("Enter no = ");
//         int a = sc.nextInt();   

//         if (n == a){
//             System.out.println("no is zero");
//         } else if (a > 0) {
//             System.out.println("no is positive");
//         } else {
//             System.out.println("no is negative");
//           }
//           System.out.println("yes/no");
//           String ch = sc.next();

//           if (ch.equals("no"))
//           break;
//         }
//     }
// }


// class control {
//     public static void main (String [] args) {
//         int a = 10;
//         int b = 20;
//           System.out.println("Before swapping "+ "a = " + a + ", b = " + b);

//           int temp = a;
//           a = b;
//           b = temp;

//           System.out.println("After swapping "+ "a = " + a + ", b = " + b);
//     }
// }



// import java.util.Scanner;

// class control {
//     public static void main (String [] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter no = ");
//         int n = sc.nextInt();
//         System.out.println("Enter no = ");
//         int m = sc.nextInt();
//         System.out.println("Enter no = ");
//         int k = sc.nextInt();

//         if (n > m && n > k){
//             System.out.println(n + " is largest");
//         }
//         else if (m > n && m > k){
//             System.out.println(m + " is largest");
//         }
//         else {
//             System.out.println(k + " is largest");
//         }

//     }
// }