package src.DSA.DP;

public class DP23UnboundedKnapSack {
    public static void main(String[] args) {
        int[] wt = {2, 4, 6};
        int[] val = {100, 200, 330};

        int w = 10;
        int n = wt.length;

        int[][] dp = new int[n][w + 1];
        // Base Case

        for (int weight = 0; weight <= w; weight++) {
            dp[0][weight] = (weight / wt[0]) * val[0];
        }

        for (int i = 1; i < n; i++) {
            for (int weight = 0; weight <= w; weight++) {
                int notTake = dp[i - 1][weight];
                int take = 0;
                if (wt[i] <= weight) {
                    take = val[i] + dp[i][weight - wt[i]];
                }
                dp[i][weight] = Math.max(notTake, take);
            }
        }
        System.out.println(dp[n - 1][w]);

        //System.out.println(unboundedKnapSack(wt, val, w, n - 1));
    }

    public static int unboundedKnapSack(int[] wt, int[] val, int w, int i) {

        // Base case
        if (w == 0) return 0;
        if (i == 0) {
            return (w / wt[0]) * val[0];
        }


        int notTake = unboundedKnapSack(wt, val, w, i - 1);
        int take = 0;
        if (wt[i] <= w) {
            take = val[i] + unboundedKnapSack(wt, val, w - wt[i], i);
        }
        return Math.max(notTake, take);


    }
}
