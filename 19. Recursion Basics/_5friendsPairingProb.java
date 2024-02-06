import java.util.*;

public class _5friendsPairingProb {

    public static int friendsPairingWays(int n) {
        // base case
        if (n == 1 || n == 2) {
            return n;
        }

        // return f(n - 1) single + (n - 1) pair choices * f(n - 2) remaining choices
        return friendsPairingWays(n - 1) + (n - 1) * friendsPairingWays(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of friends: ");
        int n = sc.nextInt();

        System.out.println("Number of ways to pair friends: " + friendsPairingWays(n));
        System.out.println();

        sc.close();
    }
}