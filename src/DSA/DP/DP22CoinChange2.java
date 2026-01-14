package src.DSA.DP;

public class DP22CoinChange2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int target = 4;
        int n = arr.length;
        int[][] dp = new int[n][target + 1];
        // BASE CASE

        for (int sum = 0; sum <= target; sum++) {
            if (sum % arr[0] == 0)
                dp[0][sum] = 1;
            else
                dp[0][sum] = 0;
        }


        for (int i = 1; i < n; i++) {
            for (int sum = 0; sum <= target; sum++) {
                int notTake = dp[i - 1][sum];
                int take = 0;
                if (arr[i] <= sum) {
                    take = dp[i][sum - arr[i]];
                }
                dp[i][sum] = take + notTake;
            }
        }
        System.out.println(dp[n - 1][target]);
        //System.out.println(coinChange(arr, target, n - 1));
    }

    public static int coinChange(int[] arr, int taget, int i) {

        if (i == 0) {
            if (arr[0] == taget) return 1;
            else return 0;
        }

        int take = 0;
        if (arr[i] <= taget) {
            take = 1 + coinChange(arr, taget - arr[i], i);
        }
        int notTake = coinChange(arr, taget, i - 1);

        return take + notTake;


    }
}
