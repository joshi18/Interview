package src.DSA.DP.StocksToBuyAndSell;

public class DP40BuyAndSellStocks6TransctionFee {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        int[][] dp = new int[n + 1][2];
        // Base Case

        dp[n][0] = 0;
        dp[n][1] = 0;


        for (int i = n - 1; i >= 0; i--) {
            // Buy
            dp[i][1] = Math.max(-arr[i] + dp[i + 1][0], dp[i + 1][1]);
            // Sell
            dp[i][0] = Math.max(arr[i] + dp[i + 1][1] - 2, dp[i + 1][0]);
        }
        System.out.println(dp[0][1]);

    }
}
