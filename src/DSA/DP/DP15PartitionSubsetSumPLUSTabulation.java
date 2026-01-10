package src.DSA.DP;

import java.util.Arrays;

public class DP15PartitionSubsetSumPLUSTabulation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        int totalsum = Arrays.stream(arr).sum();
        if (totalsum % 2 != 0) {
            System.out.println("False");
            return;
        }
        int target = totalsum / 2;
        boolean[][] dp = new boolean[n + 1][target + 1];
        // Base Case
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i < n; i++) {
            for (int sum = 1; sum <= target; sum++) {

                boolean notPick = dp[i - 1][sum];
                boolean pick = false;

                if (arr[i] <= sum) {
                    pick = dp[i - 1][sum - arr[i]];
                }

                dp[i][sum] = pick || notPick;
            }
        }

        System.out.println(dp[n - 1][target]);
        //int initialSum = 0;
        //System.out.println(partitionofSubsets(n - 1, arr, totalsum / 2, initialSum));
    }

    public static boolean partitionofSubsets(int i, int[] arr, int totalSum, int initialSum) {

        if (totalSum == initialSum) return true;
        if (i < 0 || initialSum > totalSum) return false;


        boolean pick = partitionofSubsets(i - 1, arr, totalSum, initialSum + arr[i]);

        boolean notPick = partitionofSubsets(i - 1, arr, totalSum, initialSum);

        return pick || notPick;

    }


}
