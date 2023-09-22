import java.util.*;

public class _5countSetBits {

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) // Check LSB
                count++;
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Any Number: ");
        int n = sc.nextInt();
        System.out.println("Total Number of Set Bits in Binary representation of " + n + ": " + countSetBits(n));
        System.out.println();
        sc.close();
    }
}