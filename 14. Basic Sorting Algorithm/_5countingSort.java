import java.util.*;

public class _5countingSort {

    public static void countingSort(int nums[]) {
        int largNum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            largNum = Math.max(largNum, nums[i]);
        }

        int freqArr[] = new int[largNum + 1]; // 0 to largeNum
        for (int i = 0; i < nums.length; i++) {
            freqArr[nums[i]]++;
        }

        // sorting
        int j = 0;
        for (int i = 0; i < freqArr.length; i++) {
            while (freqArr[i] > 0) {
                nums[j] = i;
                j++;
                freqArr[i]--;
            }
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

        System.out.print("Enter The Size of an Array: ");
        int size = sc.nextInt();
        System.out.print("Enter The Array Elements: ");
        int nums[] = new int[size];
        setArray(nums);

        System.out.print("\nBefore Sorting Array is: ");
        getArray(nums);

        countingSort(nums);

        System.out.print("\nAfter Sorting Array is: ");
        getArray(nums);

        sc.close();
    }
}