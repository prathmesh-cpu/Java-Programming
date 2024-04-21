import java.util.*;

public class _3rotatedSortedArray {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /* --------------- Search in Rotated Sorted Array --------------- */
    /* ------------------ Time Complexity: O(logn) ------------------ */
    public static int rotatedSortedArray(int arr[], int st, int en, int target) {
        if (st > en)
            return -1;

        int mid = (st + en) / 2;
        if (arr[mid] == target)
            return mid;

        if (arr[st] <= arr[mid]) {

            if (arr[st] <= target && target <= arr[mid]) {
                return rotatedSortedArray(arr, st, mid - 1, target);
            } else {
                return rotatedSortedArray(arr, mid + 1, en, target);
            }

        } else {
            if (arr[mid] <= target && target <= arr[en]) {
                return rotatedSortedArray(arr, mid + 1, en, target);
            } else {
                return rotatedSortedArray(arr, st, mid - 1, target);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        System.out.print("\nArray Elements: ");
        printArr(arr);
        System.out.println();

        System.out.println(
                "Element " + target + " Found at index: " + rotatedSortedArray(arr, 0, arr.length - 1, target));

        System.out.println();

        sc.close();
    }
}