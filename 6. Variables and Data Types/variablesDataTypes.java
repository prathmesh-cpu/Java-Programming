import java.util.*;

public class variablesDataTypes {

    public static void main(String[] args) {
        // System.out.print(); ==> To print output on single line
        System.out.println("Hello World"); // ==> To print output on new line.

        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");

        // Variables ==>
        int a = 10, b = 5;
        System.out.println(a + " " + b);
        String name = "Prathamesh Dhavale";
        System.out.println("My name is " + name);

        // Data Types ==>
        /*
         * -------------- Primitive Data Types --------------
         * byte => 1 byte => [-128 to 127] => (256)
         * short => 2 bytes
         * char => 2 bytes
         * boolean => 1 byte
         * int => 4 bytes
         * long => 8 bytes
         * float => 4 bytes
         * double => 8 bytes
         * 
         * -------------- Non - Primitive Data Types --------------
         * String
         * Array
         * Class
         * Object
         * Interface
         */

        byte c = 8;
        char ch = 'a';
        boolean boolVar = true;
        float price = 10.5f;
        double amnt = 6.999999999999;
        int num = 8;
        long number = 123456789987654321L;
        short sho = 132;
        System.out.println(c + " " + ch + " " + boolVar + " " + price);
        System.out.println(amnt + " " + num + " " + number + " " + sho);

        int num1 = 10, num2 = 5, sum;
        sum = num1 + num2;
        System.out.println("Sum of Two Numbers: " + sum);

        // -----------------------------------------------------------------------------
        // Inputs ==>
        /*
         * next ==> To get a single word String as an input
         * nextLine ==> To get a sentence String as an input
         * nextInt ==> To get a Number as an input
         * nextByte ==> To get a Byte value
         * nextFloat ==> To get a Floating number
         * nextDouble ==> To get a Floating double number
         * nextBoolean ==> To get a Boolean value
         * nextShort ==> To get a Short number
         * nextLong ==> To get a Long number
         */

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Your Name: ");
        // String str = sc.next();
        // System.out.println("Hi " + str);

        // System.out.print("Enter Your Full Name: ");
        // String fullName = sc.nextLine();
        // System.out.println("Hello " + fullName);

        // System.out.print("Enter Any Number: ");
        // int numb = sc.nextInt();
        // System.out.println("Number: " + numb);

        // System.out.print("Enter Any Amount: ");
        // float Price = sc.nextFloat();
        // System.out.println("Number: " + Price);

        // System.out.print("Enter Any Amount: ");
        // double Price = sc.nextDouble();
        // System.out.println("Number: " + Price);

        // sc.close();

        // Sum of a & b ==>
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        a = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        b = sc.nextInt();

        sum = a + b;
        int product = a * b;

        System.out.println("Addition of " + a + " & " + b + ": " + sum);
        System.out.println("Multiplication of " + a + " & " + b + ": " + product);

        System.out.print("Enter the Radius of Circle: ");
        float radius = sc.nextFloat();
        float area = 3.142f * radius * radius;
        System.out.println("Area of Circle: " + area);
        sc.close();

        // -----------------------------------------------------------------------------
        // Type Conversion ==>
        /*
         * Or Implicit/ Widening conversion.
         * 
         * Conversion happens when:
         * a. type compatible
         * b. destination type > source type
         * -------------------------------------------------------
         * Conversion happens this ways ==>
         * byte -> short -> int -> float -> long -> double
         * <----- This way is lossy conversion, java consider that some data will lose
         * -------------------------------------------------------
         */

        a = 10; // Int
        price = a; // Float
        System.out.println("Type Conversion: " + price);

        // Char to Number Conversion
        ch = 'a';
        number = ch;
        System.out.println("Number of 'a': " + number);

        // -----------------------------------------------------------------------------
        // Type Casting ==>
        /*
         * Or Explicit/ Narrowing conversion.
         * 
         * Casting is created by Programmer.
         * byte -> short -> int -> float -> long -> double
         * byte <- short <- int <- float <- long <- double
         * Both ways are compaible for type casting
         */

        int marks = (int) (99.99f);
        System.out.println("Type Casting: " + marks);

        // -----------------------------------------------------------------------------
        // Type Promotion in JAVA
        /*
         * 1. Java automatically promotes each byte, short, or char operand to int when
         * evaluating an expression
         * 2. If one operand is long, float or double the whole expression is promote to
         * long, float, or double respectively.
         */

        char cha = 'd';
        short sh = 8;
        System.out.println("Char + Short: " + (cha + sh));

        char x = 'x', y = 'y', z = 'z';
        System.out.println("x + y + z: " + (x + y + z));

        int p = 10;
        float q = 69.69f;
        double r = 31.31;
        long s = 10000;
        double t = (p + q + r + s);
        System.out.println("Int + Float + Double + Long: " + t);

        // ----------------------------------------------------------------------------
        // ************************| How Java Code is Running |************************

        // JDK => Java Development Kit => JRE + Development tools
        // JRE => Java Runtime Environment => JVM + Libraries
        // JVM => Java Virtual Machine

        /*
         * Source Code .java --> Compiler --> Byte Code .class --> JVM --> Native Code
         * |---------- Compilation☝️ ----------| |---------- Execution☝️ ----------|
         */
        // Java is a Portable Language because its byte code is run on any OS.
    }
}