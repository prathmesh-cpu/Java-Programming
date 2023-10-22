import java.util.*;

public class _3constructors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Non-parameterized called --->
        Student s1 = new Student();
        s1.name = "Ram";
        
        // Parameterized called --->
        Student s2 = new Student("Prathamesh");
        s2.name = "Ram";
        Student s3 = new Student(20);
        s3.name = "Ram";
        Student s4 = new Student("Prathamesh", 20); // Multiple parameters
        s4.name = "Ram";

        // Copying constructor --->
        Student s5 = new Student();
        s5.name = "Ram";
        s5.age = 25;
        s5.password = "ABC";
        s5.marks[0] = 75;
        s5.marks[1] = 85;
        s5.marks[2] = 95;

        Student s6 = new Student(s5); // Copy values of object s5 to object s6.
        s6.password = "XYZ";
        s5.marks[0] = 100; // Update the value of s5 after copying all the values of s5 to s6

        for (int i = 0; i < 3; i++) {
            System.out.println(s6.marks[i]); // Updated value is reflected in s6 also.
        }

        // this.marks = stud.marks --->
        // This statement doesn't copies whole array values to new array for s6,
        // instead it just copies reference of array.

        sc.close();
    }
}

class Student {
    String name;
    int age;
    String password;
    int marks[];

    // Copy costructor --->
    Student(Student stud) {
        marks = new int[3];
        this.name = stud.name;
        this.age = stud.age;
        this.marks = stud.marks;
    }

    // Non-parameterized constructor --->
    Student() {
        marks = new int[3];
        System.out.println("Constructor is called...");
    }

    // Parameterized constructor --->
    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int age) {
        marks = new int[3];
        this.age = age;
    }

    Student(String name, int age) {
        marks = new int[3];
        this.name = name;
        this.age = age;
    }
}