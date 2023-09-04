import java.util.*;

public class Qs15 {

    /* ---------------- Count Total 7's in 2D Array ---------------- */
    public static void totalNum7(int matrix[][]) {
        int cnt = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 7)
                    cnt++;
            }
        }
        System.out.println("Total Number of 7's in 2D Array: " + cnt);
    }

    /* ---------------- Print Sum of 2nd Row ---------------- */
    public static void sumOfRow2(int nums[][]) {
        int sum = 0;
        for (int i = 0; i < nums[0].length; i++) {
            sum += nums[1][i];
        }

        System.out.println("The Sum of Row 2: " + sum);
    }

    /* ---------------- Print Transpose of Matrix ---------------- */
    public static void transposeMatrix(int nums[][]) {
        int row = nums.length, col = nums[0].length;

        int transMat[][] = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transMat[j][i] = nums[i][j];
            }
        }
        
        printMat(transMat);

    }

    /* ---------------- Print Matrix ---------------- */
    public static void printMat(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Problem 1 ===============>
        int matrix[][] = {
                { 4, 7, 8 },
                { 8, 8, 7 }
        };

        totalNum7(matrix);

        // Problem 2 ===============>
        int nums[][] = {
                { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 }
        };

        sumOfRow2(nums);

        // Problem 3 ===============>
        System.out.println("\nOriginal Matrix: ");
        printMat(matrix);

        System.out.println();
        
        System.out.println("\nTranspose of a Matrix: ");
        transposeMatrix(matrix);

        sc.close();
    }
}