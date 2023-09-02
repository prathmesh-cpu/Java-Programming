import java.util.*;

public class Qs14 {

    /* ---------------------- Bubble Sort Algorithm ---------------------- */
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    arr[j] += arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
    }

    /* --------------------- Selection Sort Algorithm --------------------- */
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[max] < arr[j])
                    max = j;
            }

            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void countingSort(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        int freqArr[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            freqArr[arr[i]]++;
        }

        // sort
        int j = arr.length - 1;
        for (int i = 0; i < freqArr.length; i++) {
            while (freqArr[i] > 0) {
                arr[j] = i;
                j--;
                freqArr[i]--;
            }
        }
    }

    public static void setArray(int arr[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
    }

    public static void getArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Problem 1 ========>
        System.out.println("\n\n ------------- Bubble Sort ------------- ");
        int bubbleArr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        System.out.println("\nBefore Sorting Array Elements are: ");
        getArray(bubbleArr);
        bubbleSort(bubbleArr);
        System.out.println("\nAfter Sorting Array Elements are: ");
        getArray(bubbleArr);

        // Problem 2 ========>
        System.out.println("\n\n ------------- Selection Sort ------------- ");
        int selectionArr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        System.out.println("\nBefore Sorting Array Elements are: ");
        getArray(selectionArr);
        selectionSort(selectionArr);
        System.out.println("\nAfter Sorting Array Elements are: ");
        getArray(selectionArr);

        // Problem 3 ========>
        System.out.println("\n\n ------------- Insertion Sort ------------- ");
        int insertionArr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        System.out.println("\nBefore Sorting Array Elements are: ");
        getArray(insertionArr);
        insertionSort(insertionArr);
        System.out.println("\nAfter Sorting Array Elements are: ");
        getArray(insertionArr);

        // Problem 4 ========>
        System.out.println("\n\n ------------- Counting Sort ------------- ");
        int countingArr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        System.out.println("\nBefore Sorting Array Elements are: ");
        getArray(countingArr);
        countingSort(countingArr);
        System.out.println("\nAfter Sorting Array Elements are: ");
        getArray(countingArr);

        sc.close();
    }
}