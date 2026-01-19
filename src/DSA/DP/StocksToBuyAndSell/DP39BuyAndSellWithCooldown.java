package src.DSA.DP.StocksToBuyAndSell;

public class DP39BuyAndSellWithCooldown {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        int[][] dp = new int[n + 2][2];
        // Base Case

        dp[n][0] = 0;
        dp[n][1] = 0;

        dp[n + 1][0] = 0;
        dp[n + 1][1] = 0;


        for (int i = n - 1; i >= 0; i--) {
            // Buy
            dp[i][1] = Math.max(-arr[i] + dp[i + 1][0], dp[i + 1][1]);
            // Sell
            dp[i][0] = Math.max(arr[i] + dp[i + 2][1], dp[i + 1][0]);
        }
        System.out.println(dp[0][1]);
        //System.out.println(cooldoenStocks(arr, n, 0, 1));

    }

    public static int cooldoenStocks(int[] arr, int n, int i, int buy) {

        if (i >= n) return 0;

        int profit = 0;
        if (buy == 1) {
            profit = Math.max(-arr[i] + cooldoenStocks(arr, n, i + 1, 0), cooldoenStocks(arr, n, i + 1, 1));
        } else {
            profit = Math.max(arr[i] + cooldoenStocks(arr, n, i + 2, 1), cooldoenStocks(arr, n, i + 1, 0));
        }
        return profit;
    }
}
