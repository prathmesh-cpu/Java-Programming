import java.util.*;

public class _1stringBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // +++++++++++++++ Strings are IMMUTABLE +++++++++++++++
        // String Creation -
        String str = "abcd";
        String str1 = new String("xyz");

        // Input -

        // System.out.print("Enter Any String: ");
        // String name = sc.next();
        System.out.print("Enter Any String Sentence: ");
        String sent = sc.nextLine();

        // Output -
        System.out.println(str);
        System.out.println(str1);
        // System.out.println(name);
        System.out.println(sent);

        // String Length -
        System.out.println(sent.length());

        // String Concatenation
        String name = str + " " + str1 + " " + sent;
        System.out.println(name);

        // String Comparison
        String str2 = "ABC";
        String str3 = "ABC";
        String str4 = new String("ABC");

        if (str2.equals(str3))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");

        if (str2.equals(str4))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");

        // String charAt() - to access character -
        System.out.println(sent.charAt(0));

        sc.close();
    }
}