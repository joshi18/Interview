package src.DSA.DP;

import java.util.Arrays;

public class L1049LastStoneWeight2 {

    public static void main(String[] args) {
        int[] stones = {2, 4, 7, 3, 8, 1};

        int totalSum = 0;
        for (int x : stones) totalSum += x;

        int n = stones.length;
        int[][] dp = new int[n][2 * totalSum + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println(helper(stones, 0, 0, totalSum, dp));
    }

    public static int helper(int[] stones, int index, int diff, int offset, int[][] dp) {

        // Base case: all stones processed
        if (index == stones.length) {
            return Math.abs(diff);
        }

        // Memo check
        if (dp[index][diff + offset] != -1) {
            return dp[index][diff + offset];
        }

        // Choice 1: put stone in pile A (+)
        int add = helper(stones, index + 1, diff + stones[index], offset, dp);

        // Choice 2: put stone in pile B (-)
        int subtract = helper(stones, index + 1, diff - stones[index], offset, dp);

        // Store and return
        return dp[index][diff + offset] = Math.min(add, subtract);
    }
}
