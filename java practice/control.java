
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




// import java.util.Scanner;
// class control {
//     public static void main (String [] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter mark of subject 1: ");
//         int sub1 = sc.nextInt();
//         System.out.println("Enter mark of subject 2: ");
//         int sub2 = sc.nextInt();
//         System.out.println("Enter mark of subject 3: ");
//         int sub3 = sc.nextInt();
//         System.out.println("Enter mark of subject 4: ");
//         int sub4 = sc.nextInt();
//         System.out.println("Enter mark of subject 5: ");
//         int sub5 = sc.nextInt();
         
//         int total = sub1 + sub2 + sub3 + sub4 + sub5;
//         System.out.println("Total marks: " + total);
//         double Percentage = total / 5.0;
//         System.out.println("Percentage: " + Percentage);

//         if (Percentage >= 90) {
//             System.out.println("Grade: A");
//         } else if (Percentage >= 80) {
//             System.out.println("Grade: B");
//         } else if (Percentage >= 70) {
//             System.out.println("Grade: C");
//         } else if (Percentage >= 60) {
//             System.out.println("Grade: D");
//         } else {
//             System.out.println("Grade: F");
//         }
//     }
// }



// import java.util.Scanner;

// class control {
//     public static void main (String [] args) {
//         while (true) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter year  = ");
//         int year = sc.nextInt();

//         if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
//             System.out.println(year + " is a leap year");
//         } else {
//             System.out.println(year + " is not a leap year");
//         }
//         System.out.println("yes/no");
//         String ch = sc.next();
//         if (ch.equals("no"))
//         break;
//         }
//     }
// }




// import java.util.Scanner;

// class control {
//     public static void main (String [] args) {
//         Scanner sc = new Scanner (System.in);

//         System.out.println("Enter no = ");
//         int n = sc.nextInt();   
//         System.out.println("Enter no = ");
//         int m = sc.nextInt();

//         System.out.println("choose operation: ");
//         System.out.println("1. +");
//         System.out.println("2. -");   
//         System.out.println("3. *");
//         System.out.println("4. /");

//         int choose = sc.nextInt();

//         switch (choose) {
//             case 1:
//                 System.out.println("Sum = " + (n + m));
//                 break;
//             case 2:
//                 System.out.println("Difference = " + (n - m));
//                 break;
//             case 3:
//                 System.out.println("Product = " + (n * m));
//                 break;
//             case 4:
//                 if (m != 0) {
//                     System.out.println("Quotient = " + (n / m));
//                 } else {
//                     System.out.println("Error: Division by zero");
//                 }
//                 break;
//         }
//     }
//  }



// import java.util.Scanner;
// class control {
//     public static void main (String [] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Table  no = ");
//         int n = sc.nextInt();

//         for (int i = 1; i <= 10; i++) {
//             System.out.println(n + " * " + i + " = " + (n * i));
//         }
//     }
// }




// import java.util.Scanner;
// class control {
//     public static void main (String [] args) {
//         Scanner sc = new Scanner(System.in);
       
//         System.out.println("Enter no = ");
//         int n = sc.nextInt();

//         for (int i = 1; i <= n; i++ ){
//             System.out.println(i);
//         }
//     }
// }



// import java.util.Scanner;
// class control {
//     public static void main (String [] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter no = ");
//         int n = sc.nextInt();

//         int reverse = 0;

//         while (n != 0) {
//             int digit = n % 10;
//             reverse = reverse * 10 + digit;
//             n = n / 10;
//         }
//         System.out.println("Reverse = " + reverse);
//     }
// }




// import java.util.Scanner;
// class control {
//     public static void main (String [] args) {
//         while (true) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter no = ");
//         long n = sc.nextLong();

//         int count = 0;
//         while (n != 0){
//             n = n/10;
//             count++;
//         }
//         System.out.println("Count of digits = " + count);

//         System.out.println("yes/no");
//     String ch = sc.next();
//     if (ch.equals("no"))
//     break;

//     }
    
//     }
// }





// import java.util.Scanner;
// class control {
//     public static void main (String [] args) {
//         Scanner sc = new Scanner (System.in);

//         System.out.println("Enter no = ");
//         int n = sc.nextInt();
        
//         int original = n;
//         int sum = 0;

//         while(n != 0) {
//             int digit = n % 10;
//             sum = sum * 10 + digit;
//             n = n / 10;
//         }
//         if (sum == original) {
//                 System.out.println("Palindrome");
//             } else {
//                 System.out.println("Not Palindrome");
//             }
//     }
// }


// import java.util.Scanner;
// class control {
//     public static void main (String [] args ) { 
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter no = ");
//         int n = sc.nextInt();

//         int first = 0;
//         int second = 1;

//         for (int i = 1; i<= n; i++) {
//             System.out.print(first + " ");
        
//         int next = first + second;
//         first = second;
//         second = next;
//         }
//     }
// }



// import java.util.Scanner;
// class control {
//     public static void main (String [] args ) { 
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter no = ");
//         int n = sc.nextInt();

//         int count = 0;

//         for (int i = 1; i <= n; i++) {
//             if (n % i == 0) {
//                 count++;
//             }
//         }
//         if (count == 2) {
//             System.out.println(n + " is prime");
//         } else {
//             System.out.println(n + " is not prime");
//         }

//     }
// }



// import java.util.Scanner;
// class control {
//     public static void main (String [] args ) { 
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter no = ");
//         int end  = sc.nextInt();

//        for (int n = 1; n <= end; n++) {
//         int count = 0;

//         for (int i=1; i<=n; i++){
//             if(n % i == 0){ 
//             count++;
//             }
//         }
//         if (count == 2){
//         System.out.println(n +" ");
//         }
//        }
//     }
// }


import java.util.Scanner;
class control{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no");
        int end = sc.nextInt();

        for (int n = 1; n <= end; n++){
            int count = 0;

            for (int i=1; i <= n; i++){
                if (n % i == 0){
                    count++;
                }
            }
               if (count == 2){
                System.out.println(n +"");
               }
        }


    }
}