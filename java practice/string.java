//  Name Length

// public class string {
//     public static void main(String[] args) {
//         String name = "Tushar";
//         System.out.println(name.length());
//     }
// }

import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         
        System.out.println("Enter name");
        String n = sc.nextLine();

        System.out.println("Length = " + n.length());
    }
}