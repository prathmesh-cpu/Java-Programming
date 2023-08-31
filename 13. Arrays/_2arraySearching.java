import java.util.*;

public class _2arraySearching {

    /* --------------- Linear Search --------------- */
    /* ----------- Time Complexity: O(n) ----------- */

    public static int linearSearch(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    /* --------------- Largest Element --------------- */
    // Integer Minimum Value - Integer.MIN_VALUE
    // Integer Maximum Value - Integer.MAX_VALUE

    public static void largeElement(int array[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("Smallest Element in an Array: " + min + "\n");
        System.out.println("Largest Element in an Array: " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* --------------- Linear Search --------------- */
        // Find the index of an Element in a given Array
        int array[] = new int[6];
        System.out.println("Enter the Array Elements - ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter Element" + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.println();

        System.out.print("Enter the Element to Search: ");
        int key = sc.nextInt();

        int index = linearSearch(array, key);
        if (index >= 0)
            System.out.println("Element " + key + " Found at index: " + index);
        else
            System.out.println("Element " + key + " is not Found.");
        System.out.println();

        /* --------------- Largest Element --------------- */
        largeElement(array);
        System.out.println();

        sc.close();
    }
}