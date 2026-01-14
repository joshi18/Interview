package src.DSA.DP;

import java.util.Arrays;

public class DP18PatitionsWithGivenDifference {
    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 4};
        int n = arr.length;
        int d = 3;
        int totalSum = Arrays.stream(arr).sum();
        if ((totalSum - d) % 2 != 0) System.out.println("error");
        int s2 = (totalSum - d) / 2;
        int[][] dp = new int[n][s2 + 1];
        // Base Case
        // if condition for arr[0] is 0.
        if (arr[0] == 0) dp[0][0] = 2;
        else dp[0][0] = 1;
        if (arr[0] != 0 && arr[0] <= s2) dp[0][arr[0]] = 1;
        for (int i = 1; i < n; i++) {
            for (int sum = 1; sum <= s2; sum++) {
                int notPick = dp[i - 1][sum];
                int pick = 0;
                if (arr[i] <= sum) {
                    pick = dp[i - 1][sum - arr[i]];
                }
                dp[i][sum] = pick + notPick;
            }
        }
        System.out.println(dp[n - 1][s2]);

        //System.out.println(partitionswithSum(arr, n - 1, s2));
    }

    public static int partitionswithSum(int[] arr, int i, int sum) {

        if (i == 0) {
            if (sum == 0 || arr[0] == sum) return 1;
            if (arr[0] > sum || arr[0] < sum) return 0;
        }

        int pick = 0;
        if (arr[i] <= sum) {
            pick = partitionswithSum(arr, i - 1, sum - arr[i]);
        }
        int notPick = partitionswithSum(arr, i - 1, sum);

        return pick + notPick;


    }
}
