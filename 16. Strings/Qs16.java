import java.util.*;

public class Qs16 {

    public static void lowerCaseVowel(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;
        }
        System.out.println("Total Number of Lowercase Vowels occurred in a String: " + count);
    }

    /* ------------- Time Complexity: O(n * logn) ------------- */
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        else {
            s = s.toLowerCase();
            t = t.toLowerCase();

            char sCharArray[] = s.toCharArray();
            char tCharArray[] = t.toCharArray();

            Arrays.sort(sCharArray);
            Arrays.sort(tCharArray);

            return Arrays.equals(sCharArray, tCharArray);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Problem 1 ===============>
        System.out.print("\nEnter Any String: ");
        String str = sc.next();
        lowerCaseVowel(str);
        System.out.println();

        // Problem 2 ===============>
        String s1 = "ShradhaDidi";
        String s2 = "ApnaCollege";
        String s3 = "ShradhaDidi";
        System.out.println(s1.equals(s2) + " " + s1.equals(s3));
        System.out.println();

        // Problem 3 ===============>
        System.out.println(s1.replace("l", ""));

        // Problem 4 ===============>
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));

        sc.close();
    }
}