package src.DSA.DP.StocksToBuyAndSell;

public class L3573BuyAndSelltheStocks5 {
    public static void main(String[] args) {
        int[] prices = {1, 7, 9, 8, 2};
        int n = prices.length;
        int maxTrans = 2;
        int[][][] dp = new int[n + 1][3][maxTrans + 1];
        // Base case
        for (int i = 0; i <= maxTrans; i++) {
            dp[n][1][i] = (int) -1e9;
            ;
        }
        for (int i = 0; i <= maxTrans; i++) {
            dp[n][0][i] = 0;
        }
        for (int i = 0; i <= maxTrans; i++) {
            dp[n][2][i] = (int) -1e9;
            ;
        }
        // doing nothing = 0
        // buying  buy -> sell   = 1
        // selling sell -> buy   = 2

        for (int i = n - 1; i >= 0; i--) {
            for (int j = maxTrans; j > 0; j--) {
//                dp[i][1][j] = Math.max(-prices[i] + dp[i + 1][0][j - 1], prices[i] + dp[i + 1][1][j - 1]);
//                dp[i][0][j] = Math.max(prices[i] + dp[i + 1][1][j - 1], -prices[i] + dp[i + 1][0][j]);


                dp[i][0][j] = Math.max(dp[i + 1][0][j], Math.max(-prices[i] + dp[i + 1][1][j], prices[i] + dp[i + 1][2][j]));
                dp[i][1][j] = Math.max(prices[i] + dp[i + 1][0][j - 1], dp[i + 1][1][j]);
                dp[i][2][j] = Math.max(-prices[i] + dp[i + 1][0][j - 1], dp[i + 1][2][j]);

            }
        }
        System.out.println(dp[0][0][maxTrans]);
    }
}
