import java.util.*;

public class _3insertionSort {

    /* --------------------- Insertion Sort Algorithm --------------------- */
    /* ---------------------- Time Complexity: O(n²) ---------------------- */
    public static void insertionSort(int nums[]) {
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int prev = i - 1;
            while (prev >= 0 && nums[prev] > curr) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            nums[prev + 1] = curr;
        }
    }

    public static void setArray(int nums[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        sc.close();
    }

    public static void getArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Size of Array: ");
        int size = sc.nextInt();
        int nums[] = new int[size];
        System.out.print("\nEnter Array Elements: ");
        setArray(nums);

        System.out.println("\nBefore Sorting Array Elements are: ");
        getArray(nums);

        insertionSort(nums);

        System.out.println("\nAfter Sorting Array Elements are: ");
        getArray(nums);
        System.out.println();

        sc.close();
    }
}
