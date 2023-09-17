import java.util.*;

public class _4subString {

    public static String substring(String str, int si, int ei) {
        String substr = "";

        for (int i = si; i < ei ; i++) {
            substr += str.charAt(i);
        }

        return substr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Any String: ");
        String str = sc.nextLine();
        System.out.println();
        System.out.println("Substring: " + substring(str, 0, 4));

        // Java inbuild function -
        System.out.println("Substring: " + str.substring(0, 4));

        sc.close();
    }
}