import java.util.*;

public class _1Arrays2dBasics {

    /* ------------------- Searching in a 2D Array ------------------- */
    public static boolean searchArray(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("\nElement Found at Index: (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        return false;
    }

    /* ------------------- Maximum Element in a 2D Array ------------------- */
    public static int largEle(int matrix[][]) {
        int maxEle = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                maxEle = Math.max(matrix[i][j], maxEle);
            }
        }
        return maxEle;
    }

    /* ------------------- Minimum Element in a 2D Array ------------------- */
    public static int smallEle(int matrix[][]) {
        int minEle = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                minEle = Math.min(matrix[i][j], minEle);
            }
        }
        return minEle;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creation of a 2D Array -
        int matrix[][] = new int[3][3];

        int n = matrix.length;
        int m = matrix[0].length;

        // Input in a 2D Array -
        System.out.println("Enter Elements in the 2D Matrix - ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output in a 2D Array -
        System.out.println("\nElements in the 2D Matrix -");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Searching in a 2D Array -
        System.out.print("\nEnter Key to Search in the 2D Array: ");
        int key = sc.nextInt();

        if (!searchArray(matrix, key)) {
            System.out.println("\nElement Not Found!");
        }

        System.out.println("\nLargest Elements in a Matrix: " + largEle(matrix));
        System.out.println("\nSmallest Elements in a Matrix: " + smallEle(matrix));
        System.out.println();

        sc.close();
    }
}