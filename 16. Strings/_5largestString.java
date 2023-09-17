import java.util.*;

public class _5largestString {

    public static String largestString(String strArr[]) {
        String largest = strArr[0];

        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i].compareTo(largest) > 0)
                largest = strArr[i];
        }

        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sc.next();

        System.out.print("Enter Second String: ");
        String str2 = sc.next();

        // .compareTo
        if (str1.compareTo(str2) == 0) {
            System.out.println("Strings are Equal");
        } else if (str1.compareTo(str2) > 0) {
            System.out.println("String " + str1 + " is Larger than String " + str2);
        } else {
            System.out.println("String " + str2 + " is Larger than String " + str1);
        }

        System.out.println("--------------------------------");

        // compareToIgnoreCase
        if (str1.compareToIgnoreCase(str2) == 0) {
            System.out.println("Strings are Equal");
        } else if (str1.compareToIgnoreCase(str2) > 0) {
            System.out.println("String " + str1 + " is Larger than String " + str2);
        } else {
            System.out.println("String " + str2 + " is Larger than String " + str1);
        }
        System.out.println();

        // -------------------------------------------

        String strArr[] = {"apple", "mango", "banana"};

        System.out.println("Largest String in Array: " + largestString(strArr));

        sc.close();
    }
}
