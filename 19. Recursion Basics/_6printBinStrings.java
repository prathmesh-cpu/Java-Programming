import java.util.*;

public class _6printBinStrings {

    public static void printBinStrings(int n, int lastPlace, String str) {

        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        printBinStrings(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinStrings(n - 1, 1, str + "1");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        printBinStrings(n, 0, "");
        System.out.println();
        sc.close();
    }
}