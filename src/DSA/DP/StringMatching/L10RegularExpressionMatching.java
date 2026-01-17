package src.DSA.DP.StringMatching;

public class L10RegularExpressionMatching {
    public static void main(String[] args) {
        System.out.println(isMatch("ancdr", "*abch"));

    }

    public static boolean isMatch(String s, String p) {
        // Ground
        int i1 = p.length();
        int i2 = s.length();
        boolean[][] dp = new boolean[i1 + 1][i2 + 1];
        // Base Cases
        dp[0][0] = true;
        // when pattern length is zero but string is there
        for (int i = 1; i <= i2; i++) {
            dp[0][i] = false;
        }
        // when string length is zero but pattern is there . Mans pattern must contains only star (**)
        for (int i = 1; i <= i1; i++) {
            if (p.charAt(i - 1) == '*' && dp[i - 2][0]) dp[i][0] = true;
            else dp[i][0] = false;
        }


        // Code
        for (int i = 1; i <= i1; i++) {
            for (int j = 1; j <= i2; j++) {
                boolean sameChar = false;
                boolean dotChar = false;
                boolean starChar = false;
                if (p.charAt(i - 1) == s.charAt(j - 1)) sameChar = dp[i - 1][j - 1];
                else if (p.charAt(i - 1) == '.') dotChar = dp[i - 1][j - 1];
                else if (p.charAt(i - 1) == '*') starChar = dp[i - 2][j]
                        || ((p.charAt(i - 2) == s.charAt(j - 1) || p.charAt(i - 2) == '.') && dp[i][j - 1]);
                else dp[i][j] = false;
                dp[i][j] = sameChar || dotChar || starChar;
            }
        }
        return dp[i1][i2];


    }
}
