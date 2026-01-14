package src.DSA.DP;

public class DP25LCS {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bca";
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
        System.out.println(dp[i1][i2]);

        //System.out.println(calculatelcs(s1, s2, n - 1, n - 1));
    }

    public static int calculatelcs(String s1, String s2, int i1, int i2) {

        // Base Case
        if (i1 < 0 || i2 < 0) {
            return 0;
        }

        if (s1.charAt(i1) == s2.charAt(i2)) {
            return 1 + calculatelcs(s1, s2, i1 - 1, i2 - 1);
        }
        return Math.max(calculatelcs(s1, s2, i1 - 1, i2), calculatelcs(s1, s2, i1, i2 - 1));


    }
}
