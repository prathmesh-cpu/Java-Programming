import java.util.*;

public class Qs13 {

    /* -------------------------------------------------------------------------- */
    /* ---------------------- Number Appears Atleast Twice ---------------------- */
    /* -------------------------------------------------------------------------- */
    public static boolean dualAppearsNum(int nums[]) {
        int numSort[] = nums.clone();
        Arrays.sort(numSort);
        for (int i = 0; i < numSort.length - 1; i++) {
            if (numSort[i] == numSort[i + 1])
                return true;
        }
        return false;
    }

    /* -------------------------------------------------------------------------- */
    /* ---------------- Search a given target in a Rotated Array ---------------- */
    /* -------------------------------------------------------------------------- */
    // Find Minimum of Rotated Array
    public static int minSearch(int nums[]) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            if (nums[start] < nums[end])
                return start;
            int mid = start + ((end - start) / 2);
            if (nums[mid] >= nums[start])
                start = mid + 1;
            else
                end = mid;
        }
        return start;
    }

    // Implement Binary Search on Array
    public static int binarySearch(int nums[], int start, int end, int target) {
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target)
                end = mid - 1;
            if (nums[mid] < target)
                start = mid + 1;
        }
        return -1;
    }

    // Search a target Element in an Rotated Array
    public static int search(int[] nums, int target) {
        int min = minSearch(nums);

        if ((nums[min] <= target) && (target <= nums[nums.length - 1])) {
            return binarySearch(nums, min, nums.length - 1, target);
        } else {
            return binarySearch(nums, 0, min, target);
        }
    }

    /* -------------------------------------------------------------------------- */
    /* -------------------------------------------------------------------------- */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int size = sc.nextInt();
        System.out.print("Enter Array Elements: ");
        int nums[] = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        // Problem 1 ======>
        System.out.println(dualAppearsNum(nums));

        System.out.print("Enter Number to Search in Array: ");
        int target = sc.nextInt();

        // Problem 2 ======>
        System.out.println(search(nums, target));

        // Problem 3 ======>
        // Solved in 'buySellStock6.java'

        // Problem 4 ======>
        // Solved in 'trappingRainProb5.java'

        // Problem 5 ======>
        // ⚠️ It Requires to Learn List and HashSet - (Advanced) ⚠️
        // Learn in Later Chapter/ Module 

        sc.close();
    }
}