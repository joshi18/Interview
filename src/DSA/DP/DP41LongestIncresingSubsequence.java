package src.DSA.DP;

public class DP41LongestIncresingSubsequence {
    public static void main(String[] args) {

        int[] arr = {7, 7, 7, 7, 7, 7};
        int n = arr.length;

        int[][] dp = new int[n + 1][n + 1];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i - 1; j >= -1; j--) {
                int take = 0;
                if (j == -1 || arr[i] > arr[j]) {
                    take = 1 + dp[i + 1][i + 1];
                }
                int notTake = dp[i + 1][j + 1];
                dp[i][j + 1] = Math.max(take, notTake);
            }
        }
        System.out.println(dp[0][0]);

        //System.out.println(lonestIncresingSubsequence(arr, n, -1, 0));

    }

    public static int lonestIncresingSubsequence(int[] arr, int n, int prevIndex, int currIndex) {
        if (currIndex == n) return 0;


        int take = 0;
        if (prevIndex == -1 || arr[currIndex] > arr[prevIndex]) {
            take = 1 + lonestIncresingSubsequence(arr, n, currIndex, currIndex + 1);
        }
        int notProfit = lonestIncresingSubsequence(arr, n, prevIndex, currIndex + 1);
        return Math.max(take, notProfit);

    }
}
