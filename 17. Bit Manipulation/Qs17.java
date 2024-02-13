import java.util.*;

public class Qs17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Problem 1 ===============>
        System.out.print("Enter any Number: ");
        int n = sc.nextInt();
        System.out.println("The " + n + " ^ " + n + ": " + (n ^ n));
        System.out.println();

        // Problem 2 ===============>
        System.out.print("Enter First Number: ");
        n = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int m = sc.nextInt();
        System.out.println("Before swapping: n = " + n + ", m = " + m);
        n = n ^ m;
        m = n ^ m;
        n = n ^ m;
        System.out.println("After swapping: n = " + n + ", m = " + m);
        System.out.println();

        // Problem 3 ===============>
        System.out.print("Enter any Number: ");
        n = sc.nextInt();
        System.out.println("Number after adding 1: " + -~n);
        System.out.println();

        // Problem 4 ===============>
        System.out.println("Convert Alphabets from Uppercase to Lowercase: ");
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print((char) (i | ' '));
        }
        System.out.println();

        sc.close();
    }
}