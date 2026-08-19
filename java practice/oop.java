class Student {
    String name;
    int age;
    String college;
     
    void study() {
        System.out.println("Student is studying...");
    }
}
public class oop {
    public static void main(String[] args) {
         
        Student s1 = new Student();

        s1.name = "Tushar";
        s1.age = 21;
        s1.college = "Sipna college";

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.college);

        s1.study();

    }
}