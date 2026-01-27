package src.DSA.DP;

public class DP48MCM {
    public static void main(String[] args) {
        // NEW PATTERN
        // Solve the problem in a paticular way/Pattern then => partition DP
        // Just like (1+3) *5
        // 1+(3*5) gives another answer
        // MATRIX CHAIN mUltiplication

        int[] arr = {10, 20, 30};
        int n = arr.length;
        // Tabulation code

        int[][] dp = new int[n][n];
        // Base Case
        for (int i = 1; i < n; i++) {
            dp[i][i] = 0;// when i and j are same then return 0;
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = i + 1; j <= n - 1; j++) {
                int mini = (int) 1e9;
                for (int k = i; k < j; k++) {
                    int steps = (arr[i - 1] * arr[k] * arr[j]) + dp[i][k]
                            + dp[k + 1][j];

                    mini = Math.min(steps, mini);
                }
                dp[i][j] = mini;
            }
        }
        System.out.println(dp[1][n - 1]);

        //System.out.println(matrixChainmultiplication(arr, n, 1, n - 1));
    }

    public static int matrixChainmultiplication(int[] arr, int n, int i, int j) {

        if (i == j) return 0; // if there is only one array is there then it will return 0 as 0 steps are required.


        int mini = (int) 1e9;
        for (int k = i; k < j; k++) {
            int steps = (arr[i - 1] * arr[k] * arr[j]) + matrixChainmultiplication(arr, n, i, k)
                    + matrixChainmultiplication(arr, n, k + 1, j);

            mini = Math.min(steps, mini);
        }
        return mini;


    }
}
