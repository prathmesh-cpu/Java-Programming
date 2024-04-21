import java.util.*;

public class _1mergeSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int arr[], int st, int en) {
        if (st >= en)
            return;

        int mid = st + (en - st) / 2;
        mergeSort(arr, st, mid);
        mergeSort(arr, mid + 1, en);

        merge(arr, st, en, mid);
    }

    public static void merge(int arr[], int st, int en, int mid) {
        // left[0,...,3] = 4, right[4,...,6] = 3 --> (en = 6) - (st = 0) + 1 ==> 7
        int temp[] = new int[en - st + 1];
        int i = st, j = mid + 1, k = 0;

        while (i <= mid && j <= en) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Remaining Left Part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Remaining Right Part
        while (j <= en) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = st; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 6, 3, 9, 5, 2, 8 };

        System.out.println("\nBefore Merge Sort ---->");
        System.out.print("Array Elements: ");
        printArr(arr);
        System.out.println();
        System.out.println();

        mergeSort(arr, 0, arr.length - 1);
        System.out.println("After Merge Sort ---->");
        System.out.print("Array Elements: ");
        printArr(arr);

        System.out.println();
        System.out.println();

        sc.close();
    }
}