import java.util.*;

public class _4powerOf2 {

    // ----------- Time Complexity: O(1) -----------
    public static boolean isPowerOf2(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Any Number: ");
        int n = sc.nextInt();
        if (isPowerOf2(n))
            System.out.println(n + " is Power of 2");
        else
            System.out.println(n + " is not Power of 2");
        System.out.println();

        sc.close();
    }
}
