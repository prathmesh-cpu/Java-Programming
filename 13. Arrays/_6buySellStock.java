import java.util.*;

public class _6buySellStock {

    public static int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfits = 0; // For no profit it return 0

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int currProfit = prices[i] - buyPrice;
                maxProfits = Math.max(currProfit, maxProfits);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int size = sc.nextInt();

        int prices[] = new int[size];
        System.out.print("Enter The Array Elements: ");
        for (int i = 0; i < prices.length; i++) {
            prices[i] = sc.nextInt();
        }
        int maxProfits = maxProfit(prices);
        System.out.println("Max Profit: " + maxProfits);

        sc.close();
    }
}