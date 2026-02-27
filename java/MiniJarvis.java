import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

class MiniJarvis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String command;

        System.out.println("🤖 Mini Jarvis Activated");
        System.out.println("Type your command:");

        while (true) {

            System.out.print("You: ");
            command = sc.nextLine().toLowerCase();

            if (command.equals("hello")) {
                System.out.println("Jarvis: Hello Sir!");

            } else if (command.equals("time")) {
                System.out.println("Jarvis: Time is " + LocalTime.now());

            } else if (command.equals("date")) {
                System.out.println("Jarvis: Date is " + LocalDate.now());

            } else if (command.equals("your name")) {
                System.out.println("Jarvis: My name is Mini Jarvis");

            }else if (command.equals("year")){
                System.out.println("year is yrar "+ LocalDate.now().getYear());

            } else if (command.equals("by jarvis")) {
                System.out.println("Jarvis: Goodbye Sir!");
                break;

            } else {
                System.out.println("Jarvis: Sorry, I don't understand");
            }
        }

        sc.close();
    }
}
