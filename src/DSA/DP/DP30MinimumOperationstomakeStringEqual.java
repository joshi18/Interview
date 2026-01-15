package src.DSA.DP;

public class DP30MinimumOperationstomakeStringEqual {
    public static void main(String[] args) {

        // Simple
        // S1 and S2 are given . Find LCS of S1 and S2
        // s1+s2 - 2*LCS(S1,S2) = Ans
        String s1 = "heap";
        String s2 = "pea";
        int i1 = s1.length();
        int i2 = s2.length();
        int[][] dp = new int[i1 + 1][i2 + 1];
        // Base Case
        for (int i = 0; i <= i2; i++) {
            dp[0][i] = 0;

        }
        for (int i = 0; i <= i1; i++) {
            dp[i][0] = 0;

        }

        for (int i = 1; i <= i1; i++) {
            for (int j = 1; j <= i2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        int Ans = s1.length() + s2.length() - 2 * dp[i1][i2];
        System.out.println(Ans);

    }
}
