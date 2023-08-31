import java.util.*;

public class _4subArrays {

    /* --------------- Print Subarrays --------------- */
    /* ---------- Find Maximum Sum of Subarrays ---------- */
    /* ------------ Time Complexity: O(n³) ------------ */
    /* ------- Total Number of Subarrays: (n * (n + 1)) / 2 ------- */

    public static void printSubarrays(int array[]) {

        int totalSubarrays = 0;
        int maxSumSubarray = Integer.MIN_VALUE;
        int minSumSubarray = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {

            for (int j = i; j < array.length; j++) {
                int sum = 0;
                System.out.print("{ ");

                for (int k = i; k <= j; k++) {

                    System.out.print(array[k] + " ");
                    sum += array[k];
                }
                totalSubarrays++;
                System.out.print("} ");
                if (sum > maxSumSubarray)
                    maxSumSubarray = sum;
                if (sum < minSumSubarray)
                    minSumSubarray = sum;
            }
            System.out.println();
        }
        System.out.println("\nNumber of Subarrays: " + totalSubarrays);
        System.out.println("\nMaximum Sum of Subarrays: " + maxSumSubarray);
        System.out.println("\nMinimum Sum of Subarrays: " + minSumSubarray);
    }

    /* ----- * Prefix Sum * - Find Maximum Sum of Subarrays ----- */
    /* ---------------- Time Complexity: O(n²) ---------------- */

    public static void prefixSum(int array[]) {
        int maxSumSubarray = Integer.MIN_VALUE;
        int minSumSubarray = Integer.MAX_VALUE;
        int prefixArray[] = new int[array.length];

        prefixArray[0] = array[0];
        // calculate prefix array
        for (int i = 1; i < array.length; i++) {
            prefixArray[i] = prefixArray[i - 1] + array[i];
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int sum = 0;
                sum = (i == 0) ? prefixArray[j] : prefixArray[j] - prefixArray[i - 1];  // prefix[end] - prefix[start - 1]  ==> sum of subArray
                if (sum > maxSumSubarray)
                    maxSumSubarray = sum;
                if (sum < minSumSubarray)
                    minSumSubarray = sum;
            }
        }
        System.out.println("\nMaximum Sum of a Subarray: " + maxSumSubarray);
        System.out.println("\nMinimum Sum of a Subarray: " + minSumSubarray);
    }

    /* ----- * Kadane's Algorithm * - Find Maximum Sum of Subarrays ----- */
    /* ------------------- Time Complexity: O(n) ------------------- */

    public static void kadaneAlgo(int array[]) {
        int maxSumSubarray = Integer.MIN_VALUE;
        int currSum = 0;
        boolean flag = true;

        for (int i = 0; i < array.length; i++) {
            currSum += array[i];
            if (currSum < 0)
                currSum = 0;

            if (currSum > maxSumSubarray)
                maxSumSubarray = currSum;

            if (maxSumSubarray > 0)
                flag = false;
        }

        // For all negative numbers -
        if (flag) {
            maxSumSubarray = Integer.MIN_VALUE;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > maxSumSubarray)
                    maxSumSubarray = array[i];
            }
        }

        System.out.println("\nMaximum Sum of a Subarray: " + maxSumSubarray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* --------------- Print Subarrays --------------- */
        /* ---------- Find Maximum Sum of Subarrays ---------- */
        // Subarrays - Continuous Part of Array.
        int array[] = new int[8];
        System.out.println("Enter the Array Elements - ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter Element-" + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.println();
        printSubarrays(array);
        System.out.println();
        System.out.println("-------------------------------------------------------");

        /* ----- * Prefix Sum * - Find Maximum Sum of Subarrays ----- */
        prefixSum(array);
        System.out.println();
        System.out.println("-------------------------------------------------------");

        /* ----- * Kadane's Algorithm * - Find Maximum Sum of Subarrays ----- */
        kadaneAlgo(array);
        System.out.println();
        System.out.println("-------------------------------------------------------");

        sc.close();
    }
}