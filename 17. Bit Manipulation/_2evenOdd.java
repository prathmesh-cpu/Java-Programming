import java.util.*;

public class _2evenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Numbers is Even or Odd -
        System.out.print("Enter Any Number: ");
        int num = sc.nextInt();
        if ((num & 1) == 1)
            System.out.println(num + " is a Odd Number.");
        else
            System.out.println(num + " is a Even Number.");

        sc.close();
    }
}
