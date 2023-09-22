import java.util.*;

public class _1bitwiseOperators {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bitwise AND -
        //  1 & 1 --> 1
        System.out.println("5 & 6 : " + (5 & 6));
        
        // Bitwise OR -
        //  0 | 0 --> 0
        System.out.println("5 | 6 : " + (5 | 6));
        
        // Bitwise XOR -
        //  same --> (a ^ a) --> 0
        //  different --> (a ^ b) --> 0
        System.out.println("5 ^ 6 : " + (5 ^ 6));

        // Bitwise NOT -
        // 0 --> 1
        // 1 --> 0
        System.out.println("~5 : " + (~5)); // -6
        System.out.println("~0 : " + (~0)); // -1

        // Bitwise Left Shift -
        // Shift bits towards left by given number of places
        // a << b = (a * pow(2, b))
        System.out.println("5 << 2 : " + (5 << 2));
        
        // Bitwise Right Shift -
        // Shift bits towards right by given number of places
        // a >> b = (a / pow(2, b))
        System.out.println("5 >> 2 : " + (5 >> 2));

        sc.close();
    }
}