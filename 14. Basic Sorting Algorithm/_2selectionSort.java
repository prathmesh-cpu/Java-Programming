import java.util.*;

public class _2selectionSort {

    /* --------------------- Selection Sort Algorithm --------------------- */
    /* ---------------------- Time Complexity: O(n²) ---------------------- */
    public static void selectionSort(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minPos] > nums[j])
                    minPos = j;
            }

            // Swap
            int temp = nums[i];
            nums[i] = nums[minPos];
            nums[minPos] = temp;

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

        selectionSort(nums);

        System.out.println("\nAfter Sorting Array Elements are: ");
        getArray(nums);

        sc.close();
    }
}