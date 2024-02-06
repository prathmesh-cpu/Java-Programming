import java.util.*;

public class _2powerOfNum {

    // Find xⁿ --------------->
    // Time Complexity: O(n)
    public static long power(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * power(x, n - 1);
    }

    // Find xⁿ in O(logn) --------------->
    // Time Complexity: O(logn)
    public static long optimizedPower(int x, int n) {
        if (n == 1) {
            return x;
        }
        long halfPower = optimizedPower(x, n / 2);
        if ((n & 1) == 0) {
            return halfPower * halfPower;
        }
        return x * halfPower * halfPower;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 3, n = 20;
        System.out.println(x + "^" + n + " = " + power(x, n));
        System.out.println();

        x = 2;
        n = 10;
        System.out.println(x + "^" + n + " (Optimized) = " + optimizedPower(x, n));

        sc.close();
    }
}