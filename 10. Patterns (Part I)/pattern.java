import java.util.*;

public class pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows: ");
        int num = sc.nextInt();

        // Print star pattern ===>
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Print inverted star pattern ===>
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Print half pyramid pattern ===>
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Print character pattern ===>
        char ch = 'A';
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
                if (ch == '[')
                    ch = 'a';
                if (ch == '{')
                    ch = '0';
            }
            System.out.println();
        } 

        sc.close();
    }
}