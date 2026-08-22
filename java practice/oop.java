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
 
// import java.util.Scanner;

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
//     Scanner sc = new Scanner(System.in);
//     BankAccount account = new BankAccount();

//     account.accountHolder = "Tushar";
//     account.accountNumber = 123456;
//     account.balance = 10000;

//     account.displayBalance();

//     System.out.println("Enter Deposit Amount :-");
//     double dipositeAmount = sc.nextDouble();
//     account.deposite(dipositeAmount);

//     System.out.println("Enter withdraw Amount");
//     double withdraw = sc.nextDouble();
//     account.withdraw (withdraw);

//     account.displayBalance();
//     } 
// }



// proper bank System 

// import java.util.Scanner;

// class BankAcount {
//     String accountHolder;
//     int accountNumber;
//     double balance;

//     void diposite(double amount) {
//         balance = balance + amount;
//         System.out.println("Diposite = " + amount );
//         System.out.println("Current Balance = " + balance );
//     }
//     void withdraw (double amount) {
//         if (amount <= balance) {
//             balance = balance - amount ;
//             System.out.println("Withdraw = " + amount );
//             System.out.println("Current Balance = " + balance);
//         } else {
//             System.out.println("Insufficient Balance");
//         }
//     }
//     void displayBalance() {
//         System.out.println("Current Balance = " + balance);
//     }
// }
// public class oop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         BankAcount account = new BankAcount();

//         System.out.println("Enter Account Holder Name = ");
//         account.accountHolder = sc.nextLine();

//         System.out.println("Enter Account Number = ");
//         account.accountNumber = sc.nextInt();

//         account.balance = 10000;

//         System.out.println(" Account Create Successfully!");
//         account.displayBalance();

//         while (true) {
//              System.out.println("----- BANK MENU -----");
//             System.out.println("1. Deposit");
//             System.out.println("2. Withdraw");
//             System.out.println("3. Check Balance");
//             System.out.println("4. Exit");

//             System.out.println("Enter your choice");
//             int choice = sc.nextInt();

//             if (choice == 1) {
//                 System.out.println("Enter Diposite Amount = ");
//                 double amount = sc.nextDouble();

//                 account.diposite(amount);

//             } else if (choice == 2) {
//                 System.out.println("Enter Withdraw Amount = ");
//                 double amount = sc.nextDouble();

//                 account.withdraw(amount);

//             }else if (choice == 3) {
//                 account.displayBalance();

//             }else if (choice == 4 ) {
//                 System.out.println("Thank You");
//                 break;

//             }else {
//                 System.out.println("Invalid Choice!");
//             }
//         }
//     }
// }






// ...............Constructer..........................


// no argumant

// class Student {
//     String name;
//     int age;

//     Student() {
//         name = "n";
//         age = 0;
//     }
// }
// public class oop {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         System.out.println(s1.name);
//         System.out.println(s1.age);
//     }
// }


// parameterizzed constructer

// class student {
//     String name;
//     int age;

//     student(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }
// }
// public class oop  {
//     public static void main(String[] args) {
//         student s1 = new student("Tushar",21);
//         System.out.println("name = " + s1.name);
//         System.out.println("age = " + s1.age);
//     }
// }



// class student {
//     String name ;
//     int age ;

//     student (String name, int age ) {
//         this.name = name ;
//         this.age = age;
//     }
// }
// public class oop {
//     public static void main(String[] args) {
//         student s1 = new student("Tushar",21);
//         student s2 = new student("Munna ",34);

//         System.out.println(s1.name);
//         System.out.println(s2.name + s2.age);
//     }
// }



// this instance method

// class student {
//     String name;

//     void display() {
//         System.out.println(this.name);
//     }
// }
// public class oop {
//     public static void main(String[] args) {
//         student s1 = new student();

//         s1.name ="Tushar";
//         s1.display();
//     }
// }


// ..............practice code 1..................

// class student {
//     String name;
//     int age ;

//     student() {
//         name = "Tushar";
//         age = 21;
//     }
// }
// public class oop {
//     public static void main(String[] args) {
//         student s1 = new student();

//         System.out.println(s1.name);

//     }
// }


class student {
    String name ;
    int age ;
 
    student (String name,int age) {
     this.name = name;
     this.age = age;
    }
    void display () {
        System.out.println("kay kart aahe ");
    }
}
public class oop {

    public static void main(String[] args) {
        student s1 = new student ("Tushar",45);
        System.out.println(s1.name);
        s1.display();
    }
}