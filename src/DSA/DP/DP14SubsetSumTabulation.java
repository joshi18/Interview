package src.DSA.DP;

public class DP14SubsetSumTabulation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        int target = 4;
        boolean[][] dp = new boolean[n + 1][target + 1];
        // Base case
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int sum = 1; sum <= target; sum++) {
                boolean pick = false;
                if (arr[i] <= sum) {
                    pick = dp[i + 1][sum - arr[i]];
                }
                boolean notPick = dp[i + 1][sum];
                dp[i][sum] = pick || notPick;
            }
        }
        System.out.println(dp[0][target]);


    }
}
