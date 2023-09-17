import java.util.*;

public class conditional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // if else statement
        /*
         * if(condition) {
         * 
         * }
         * else {
         * 
         * }
         */
        // System.out.print("Enter Your Age: ");
        // int age = sc.nextInt();
        // if (age >= 18) {
        // System.out.println("You are eligible for voting.\n");
        // } else {
        // System.out.println("You are not eligible for voting.\n");
        // }

        // Print Largest of Two Numbers
        // System.out.print("Enter First Number: ");
        // int num1 = sc.nextInt();
        // System.out.print("Enter Second Number: ");
        // int num2 = sc.nextInt();
        // if (num1 > num2) {
        // System.out.println(num1 + " is Largest than " + num2 + "\n");
        // } else {
        // System.out.println(num2 + " is Largest than " + num1 + "\n");
        // }

        // Print Number is Even or Odd
        // System.out.print("Enter Any Number: ");
        // int evenOddNum = sc.nextInt();
        // if (evenOddNum % 2 == 0) {
        // System.out.println(evenOddNum + " is a Even Number.\n");
        // } else {
        // System.out.println(evenOddNum + " is a Odd Number.\n");
        // }

        // else if statement
        /*
         * if(condition) {
         * 
         * } else if(condition) {
         * 
         * } else {
         * 
         * }
         */

        // System.out.print("Enter Your Income: ");
        // float income = sc.nextFloat();
        // float tax;
        // float taxPercent;
        // if (income < 500000) {
        // taxPercent = 0;
        // tax = 0;
        // } else if (income >= 500000 && income <= 1000000) {
        // taxPercent = 20;
        // tax = (0.2f * income);
        // } else {
        // taxPercent = 20;
        // tax = (0.3f * income);
        // }
        // System.out.println("You Have to Pay " + taxPercent + "% i.e Rs." + tax + "
        // tax on your income.\n");

        // Print Largest of Three Numbers
        // System.out.print("Enter First Number: ");
        // int num1 = sc.nextInt();
        // System.out.print("Enter Second Number: ");
        // int num2 = sc.nextInt();
        // System.out.print("Enter Third Number: ");
        // int num3 = sc.nextInt();
        // if (num1 >= num2 && num1 >= num3) {
        // System.out.println(num1 + " is Largest Number among Three.\n");
        // } else if (num2 >= num3) {
        // System.out.println(num2 + " is Largest Number among Three.\n");
        // } else {
        // System.out.println(num3 + " is Largest Number among Three.\n");
        // }

        // Ternary Operator
        // variable = (condition) ? statement 1 : statement 2;
        System.out.print("Enter the mark of Student: ");
        int marks = sc.nextInt();
        String passFailStatus = (marks >= 35) ? "passed." : "failed.";
        System.out.println("Student is " + passFailStatus + "\n");

        // switch statement
        /*
         * switch (variable) {
         * case value1:
         * break;
         * 
         * default:
         * break;
         * }
         */
        // System.out.print("Enter Any Digit: ");
        // int num = sc.nextInt();

        // switch (num) {
        //     case 0:
        //         System.out.println("You Entered Digit: Zero.\n");
        //         break;
        //     case 1:
        //         System.out.println("You Entered Digit: One.\n");
        //         break;
        //     case 2:
        //         System.out.println("You Entered Digit: Two.\n");
        //         break;
        //     case 3:
        //         System.out.println("You Entered Digit: Three.\n");
        //         break;
        //     case 4:
        //         System.out.println("You Entered Digit: Four.\n");
        //         break;
        //     case 5:
        //         System.out.println("You Entered Digit: Five.\n");
        //         break;
        //     case 6:
        //         System.out.println("You Entered Digit: Six.\n");
        //         break;
        //     case 7:
        //         System.out.println("You Entered Digit: Seven.\n");
        //         break;
        //     case 8:
        //         System.out.println("You Entered Digit: Eight.\n");
        //         break;
        //     case 9:
        //         System.out.println("You Entered Digit: Nine.\n");
        //         break;
        //     default:
        //         System.out.println("Please!! Enter Correct Digit.\n");
        //         break;
        // } 

        sc.close();
    }
}