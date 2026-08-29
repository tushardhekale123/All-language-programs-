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

class Exception {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        int result = a / b;

        System.out.println(result);
    }
}