package src.DSA.DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DP14SubsetSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        int taget = 4;
        List<Integer> ans = new ArrayList<>();
        int[][] dp = new int[n + 1][taget + 1];
        for (int[] row : dp) Arrays.fill(row, -1);
        System.out.println(issubsetSum(arr, n, taget, ans, 0, dp));
    }

    public static boolean issubsetSum(int[] arr, int n, int target, List<Integer> ans, int i, int[][] dp) {

        if (target == 0) {
            // System.out.println(ans);
            return true;
        }
        if (i == n) {
            return false;
        }
        if (dp[i][target] != -1) dp[i][target] = 1;


        //ans.add(arr[i]);
        boolean pick = false;
        if (arr[i] <= target) {
            pick = issubsetSum(arr, n, target - arr[i], ans, i + 1, dp);
        }
        //ans.remove(ans.size() - 1);
        boolean notPick = issubsetSum(arr, n, target, ans, i + 1, dp);

        dp[i][target] = (pick || notPick) ? 1 : 0;

        return pick || notPick;

//        Striver’s Rule of Thumb
//        If a variable represents state → pass it as a parameter
//        If a variable represents choice → backtrack it
//        sumTillNow → state → pass as parameter ✅
//        ans list → choice → add/remove (backtracking) ✅

    }
}
