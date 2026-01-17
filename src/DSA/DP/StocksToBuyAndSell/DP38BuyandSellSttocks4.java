package src.DSA.DP.StocksToBuyAndSell;

public class DP38BuyandSellSttocks4 {
    public static void main(String[] args) {
        // Same as DP37 Buy and sell stocks;
        int[] prices = {1, 90, 100, 2000, 3, 4, 5, 8};
        int n = prices.length;
        int maxTrans = 4;
        int[][][] dp = new int[n + 1][2][maxTrans + 1];
        // Base case
        for (int i = 0; i <= maxTrans; i++) {
            dp[n][1][i] = 0;
        }
        for (int i = 0; i <= maxTrans; i++) {
            dp[n][0][i] = 0;
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 4; j > 0; j--) {
                dp[i][1][j] = Math.max(-prices[i] + dp[i + 1][0][j - 1], dp[i + 1][1][j]);
                dp[i][0][j] = Math.max(prices[i] + dp[i + 1][1][j - 1], dp[i + 1][0][j]);
            }
        }
        System.out.println(dp[0][1][maxTrans]);


        // Base case

        //System.out.println(buyAndsell3(prices, n, maxTrans, 0, 1));
    }

    public static int buyAndsell3(int[] prices, int n, int maxTrans, int i, int buy) {
        // Base case
        if (i == n || maxTrans == 0) return 0;


        // coDE
        int profit = 0;
        if (buy == 1) {
            profit = Math.max(-prices[i] + buyAndsell3(prices, n, maxTrans - 1, i + 1, 0), buyAndsell3(prices, n, maxTrans, i + 1, 1));
        } else {
            profit = Math.max(prices[i] + buyAndsell3(prices, n, maxTrans - 1, i + 1, 1), buyAndsell3(prices, n, maxTrans, i + 1, 0));
        }
        return profit;


    }
}
