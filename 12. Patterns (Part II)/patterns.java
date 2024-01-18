import java.util.*;

public class patterns {

    public static void hollowRect(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void invertRotatePyra(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invertHalfPyraNum(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - (i - 1); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floydsTriangle(int row) {
        int counter = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void tringle01(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public static void butterflyPattern(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (row - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (row - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void solidRhombus(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= row; j++) {
                if (i == 1 || i == row || j == 1 || j == row)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void diamond(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= (row - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = row - 1; i >= 1; i--) {
            for (int j = 1; j <= (row - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numberPyra(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= (row - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                if (j % 2 == 1)
                    System.out.print(i);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void palindromePattern(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print Hollow Rectangle Pattern
        // System.out.print("Enter Number of Rows: ");
        // int row = sc.nextInt();
        // System.out.print("Enter Number of Columns: ");
        // int col = sc.nextInt();
        // hollowRect(row, col);

        // Print Inverted and Rotated Half Pyramid
        // System.out.print("Enter Number of Rows: ");
        // int row = sc.nextInt();
        // invertRotatePyra(row);

        // Print Inverted Half Pyramid with Numbers Pattern
        // System.out.print("Enter Number of Rows: ");
        // int row = sc.nextInt();
        // invertHalfPyraNum(row);

        // Print Floyds Tringle Pattern
        // System.out.print("Enter Number of Rows: ");
        // int row = sc.nextInt();
        // floydsTriangle(row);

        // Print 01 Tringle Pattern
        // System.out.print("Enter Number of Rows: ");
        // int row = sc.nextInt();
        // tringle01(row);

        // Print Butterfly Pattern
        // System.out.print("Enter Number of Rows: ");
        // int row = sc.nextInt();
        // butterflyPattern(row);

        // Print Solid Rhombus Pattern
        // System.out.print("Enter Number of Rows: ");
        // int row = sc.nextInt();
        // solidRhombus(row);

        // Print Hollow Rhombus Pattern
        // System.out.print("Enter Number of Rows: ");
        // int row = sc.nextInt();
        // hollowRhombus(row);

        // Print Diamond Pattern
        // System.out.print("Enter Number of Rows: ");
        // int row = sc.nextInt();
        // diamond(row);

        // Print Number Pyramid Pattern
        // System.out.print("Enter Number of Rows: ");
        // int row = sc.nextInt();
        // numberPyra(row);

        // Print Palindrome Pyramid with Numbers Pattern
        System.out.print("Enter Number of Rows: ");
        int row = sc.nextInt();
        palindromePattern(row);

        sc.close();
    } 
}