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

        digitToWord(n / 10);
        System.out.print(digits[n % 10] + " ");
    }

    public static int length(String str) {
        if (str.length() == 0) {
            return 0;
        }

        return length(str.substring(1)) + 1;
    }

    public static int countSubstr(String str, int st, int en, int cnt) {
        if (str.length() == st || str.length() == en)
            return cnt;

        if (str.charAt(st) == str.charAt(en))
            cnt++;

        cnt = countSubstr(str, st, en + 1, cnt);
        if (st == en)
            cnt = countSubstr(str, st + 1, en + 1, cnt);

        return cnt;
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
        System.out.println();

        // Problem 4 ===============>
        str = "aba";
        System.out.println("Number of substring starting and ending with same character: "
                + countSubstr(str, 0, 0, 0));
        System.out.println();

        sc.close();
    }
}