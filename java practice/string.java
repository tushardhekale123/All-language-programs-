//  Name Length

// public class string {
//     public static void main(String[] args) {
//         String name = "Tushar";
//         System.out.println(name.length());
//     }
// }


// import java.util.Scanner;
// public class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
         
//         System.out.println("Enter name");
//         String n = sc.nextLine();

//         System.out.println("Length = " + n.length());
//     }
// }

// charAt()
 
// class string {
//     public static void main(String[] args) {
//         String name = "Tushar";
//         System.out.println(name.charAt(3));
//     }
// }

// import java.util.Scanner;
// class string {
//   public static void main(String[] args) {
//  Scanner sc = new Scanner (System.in);

//  System.out.println("Enter Name = ");
//  String n = sc.nextLine();

//  System.out.println(" = " + n.charAt(2));
//   } 
// }


// toUpperCase()

// class string {
//     public static void main(String[] args) {
//         String n = "Tushar";

//         System.out.println(n.toUpperCase());
//     }
// }

// toLowerCase

// class string {
//     public static void main(String[] args) {
//         String n = "TUSHAR";
//         System.out.println(n.toLowerCase());
//     }
// }

// equals

// class string {
//     public static void main(String[] args) {
//         String a = "JAVA";
//         String b = "java";

//         System.out.println(a.equals(b));
//     }
// }

// equalsIgnoreCase()
 
// class string {
//     public static void main(String[] args) {
//         String a = "TUSHAR";
//         String n = "tushar";
//         System.out.println(a.equalsIgnoreCase(n));
//     }
// }

// contains

// class string {
//     public static void main(String[] args) {
//         String n = "Java Programming";
//         System.out.println(n.contains("Java"));
//     }
// }

// import java.util.Scanner;
// class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); 
//         String n = "Tuhsar Jitendra Dhekale";

//         System.out.println("Enter Word");
//         String m = sc.nextLine();

//         System.out.println(n.contains(m));
//     }
// }    

// substring 

// class string {
//     public static void main(String[] args) {
//         String name  = "Tushar";
//         System.out.println(name.substring(1,3));
//     }
// }


// replace 

// class string {
//     public static void main(String[] args) {
//         String n = "Tushar";
//         System.out.println(n.replace('u','B'));
//     }
// }

// indexOf

// class string {
//     public static void main(String[] args) {
//         String n = "Tushar";
//         System.out.println(n.indexOf('T'));
//     }
// }


// ................StringBuilder.............

// append()

// class string {
//     public static void main(String[] args) {
//         StringBuilder n = new StringBuilder("Java");
//         n.append("DSA");
//         System.out.println(n);
//     }
// }

// insert()

// class string {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Java");
//         sb.insert(0,"DSA ");
//         System.out.println(sb);
//     }
// }

// Delete

// class string {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Hello Java");
//         sb.delete(0,3);
//         System.out.println(sb);
//     }
// }

// deleteCharAt

// class string {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("JVAA");
//         sb.deleteCharAt(1);
//         System.out.println(sb);
//     }
// }

// reverse

// class string {
//     public static void main(String[] args) {
//         StringBuffer sb = new StringBuffer("I Love India");
//         sb.reverse();
//         System.out.println(sb);
//     }
// }

// setCharAt

// class string {
//     public static void main(String[] args) {
//         StringBuffer sb = new StringBuffer("Java");
//         sb.setCharAt(0,'k');
//         System.out.println(sb);
//     }
// }

// length

// class string {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("JAVA");
//         System.out.println(sb.length());
//     }
// }


// .............Buffer.............

// insert

class string {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello Java");
        sb.insert(0,"navya ");
        System.out.println(sb);
    }
}