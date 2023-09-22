import java.util.*;

public class _3ithBit {

    public static int getIthBit(int n, int i) {
        if ((n & (1 << i)) == 0)
            return 0;
        return 1;
    }

    public static int setIthBit(int n, int i) {
        return (n | (1 << i));
    }

    public static int clearIthBit(int n, int i) {
        return (n & ~(1 << i));
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if (newBit == 0)
        // return clearIthBit(n, i);
        // return setIthBit(n, i);

        n = clearIthBit(n, i);
        return n | (newBit << i);
    }

    public static int clearLastIBits(int n, int i) {
        return n & ((-1) << i);
    }

    public static int clearBitsinRange(int n, int i, int j) {
        // int bitMask = (((-1) << (j+1)) | ~((-1) << i));
        int bitMask = (((-1) << (j + 1)) | ((1 << i) - 1));
        return n & bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10, i = 2;
        // Get ith bit -
        System.out.println(i + "th bit : " + getIthBit(n, i));
        // Set ith bit -
        System.out.println("After Setting " + i + "th bit, Number is : " + setIthBit(n, i));

        n = 10;
        i = 1;
        // Clear ith bit -
        System.out.println("After Clearing " + i + "th bit, Number is : " + clearIthBit(n, i));

        n = 10;
        i = 2;
        int newBit = 1;
        // Update ith bit -
        System.out
                .println("After Updating " + i + "th bit to " + newBit + ", Number is : " + updateIthBit(n, i, newBit));

        n = 15;
        i = 2;
        // Clear Last i bit -
        System.out.println("After Clearing Last " + i + " bits, Number is : " + clearLastIBits(n, i));

        n = 2515;
        int j = 7;
        i = 2;
        // Clear Range of bits -
        System.out.println(
                "After Clearing bits from " + i + "th bit to " + j + "th, Number is : " + clearBitsinRange(n, i, j));

        sc.close();
    }
}