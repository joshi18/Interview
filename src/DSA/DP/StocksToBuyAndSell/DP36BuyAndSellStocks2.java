package src.DSA.DP.StocksToBuyAndSell;

public class DP36BuyAndSellStocks2 {
    public static void main(String[] args) {
        // here i can buy and sell the stocks as many as you want
        // But condition is first buy then sell . After selling we have to buy or will chance to get buy
        int[] priceArr = {7, 1, 5, 3, 6, 4};
        int n = priceArr.length; // 6
        int[][] dp = new int[n + 1][2];

        // Base case
        dp[n][1] = 0;
        dp[n][0] = 0;

        // Code
        for (int i = n - 1; i >= 0; i--) {
            dp[i][1] = Math.max(-priceArr[i] + dp[i + 1][0], dp[i + 1][1]);
            dp[i][0] = Math.max(priceArr[i] + dp[i + 1][1], dp[i + 1][0]);

        }
        System.out.println(dp[0][1]);

        System.out.println(buyandSellStocks(priceArr, n - 1, 0, 1));
    }

    public static int buyandSellStocks(int[] priceArr, int n, int i, int buy) {
        // Base Case

        if (i == n) return 0;

        //Code
        int proFit = 0;
        if (buy == 1) {
            proFit = Math.max(-priceArr[i] + buyandSellStocks(priceArr, n, i + 1, 0), buyandSellStocks(priceArr, n, i + 1, 1));

        } else {
            proFit = Math.max(priceArr[i] + buyandSellStocks(priceArr, n, i + 1, 1), buyandSellStocks(priceArr, n, i + 1, 0));
        }
        return proFit;


    }
}
