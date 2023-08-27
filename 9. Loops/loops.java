import java.util.*;

public class loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // while loop ===>
        
        /*
         * while (condition) {
         * 
         * }
         */

        // int counter = 100;
        // while (counter > 0) {
        // System.out.println( counter + " Hello World");
        // counter--;
        // }
        // System.out.println();

        // Print 1 to 10 Numbers
        // int counter = 1;
        // while(counter <= 100) {
        // System.out.print(counter + " ");
        // counter++;
        // }

        // Print 1 to n numbers
        // System.out.print("Enter Any Number: ");
        // int num = sc.nextInt();
        // int i = 1;
        // while(i <= num) {
        // System.out.print(i + " ");
        // i++;
        // }

        // Print sum of n natural numbers
        // System.out.print("Enter Any Number: ");
        // int num = sc.nextInt();
        // int sum = 0, n = num;
        // while(num > 0) {
        // sum+=num;
        // num--;
        // }
        // System.out.print("Sum of " + n + " natural numbers: " + sum);

        // -----------------------------------------------------------------------------
        // for loop ===>

        /*
         * for(initialization, condition, update) {
         * your code
         * }
         */

        // for (int i = 0; i < 10; i++) {
        // System.out.println("Hello World");
        // }

        // Print Square * pattern
        // for (int i = 0; i < 4; i++) {
        // System.out.println("* * * *");
        // }

        // Find last digit of a number
        // System.out.print("Enter Any Number: ");
        // int num = sc.nextInt();
        // int number = num;
        // int rev = 0;
        // while (num > 0) {
        // rev = (rev * 10) + (num % 10);
        // num /= 10;
        // }
        // System.out.println("Reverse of " + number + " is " + rev);

        // -----------------------------------------------------------------------------
        // do - while loop ===>

        /*
         * do {
         * your code
         * } while (condition);
         */
        // It runs once whenever condition is true of false
        // int n = 0;
        // do {
        // System.out.println("Hello World");
        // } while (n > 0);

        // -----------------------------------------------------------------------------
        // break statement ===> To exit the loop

        // int i = 1;
        // while(i < 10) {
        // System.out.println(i + " Hello World");
        // if(i == 5)
        // break;
        // i++;
        // }

        // -----------------------------------------------------------------------------
        // continue statement ===> To skip the iteration of loop

        // int i = 0;
        // while (i < 10) {
        // i++;
        // if (i == 5)
        // continue;
        // System.out.println(i + " Hello World");
        // }

        // Check number is Prime of not ==>
        System.out.print("Enter Any Number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0)
                isPrime = false;
        }
        if (isPrime)
            System.out.println(num + " is a Prime Number.");
        else
            System.out.println(num + " is not a Prime Number.");

        sc.close();
    }
}