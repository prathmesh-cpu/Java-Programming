import java.util.*;

public class _3tilingProblem {

    public static int tilingProblem(int n) { // Board size => 2 x n
        // base case
        if (n == 0 || n == 1)
            return 1;

        // return verticalWays + horizontalWays;
        return tilingProblem(n - 1) + tilingProblem(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the board: ");
        int n = sc.nextInt();

        System.out.println("Number of Ways to tile a '(2 x " + n + ") Board': " + tilingProblem(n));
        System.out.println();

        sc.close();
    }
}