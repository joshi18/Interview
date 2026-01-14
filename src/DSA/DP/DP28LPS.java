package src.DSA.DP;

public class DP28LPS {
    public static void main(String[] args) {
        // Longest Palindromic Subsequence
        String s1 = "abcba";
        String s2 = s1.chars().mapToObj(a -> (char) a).map(String::valueOf).reduce("", (c, v) -> v + c);
        // Now the same problem as DP25LCS. First string s1 and second string s2.

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
    }
}
