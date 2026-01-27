package src.DSA.DP;

public class ClimbingSTairs {
    public static void main(String[] args) {
        int n = 3;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(dp[n]);
        //System.out.println(climbingtheSTis(n));
    }

//    public static int climbingtheSTis(int n) {
//
//        int[] dp = new int[n + 1];
//
//
//    }
}
