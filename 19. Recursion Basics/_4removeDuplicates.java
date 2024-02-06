import java.util.*;

public class _4removeDuplicates {

    public static void removingDuplicates(String str, int index, StringBuilder newStr, boolean mapArr[]) {
        // base case
        if (index == str.length()) {
            System.out.print(newStr);
            return;
        }

        if (mapArr[str.charAt(index) - 'a'] == true) {
            // Duplicate
            removingDuplicates(str, index + 1, newStr, mapArr);
        } else {
            mapArr[str.charAt(index) - 'a'] = true;
            newStr.append(str.charAt(index));
            removingDuplicates(str, index + 1, newStr, mapArr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any String: ");
        String str = sc.next();

        System.out.print("New String after removing Duplicate Characters: ");
        removingDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

        sc.close();
    }
}