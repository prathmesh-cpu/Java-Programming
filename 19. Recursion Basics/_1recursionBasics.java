import java.util.*;

public class _1recursionBasics {

    // Print N to 1 Number --------------->
    public static void printDecNum(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDecNum(n - 1);
    }

    // Print 1 to N Number --------------->
    public static void printIncNum(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printIncNum(n - 1);
        System.out.print(n + " ");
    }

    // Factorial of a Number --------------->
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }

        int fn1 = fact(n - 1);
        int fn = n * fn1;
        return fn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;

        printDecNum(n);
        System.out.println();
        printIncNum(n);
        System.out.println();

        n = 5;
        System.out.println("Factorial of " + n + ": " + fact(n));
        sc.close();
    }
}