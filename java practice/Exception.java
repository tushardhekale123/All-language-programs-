// ChackException

// import java.io.FileReader;
// import java.io.IOException;

// class Exception {
//     public static void main(String[] args) {

//         try {
//             FileReader file = new FileReader("Flutter Projects");
//             System.out.println("File opened successfully");
//         } catch (IOException e) {
//             System.out.println("Unable to open file");
//         }
//     }
// }


//  UnChacked Exception

// class Exception {
//     public static void main(String[] args) {

//         int a = 10;
//         int b = 0;

//         int result = a / b;

//         System.out.println(result);
//     }
// }


// Try

// class Exception {
//     public static void main(String[] args) {
//         try {
//             int result = 10/0;
//             System.out.println(result);
//         }
//         catch (ArithmeticException e){
//             System.out.println("Cannot divide by zero");
//         }
//     }
// }


// catch (ArithmeticException e)

// class Exception {
//     public static void main(String[] args) {
//         try {
//             int result = 10/0;
//             System.out.println(result);
//         }
//         catch (ArithmeticException e){
//             System.out.println(e);
//         }
//     }
// }

// e.getMessage()


// class Exception {
//     public static void main(String[] args) {
//         try {
//             int result = 10/0;
//             System.out.println(result);
//         }
//         catch (ArithmeticException e){
//             System.out.println(e.getMessage());
//         }
//     }
// }


// e.printStackTrace()

// class Exception {
//     public static void main(String[] args) {
//         try {
//             int result = 10/0;
//             System.out.println(result);
//         }
//         catch (ArithmeticException e){
//             e.printStackTrace();
//         }
//     }
// }


//  finally

// class Exception {
//     public static void main(String[] args) {
//         try {
//             int result = 10/0;
//             System.out.println(result);
//         }
//         catch (ArithmeticException e) {
//             System.out.println("Cannot divide by zero");
//         }
//         finally {
//             System.out.println("Finally execute");
//         }
//     }
// }