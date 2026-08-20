// Student 

// class Student {
//     String name;
//     int age;
//     String college;
     
//     void study() {
//         System.out.println("Student is studying...");
//     }
// }
// public class oop {
//     public static void main(String[] args) {
         
//         Student s1 = new Student();

//         s1.name = "Tushar";
//         s1.age = 21;
//         s1.college = "Sipna college";

//         System.out.println(s1.name);
//         System.out.println(s1.age);
//         System.out.println(s1.college);

//         s1.study();

//     }
// }



// Car

// class Car {
//     String brand;
//     String color;

//     void drive() {
//         System.out.println(brand +"is driving");
//     }
// }
// public class oop {
//     public static void main(String[] args) {
//         Car c1 = new Car();

//         c1.brand = "BMW";
//         c1.color = "Black";

//         Car c2 = new Car(); 

//         c2.brand = "Audi";
//         c2.color = "White";

//         System.out.println(c1.brand);
//         System.out.println(c1.color);

//         System.out.println(c2.brand);
//         System.out.println(c2.brand);

//         c1.drive();
//         c2.drive();
//     }
// }



// Rectangle

// class Rectangle {
//     int length;
//     int width;

//     void main () {
//         int area = length * width;
//         System.out.println(area);
//     }
// }
// public class oop {
//     public static void main(String[] args) {
//         Rectangle r1 = new Rectangle();

//         r1.length = 10;
//         r1.width = 5;

//         r1.main();
//     }
// }


// Bank Account 

class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    void deposite (double amount) {
        balance = balance + amount;
        System.out.println("Deposite = " + amount );
        System.out.println(balance);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount ;
            System.out.println("Withdrawn = " +amount );
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    void displayBalance() {
        System.out.println("current Balance = " + balance);
    }
}
public class oop {
    public static void main(String[] args) {
    BankAccount account = new BankAccount();

    account.accountHolder = "Tushar";
    account.accountNumber = 123456;
    account.balance = 10000;

    account.displayBalance();
    account.deposite(5000);
    account.withdraw(2000);
    account.displayBalance();
    } 
}