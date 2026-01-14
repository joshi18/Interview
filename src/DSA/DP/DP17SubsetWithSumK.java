package src.DSA.DP;

public class DP17SubsetWithSumK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 5;
        int n = arr.length;
        //System.out.println(subSetSum(arr, k, n - 1));
        
        // Tabulation code
        int[][] dp = new int[n][k + 1];
        // Base Case
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }
        if (arr[0] <= k) {
            dp[0][arr[0]] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int sum = 1; sum <= k; sum++) {
                int pick = 0;
                if (arr[i] <= sum) {
                    pick = dp[i - 1][sum - arr[i]];
                }
                int notPick = dp[i - 1][sum];
                dp[i][sum] = notPick + pick;

            }
        }
        System.out.println(dp[n - 1][k]);

    }


    public static int subSetSum(int[] arr, int k, int i) {
        if (k == 0) return 1;
        if (i < 0) return 0;
        if (k < 0) return 0;

        int pick = 0;
        if (arr[i] <= k) {
            pick = subSetSum(arr, k - arr[i], i - 1);
        }
        ;
        int notPick = subSetSum(arr, k, i - 1);

        return pick + notPick;

    }
}
