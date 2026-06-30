// public class relational {
//     public static void main(String[] args) {
//         int num1 = 10;
//         int num2 = 5;

//         boolean isEqual = (num1 == num2);
//         boolean isNotEqual = (num1 != num2);
//         boolean isGreater = (num1 > num2);
//         boolean isLess = (num1 < num2);
//         boolean isGreaterOrEqual = (num1 >= num2);
//         boolean isLessOrEqual = (num1 <= num2);

//         System.out.println("Is Equal: " + isEqual);
//         System.out.println("Is Not Equal: " + isNotEqual);
//         System.out.println("Is Greater: " + isGreater);
//         System.out.println("Is Less: " + isLess);
//         System.out.println("Is Greater Or Equal: " + isGreaterOrEqual);
//         System.out.println("Is Less Or Equal: " + isLessOrEqual);
//     }
// }


// public class relational {
//     public static void main(String[] args) {
//         int x = 10;
//         int y = 5;

//     boolean result = x < y;

//     System.out.println("Result of x < y: " + result);

//     }
// }

import java.util.Scanner;
public class relational {
    public static void main ( String [] args ){
        Scanner sc = new Scanner (System.in);

        while (true) {
        System.out.println("Enter first number");
        int n = sc.nextInt();
        System.out.println("Enter second number");
        int m = sc.nextInt();   
        System.out.println(n<m);

        System.out.println("yes/no");
        String ch = sc.next();
        if (ch.equals("no")) {
            break;
        }
        }
    }
}