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


class Rectangle {
    int length;
    int width;

    void main () {
        int area = length * width;
        System.out.println(area);
    }
}
public class oop {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();

        r1.length = 10;
        r1.width = 5;

        r1.main();
    }
}