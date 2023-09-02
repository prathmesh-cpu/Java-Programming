import java.util.*;

public class _1bubbleSort {

    /* ---------------------- Bubble Sort Algorithm ---------------------- */
    /* ---------------------- Time Complexity: O(n²) ---------------------- */
    public static void bubbleSort(int nums[]) {
        for (int i = 0; i < (nums.length - 1); i++) {
            int swap = 0;
            for (int j = 0; j < (nums.length - 1) - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    nums[j] += nums[j + 1];
                    nums[j + 1] = nums[j] - nums[j + 1];
                    nums[j] = nums[j] - nums[j + 1];
                    swap++;
                }
            }
            /* ---------------------- Already Sorted Array ---------------------- */
            /* --------------------- Time Complexity: O(n) --------------------- */
            if (swap == 0)
                break;
        }
    }

    public static void getArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void setArray(int nums[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        sc.close();
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

        bubbleSort(nums);

        System.out.println("\nAfter Sorting Array Elements are: ");
        getArray(nums);

        sc.close();
    }
}