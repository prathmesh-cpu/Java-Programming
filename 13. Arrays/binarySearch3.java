import java.util.*;

public class binarySearch3 {

    /* --------------- Binary Search --------------- */
    /* ----------- Time Complexity: O(logn) ----------- */
    public static int arrayBinarySearch(int sortedArray[], int key) {

        int low = 0, high = (sortedArray.length - 1);

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (sortedArray[mid] == key)
                return mid;

            if (sortedArray[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    /* --------------- Array Reverse --------------- */
    /* ----------- Time Complexity: O(n) ----------- */
    /* ----------- Space Complexity: O(1) ----------- */
    public static void reverseArray(int array[]) {
        int low = 0, high = (array.length - 1);
        while (low < high) {
            array[low] += array[high];
            array[high] = array[low] - array[high];
            array[low] = array[low] - array[high];

            low++;
            high--;
        }
    }

    /* --------------- Pairs in an Array --------------- */
    /* ---------- Total Pairs: (n * (n - 1)) / 2 ---------- */
    /* ----------- Time Complexity: O(n²) ----------- */
    public static void pairInArray(int array[]) {
        int totalPair = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.print("{" + array[i] + ", " + array[j] + "} ");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs Formed: " + totalPair);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* --------------- Binary Search --------------- */
        int array[] = new int[5];
        System.out.println("Enter the Array Elements - ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter Element-" + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.println();

        // System.out.print("Enter the Element to Search: ");
        // int key = sc.nextInt();

        // int index = arrayBinarySearch(array, key);
        // if (index >= 0)
        // System.out.println("Element " + key + " Found at index: " + index);
        // else
        // System.out.println("Element " + key + " is not Found.");
        // System.out.println();

        /* --------------- Array Reverse --------------- */
        // reverseArray(array);
        // System.out.print("Reversed Array: ");
        // for (int i = 0; i < array.length; i++) {
        // System.out.print(array[i] + " ");
        // }
        // System.out.println();

        /* --------------- Pairs in an Array --------------- */
        System.out.println("All Possible Pairs in an Array - ");
        pairInArray(array);
        System.out.println();

        sc.close();
    }
}