package src.DSA.DP;

public class DP24RodCutting {
    public static void main(String[] args) {

        int N = 5;
        int[] price = {2, 5, 7, 8, 10};
        int n = price.length;
        int[][] dp = new int[N][n + 1];

        for (int i = 0; i <= n; i++) {
            dp[0][i] = price[0] * i;
        }
        for (int i = 1; i < N; i++) {
            for (int rodlength = 0; rodlength <= n; rodlength++) {
                int notTake = dp[i - 1][rodlength];
                int take = Integer.MIN_VALUE;
                if (i + 1 <= rodlength) {
                    take = price[i] + dp[i][rodlength - (i + 1)];
                }
                dp[i][rodlength] = Math.max(notTake, take);
            }
        }
        System.out.println(dp[N - 1][n]);

        //System.out.println(rodCutting(N, price, n - 1));

    }

    public static int rodCutting(int RODLENGTH, int[] price, int i) {
        if (i == 0) {
            return price[0] * RODLENGTH;
        }
        if (RODLENGTH == 0) return 0;
        int notTake = rodCutting(RODLENGTH, price, i - 1);
        int take = Integer.MIN_VALUE;
        if (i + 1 <= RODLENGTH) {
            take = price[i] + rodCutting(RODLENGTH - (i + 1), price, i);

        }
        return Math.max(take, notTake);

    }
}
