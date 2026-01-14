package src.DSA.DP;

import java.util.Arrays;

public class DP16PartitionSet {
    public static void main(String[] args) {
        int[] arr = {3, 2, 7};
        int n = arr.length;
        int target = Arrays.stream(arr).sum();
        boolean[][] dp = new boolean[n + 1][target + 1];
        //int currSum = 0;
        //System.out.println(partitionSet(n - 1, arr, target));
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i < n; i++) {
            for (int sum = 1; sum <= target; sum++) {
                boolean pick = false;
                if (arr[i] <= sum) {
                    pick = dp[i - 1][sum - arr[i]];
                }
                boolean notPick = dp[i - 1][sum];
                dp[i][sum] = pick || notPick;

            }
        }
        int minimum = (int) 1e9;
        for (int i = 1; i < target; i++) {
            boolean s1 = dp[n - 1][i];
            if (s1) {
                int s2 = target - i;
                int diff = Math.abs(s2 - i);
                minimum = Math.min(minimum, diff);
            }

        }
        System.out.println(minimum);
    }

    public static int partitionSet(int i, int[] arr, int targetSum) {

        if (i == 0) return arr[0];
        if (i < 0) return 0;

        int pick = arr[i] + partitionSet(i - 1, arr, targetSum);
        int notPick = partitionSet(i - 1, arr, targetSum);

        int minimum = Math.min(pick, targetSum - pick);
        return minimum;

    }
}
