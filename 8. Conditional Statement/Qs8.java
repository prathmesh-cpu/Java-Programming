import java.util.*;

public class Qs8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Problem 1 ===>
        // System.out.print("Enter Any Number: ");
        // int integerType = sc.nextInt();
        // if (integerType > 0) {
        // System.out.println("You Entered Positive Number.");
        // } else if (integerType < 0) {
        // System.out.println("You Entered Negative Number.");
        // } else {
        // System.out.println("You Entered Number Zero.");
        // }

        // Problem 2 ===>
        // System.out.print("Enter Your Body Temperature: ");
        // double tempBody = sc.nextDouble();
        // if (tempBody > 100) {
        // System.out.println("You have a fever.");
        // } else {
        // System.out.println("You don't have a fever.");
        // }

        // Problem 3 ===>
        // System.out.print("Enter Week Number(1 - 7): ");
        // int weekNum = sc.nextInt();
        // switch (weekNum) {
        // case 1:
        // System.out.println("Entered Week Number's Day: Monday\n");
        // break;
        // case 2:
        // System.out.println("Entered Week Number's Day: Tuesday\n");
        // break;
        // case 3:
        // System.out.println("Entered Week Number's Day: Wednesday\n");
        // break;
        // case 4:
        // System.out.println("Entered Week Number's Day: Thursday\n");
        // break;
        // case 5:
        // System.out.println("Entered Week Number's Day: Friday\n");
        // break;
        // case 6:
        // System.out.println("Entered Week Number's Day: Saturday\n");
        // break;
        // case 7:
        // System.out.println("Entered Week Number's Day: Sunday\n");
        // break;
        // default:
        // System.out.println("Please!! Enter Correct Week Number.\n");
        // break;
        // }

        // Problem 4 ===>
        // int a = 63, b = 36;
        // boolean x = (a < b) ? true : false;
        // int y = (a > b) ? a : b;
        // System.out.println(x + " " + y);

        // Problem 5 ===>
        System.out.print("Enter Any Year: ");
        int year = sc.nextInt();
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " is a Leap Year.\n");
        } else {
            System.out.println(year + " is a not a Leap Year.\n");
        }

        sc.close();
    }
}