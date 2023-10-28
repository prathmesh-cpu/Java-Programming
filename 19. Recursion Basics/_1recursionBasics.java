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

    // Print Sum of first N Number --------------->
    public static int nSum(int n) {
        if (n == 1) {
            return 1;
        }

        return n + nSum(n - 1);
    }

    // Print Nth Fibonacci Number --------------->
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    // Array is Sorted or Not --------------->
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1)
            return true;

        if (arr[i] <= arr[i + 1]) {
            return isSorted(arr, i + 1);
        } else {
            return false;
        }
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
        n = 100;
        System.out.println("Sum of first " + n + " Natural Numbers: " + nSum(n));
        n = 40;
        System.out.println(n + "th Fibonacci Numbers: " + fib(n));

        int arr[] = {1,3,4,6,7,8,3};
        System.out.println("Is Given Array Sorted? : " + isSorted(arr, 0));

        sc.close();
    }
}