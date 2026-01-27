package src.DSA.DP;

import java.util.Arrays;
import java.util.HashSet;

public class DP50MinimumCostTotheRope {
    public static void main(String[] args) {
        int[] cuts = {1, 3, 4, 5};
        int n = 7;
        // Sorts the cuts array so the parts/cuts we are doing should not depend on each other.
        Arrays.sort(cuts);
        int[] newCutsArray = new int[cuts.length + 2];
        newCutsArray[0] = 0;
        newCutsArray[newCutsArray.length - 1] = 7;
        System.arraycopy(cuts, 0, newCutsArray, 1, cuts.length);

        //System.out.println(MinimumcostToCuttheRope(newCutsArray, n, 1, 4));
        // Tabulation Code
        int c = newCutsArray.length;
        int[][] dp = new int[c][c];

        // Base case is (i>j) return 0; Means  dp[1][0] = 0 AND dp[2][0] = 0 etc......
        for (int i = c - 2; i >= 1; i--) {
            for (int j = i; j <= c - 2; j++) {

                int mini = (int) 1e9;
                for (int index = i; index <= j; index++) {
                    int cost = newCutsArray[j + 1] - newCutsArray[i - 1] + dp[i][index - 1]
                            + dp[index + 1][j];

                    mini = Math.min(cost, mini);
                    dp[i][j] = mini;
                }

            }
        }
        System.out.println(dp[1][c - 2]);

    }

    public static int MinimumcostToCuttheRope(int[] cuts, int n, int i, int j) {

        if (i > j) return 0;

        int mini = (int) 1e9;
        for (int index = i; index <= j; index++) {
            int cost = cuts[j + 1] - cuts[i - 1] + MinimumcostToCuttheRope(cuts, n, i, index - 1)
                    + MinimumcostToCuttheRope(cuts, n, index + 1, j);

            mini = Math.min(cost, mini);
        }
        //System.out.println(mini);
        return mini;


    }
}
