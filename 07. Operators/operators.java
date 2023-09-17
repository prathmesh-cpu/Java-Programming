import java.util.*;

public class operators {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Expression
        // int sum = a + b;
        // a, b ===> Operands | + ===> Operator

        // Operators ==>
        // Symbol that tells compiler to perform some operation

        // ----------------------------------------------------------

        // Types of Operators:
        // Arithmetic Operators (Binary/ Unary/ Ternary)
        // Relational Operators
        // Logical Operators
        // Bitwise Operators
        // Assignment Operators

        // ----------------------------------------------------------

        // Arithmetic Operators (Binary/ Unary) ==>
        // Binary ==> Two Operands ==> + - / %
        // Unary ==> One Operand ==> ++ --

        int a = 10, b = 5;
        System.out.println("Aithmetic Operators ========>");
        System.out.println("Binary Operators --->");
        System.out.println("a + b: " + (a + b));
        System.out.println("a - b: " + (a - b));
        System.out.println("a * b: " + (a * b));
        System.out.println("a / b: " + (a / b));
        System.out.println("a % b: " + (a % b));

        System.out.println("Unary Operators --->");
        System.out.println("++a: " + ++a);
        System.out.println("a++: " + a++);
        System.out.println("--a: " + --a);
        System.out.println("a--: " + a--);

        System.out.println("Relational Operators ========>");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        System.out.println("Logical Operators ========>");
        System.out.println("(a > 9) && (a < 11): " + ((a > 9) && (a < 11)));
        System.out.println("(a > 9) || (a < 1): " + ((a > 9) || (a < 11)));
        System.out.println("(a != 10): " + ((a != 10)));

        System.out.println("Assignment Operators ========>");
        a = 15;
        System.out.println("a = " + a);
        a += 10;
        System.out.println("a += 10: " + a);
        a -= 5;
        System.out.println("a -= 5: " + a);
        a *= 2;
        System.out.println("a *= 2: " + a);
        a /= 5;
        System.out.println("a /= 5: " + a); 

        sc.close();
    }
}