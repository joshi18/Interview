package src.DSA.DP;

public class DP19Knapsack {
    public static void main(String[] args) {
        int[] wt = {3, 4, 5};
        int[] value = {30, 40, 50};
        int maxWt = 8;
        int n = value.length;
        int[][] dp = new int[n][maxWt + 1];
        // Base Case
        for (int i = wt[0]; i <= maxWt; i++) {
            dp[0][i] = value[0];
        }

        for (int i = 1; i < n; i++) {
            for (int weight = 0; weight <= maxWt; weight++) {
                int pick = 0;
                if (wt[i] <= weight) {
                    pick = value[i] + dp[i - 1][weight - wt[i]];
                }
                int notPick = dp[i - 1][weight];
                dp[i][weight] = Math.max(pick, notPick);
            }
        }
        System.out.println(dp[n - 1][maxWt]);

        //System.out.println(knapSackproblem(wt, value, maxWt, 0, n - 1));
    }

    public static int knapSackproblem(int[] wt, int[] value, int maxWt, int initialWt, int i) {

        if (i == 0) {

            if (wt[i] <= maxWt) return value[0];
            else return 0;
        }
        ;


        int pick = 0;
        if (wt[i] <= maxWt) {
            pick = value[i] + knapSackproblem(wt, value, maxWt - wt[i], initialWt, i - 1);
        }
        int notPick = knapSackproblem(wt, value, maxWt, initialWt, i - 1);
        return Math.max(pick, notPick);

    }
}
