
import java.util.Scanner;


//     }
// }


// public class IfElse {
//     public static void main(String[] args) {
//         int x =20 ;

//         if (x>10) 
//         System.err.println("HELLO");

//         else
//         System.out.println("BYE");
//     }
// }


// public class IfElse {
//     public static void main(String[] args) {
//         int x =20 ;
//         int y =15 ;
//         int z =5 ;

//         if (x>10 && x<=19) 
//         System.err.println(x);

//         else if (y<z && y>x)
//         System.out.println(y);

//         else 
//         System.out.println(z);
//     }
// }




// public class IfElse {
//     public static void main(String[] args) {
//         int x =20 ;
//         int y =15 ;
//         int z =5 ;

//         if (x>10 && x<=19) 
//         System.err.println(x);

//         else if (y>z && y<x)
//         System.out.println(y);

//         else 
//         System.out.println(z);
//     }
// }




// public class IfElse {
//     public static void main(String[] args) {
//         int n = 10;
//         if (n % 2 == 0) {
//             System.out.println("even");
//         } else {
//             System.out.println("odd");
//         }
//     }
// }



// public class IfElse {
//     public static void main(String[] args) {


//         Scanner SC = new Scanner(System.in); 
        
//             int n = SC.nextInt();
//             if (n % 2 == 0) { 

//             System.out.println("even" );
//         } else {
//             System.out.println("odd");
//         }
//         }
//      }



// public class IfElse {
//     public static void main(String[] args) {  

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if (n < 0) {
//             System.out.println("Negative Number");
//         } else 
//         System.err.println("Positive Number");


//     }
//  }  



// public class IfElse {
//     public static void main(String[] args) {
         
//         Scanner sc = new Scanner(System.in);

//         System.err.println("Enter a number1  : ");
//         int a = sc.nextInt();

//         System.err.println("Enter a number2  : ");
//         int b = sc.nextInt();

//         if (a > b) {
//             System.out.println("a is greater than b");
//         } else if (a < b) {
//             System.out.println("b is greater than a");
//         } else {
//             System.out.println("a and b are equal");
//         }
         
//     }
// }

// public class IfElse {
//     public static void main(String[] args) {
         
//         Scanner sc = new Scanner(System.in);

//         System.err.println("Enter a numbe  : ");
//         int Year = sc.nextInt();

//         if (Year % 2 == 0) {
//             System.out.println("leap year");
        
//         } else {
//             System.out.println("Not a leap year");
//         }
         
//     }
//  }




// public class IfElse {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.err.println("Enter a numbe  : ");
//         int a = sc.nextInt();  

//         System.err.println("Enter a numbe  : ");    
//         int b = sc.nextInt();   

//         System.err.println("Enter a numbe  : ");    
//         int c = sc.nextInt();   

//         if (a>b && a>c) {
//             System.out.println("a is greatest");
//         } else if (b>c) {
//             System.err.println("b is greatest");
//         }else {
//             System.out.println("c is greatest");
//         }   
//     }
// }


// public class IfElse {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter Grade");
//         int no = sc.nextInt();
        
//         if (no == 100) {
//             System.out.println("Excellent");
//         } else if (no <=90) {
//             System.out.println("Good");
//         } else if (no <= 75) {
//             System.out.println("Average");
//         } else if (no <= 50) {
//             System.out.println("Poor");
//         } else if (no <= 35) {
//             System.out.println("Fail");
//         } else {
//             System.out.println("Invalid Grade");
//         }
//     }
// }

// public class IfElse {
//     public static void main(String[] args) {
         
//         int balance = 1000;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int amt = sc.nextInt();

//         if (balance >= amt) {
//             System.out.println("successful withdrawal");
//         } else {
//             System.out.println("Insufficient Balance");
//         }
//     }
// }  



public class IfElse {
    public static void main(String[] args) {
         
        
        String username = "Tushar", password = "12345";
        Scanner sc = new Scanner(System.in);
        System.out.println("ID");

        String user = sc.nextLine();
        System.out.println("Password");
        String pass = sc.nextLine();

        if (username.equals(user) && password.equals(pass)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Credentials");
        }
      
    }
 }