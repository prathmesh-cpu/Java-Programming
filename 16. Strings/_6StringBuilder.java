import java.util.*;

public class _6StringBuilder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaration and Initialization of StringBuilder -
        StringBuilder sb = new StringBuilder("ABC");

        // Type of Variable -
        String sbStr = sb.toString(); // It returns a new String
        System.out.println(sb + ", " + sb.getClass().getName());
        System.out.println(sbStr + ", " + sbStr.getClass().getName());

        // Append Character/ String in StringBuilder -
        sb.append("XYZ");
        System.out.println("String After Append: " + sb);

        // ---------- Time Complexity: O(n) ----------
        StringBuilder sb1 = new StringBuilder("");
        for (char index = 'a'; index <= 'z'; index++) {
            sb1.append(index); // O(26)
            // sb1 += index; // O(n²)
        }
        System.out.println(sb1);

        sc.close();
    }
}
