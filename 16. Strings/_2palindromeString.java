import java.util.*;

public class _2palindromeString {

    public static void isPalindrome(String str) {
        boolean flag = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                System.out.println("String is not a Palindrome");
                flag = false;
            }
        }
        if (flag)
            System.out.println("String is a Palindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Any String: ");
        String str = sc.next();

        isPalindrome(str);

        sc.close();
    }
}
