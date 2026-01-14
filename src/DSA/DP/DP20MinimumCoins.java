package src.DSA.DP;

import java.util.IllegalFormatCodePointException;

public class DP20MinimumCoins {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 7};
        int target = 7;
        int n = arr.length;
        int[][] dp = new int[n][target + 1];

        // Base Case

        for (int sum = 0; sum <= target; sum++) {
            if (sum % arr[0] == 0)
                dp[0][sum] = sum / arr[0];
            else
                dp[0][sum] = (int) 1e9;
        }

        for (int i = 1; i < n; i++) {
            for (int sum = 0; sum <= target; sum++) {
                int notTake = dp[i - 1][sum];
                int take = (int) 1e9;
                if (arr[i] <= sum) {
                    take = 1 + dp[i][sum - arr[i]];
                }
                dp[i][sum] = Math.min(take, notTake);
            }
        }
        System.out.println(dp[n - 1][target]);


        //System.out.println(minimumCoins(arr, n - 1, target));
    }

    public static int minimumCoins(int[] arr, int i, int target) {

        // BASE CASE
        if (i == 0) {
            if (target % arr[0] == 0) return target / arr[0];
            else return (int) 1e9;
        }


        int notTake = minimumCoins(arr, i - 1, target);
        int take = 0;
        if (arr[i] <= target) {
            take = 1 + minimumCoins(arr, i, target - arr[i]);
        }
        return Math.min(take, notTake);

    }
}
