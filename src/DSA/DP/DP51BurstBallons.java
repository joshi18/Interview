package src.DSA.DP;

public class DP51BurstBallons {
    public static void main(String[] args) {

        int[] nums = {3, 1, 5, 8};
        int n = nums.length;
        int[] newArray = new int[n + 2];
        newArray[0] = 1;
        newArray[newArray.length - 1] = 1;
        for (int i = 1; i <= nums.length; i++) {
            newArray[i] = nums[i - 1];
        }
        int c = newArray.length;
        int[][] dp = new int[c][c];


        // Base Case

        for (int i = c - 2; i >= 1; i--) {
            for (int j = i; j <= c - 2; j++) {
                int maxi = (int) -1e9;
                for (int index = i; index <= j; index++) {
                    int cost = newArray[i - 1] * newArray[index] * newArray[j + 1] + dp[i][index - 1]
                            + dp[index + 1][j];
                    //System.out.println(cost);
                    maxi = Math.max(maxi, cost);
                    dp[i][j] = maxi;
                }

            }
        }
        System.out.println(dp[1][c - 2]);
        // System.out.println(burstBallons(newArray, 1, newArray.length - 2));
    }

    public static int burstBallons(int[] arr, int i, int j) {

        if (i > j) return 0;

        int maxi = (int) -1e9;
        for (int index = i; index <= j; index++) {
            int cost = arr[i - 1] * arr[index] * arr[j + 1] + burstBallons(arr, i, index - 1)
                    + burstBallons(arr, index + 1, j);
            //System.out.println(cost);
            maxi = Math.max(maxi, cost);
        }
        return maxi;

    }
}
