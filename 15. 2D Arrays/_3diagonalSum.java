import java.util.*;

public class _3diagonalSum {

    /* ------------- Diagonal Sum (Brute Force) ------------- */
    /* --------------- Time Complexity: O(n²) --------------- */
    public static void diagoSumBF(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                // Primary Diagonal -
                if (i == j)
                    sum += matrix[i][j];
                // Secondary Diagonal -
                else if (i + j == matrix.length - 1)
                    sum += matrix[i][j];
            }
        }
        System.out.println("Diagonal Sum of Matrix: " + sum);
    }

    /* ------------- Diagonal Sum (Optimal) ------------- */
    /* -------------- Time Complexity: O(n) -------------- */
    public static void diagoSum(int matrix[][]) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            // Primary Diagonal -
            sum += matrix[i][i];
            // Secondary Diagonal -
            if (i != matrix.length - 1 - i)
                // If (i != j) then
                sum += matrix[i][matrix.length - 1 - i];
        }
        System.out.println("Diagonal Sum of Matrix: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int matrix[][] = {
        // { 1, 2, 3, 4 },
        // { 5, 6, 7, 8 },
        // { 9, 10, 11, 12 },
        // { 13, 14, 15, 16 }
        // };

        int matrix[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        diagoSum(matrix);

        sc.close();
    }
}
