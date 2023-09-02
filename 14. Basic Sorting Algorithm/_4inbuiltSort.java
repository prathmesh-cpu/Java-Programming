import java.util.*;

public class _4inbuiltSort {

    // nums[] - primitive data type
    public static void getArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    // nums[] - non primitive data type
    public static void getArray(Integer nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* ------------------------ Inbuilt Sort Algorithm ----------------------- */
        /* ---------------------- Time Complexity: O(nlogn) ---------------------- */

        /* --------------------------- Ascending Order --------------------------- */
        System.out.println("\n------------------- Ascending Order -------------------");

        int arrAsc[] = { 5, 4, 2, 3, 1 };
        System.out.println("\nBefore Sorting Array Elements are: ");
        getArray(arrAsc);

        Arrays.sort(arrAsc);

        System.out.println("\nAfter Sorting Array Elements are: ");
        getArray(arrAsc);

        System.out.println();
        System.out.println("\n----------------------------------------------");
        /* ----------------------------------------------------------------------- */

        int arrAsc1[] = { 5, 4, 2, 3, 1 };
        System.out.println("\nBefore Sorting Array Elements are: ");
        getArray(arrAsc1);

        Arrays.sort(arrAsc1, 0, 3);

        System.out.println("\nAfter Sorting Array Elements are: ");
        getArray(arrAsc1);

        System.out.println();
        /* --------------------------- Descending Order --------------------------- */
        System.out.println("\n------------------- Descending Order -------------------");

        Integer arrDesc[] = { 1, 2, 4, 3, 5 };
        System.out.println("\nBefore Sorting Array Elements are: ");
        getArray(arrDesc);

        Arrays.sort(arrDesc, Collections.reverseOrder());

        System.out.println("\nAfter Sorting Array Elements are: ");
        getArray(arrDesc);

        System.out.println();
        System.out.println("\n----------------------------------------------");
        /* ----------------------------------------------------------------------- */

        Integer arrDesc1[] = { 1, 2, 4, 3, 5 };
        System.out.println("\nBefore Sorting Array Elements are: ");
        getArray(arrDesc1);

        Arrays.sort(arrDesc1, 0, 3, Collections.reverseOrder());

        System.out.println("\nAfter Sorting Array Elements are: ");
        getArray(arrDesc1);

        System.out.println();

        sc.close();
    }
}
