import java.util.*;

public class Qs11 {

    // Average of a Number =====>
    public static void average(int num1, int num2, int num3) {
        System.out.println("Average of " + num1 + ", " + num2 + " & " + num3 + ": " + (num1 + num2 + num3) / 3);
    }

    // Even Number =====>
    public static void isEven(int num) {
        if (num % 2 == 0)
            System.out.println(num + " is a Even Number.");
        else
            System.out.println(num + " is not a Even Number.");
    }

    // Palindrome Number =====>
    public static void isPalindrome(int num) {
        int temp = num, rev = 0;
        while (num > 0) {
            rev = (rev * 10) + (num % 10);
            num /= 10;
        }
        if (temp == rev)
            System.out.println(temp + " is a Palindrome Number.");
        else
            System.out.println(temp + " is not a Palindrome Number.");
    }

    // Sum of Digits =====>
    public static void sumOfDigit(int num) {
        int temp = num, sum = 0;
        while(num > 0) { 
            sum += (num % 10);
            num /= 10;
        }
        System.out.println("Sum of Digits of " + temp + ": " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Problem 1 =====>
        // System.out.print("Enter First Number: ");
        // int num1 = sc.nextInt();
        // System.out.print("Enter Second Number: ");
        // int num2 = sc.nextInt();
        // System.out.print("Enter Third Number: ");
        // int num3 = sc.nextInt();
        // average(num1, num2, num3);
        // System.out.println();

        // Problem 2 =====>
        // System.out.print("Enter Any Number: ");
        // int num = sc.nextInt();
        // isEven(num);
        // System.out.println();

        // Problem 3 =====>
        // System.out.print("Enter Any Number: ");
        // int num = sc.nextInt();
        // isPalindrome(num);
        // System.out.println();

        // Problrm 5 =====>
        System.out.print("Enter Any Number: ");
        int num = sc.nextInt();
        sumOfDigit(num);
        System.out.println();

        sc.close();
    }
}