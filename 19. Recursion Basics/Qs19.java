import java.util.*;

public class Qs19 {

    static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void allOccurences(int arr[], int i, int key) {
        if (i == arr.length) {
            return;
        } else if (key == arr[i]) {
            System.out.print(i + " ");
        }

        allOccurences(arr, i + 1, key);
    }

    public static void digitToWord(int n) {
        if (n == 0) {
            return;
        }

        int lastDigit = n % 10;
        digitToWord(n / 10);
        System.out.print(digits[lastDigit] + " ");
    }

    public static int length(String str) {
        if (str.length() == 0) {
            return 0;
        }

        return length(str.substring(1)) + 1;
    }

    public static int countSubstr(String str, int i, int j, int n) {
        if (n == 1)
            return 1;
        if (n <= 0)
            return 0;

        int res = countSubstr(str, i + 1, j, n - 1) + countSubstr(str, i, j - 1, n - 1)
                - countSubstr(str, i + 1, j - 1, n - 2);

        if (str.charAt(i) == str.charAt(j)) {
            System.out.println(i + " " + j);
            res++;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Problem 1 ===============>
        System.out.println();
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;
        System.out.print("All indices of " + key + " in an Array: ");
        allOccurences(arr, 0, key);
        System.out.println();
        System.out.println();

        // Problem 2 ===============>
        int n = 2019;
        System.out.print(n + " in Word: ");
        digitToWord(n);
        System.out.println();
        System.out.println();

        // Problem 3 ===============>
        String str = "Hello World";
        System.out.print("Size of String '" + str + "': " + length(str));
        System.out.println();

        // Problem 4 ===============>
        str = "aba";
        System.out.println("Number of substring starting and ending with same character: "
                + countSubstr(str, 0, str.length() - 1, str.length()));
        System.out.println();

        sc.close();
    }
}