import java.util.*;

public class _2quickSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int arr[], int st, int en) {
        if (st >= en)
            return;

        int pivot = partition(arr, st, en);
        // Left Side
        quickSort(arr, st, pivot - 1);
        // Right Side
        quickSort(arr, pivot + 1, en);
    }

    public static int partition(int arr[], int st, int en) {
        int pivot = arr[en];
        int i = st - 1;

        for (int j = st; j <= en; j++) {
            if (arr[j] <= pivot) {
                i++;
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 6, 3, 9, 5, 2, 8, -5 };

        System.out.println("\nBefore Quick Sort ---->");
        System.out.print("Array Elements: ");
        printArr(arr);
        System.out.println();
        System.out.println();

        quickSort(arr, 0, arr.length - 1);
        System.out.println("After Quick Sort ---->");
        System.out.print("Array Elements: ");
        printArr(arr);

        System.out.println();
        System.out.println();

        sc.close();
    }
}