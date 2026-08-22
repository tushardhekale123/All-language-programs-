//         r1.width = 5;

//         r1.main();
//     }
// }


// Bank Account 

// class BankAccount {
//     String accountHolder;
//     int accountNumber;
//     double balance;

//     void deposite (double amount) {
//         balance = balance + amount;
//         System.out.println("Deposite = " + amount );
//         System.out.println(balance);
//     }
//     void withdraw(double amount) {
//         if (amount <= balance) {
//             balance = balance - amount ;
//             System.out.println("Withdrawn = " +amount );
//         } else {
//             System.out.println("Insufficient Balance");
//         }
//     }
//     void displayBalance() {
//         System.out.println("current Balance = " + balance);
//     }
// }
// public class oop {
//     public static void main(String[] args) {
//     BankAccount account = new BankAccount();

//     account.accountHolder = "Tushar";
//     account.accountNumber = 123456;
//     account.balance = 10000;

//     account.displayBalance();
//     account.deposite(5000);
//     account.withdraw(2000);
//     account.displayBalance();
//     } 
// }


// Bank Account With Scanner
 
import java.util.Scanner;

class BankAccount {