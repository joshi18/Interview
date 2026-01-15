package src.DSA.DP.StringMatching;

public class DP33EditDistances {
    public static void main(String[] args) {
        String s1 = "intention";
        String s2 = "execution";
        int i1 = s1.length();
        int i2 = s2.length();
        int[][] dp = new int[i1 + 1][i2 + 1];
        // BASE CASE
        for (int i = 0; i <= i2; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i <= i1; i++) {
            dp[i][0] = i;
        }

        for (int i = 1; i <= i1; i++) {
            for (int j = 1; j <= i2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
                    // Insert , Delete, Replace.
                }
            }
        }
        System.out.println(dp[i1][i2]);

        //System.out.println(editdistances(s1, s2, i1 - 1, i2 - 1));
    }

    public static int editdistances(String s1, String s2, int i1, int i2) {

        if (i2 < 0) return i1 + 1;
        if (i1 < 0) return i2 + 1;

        if (s1.charAt(i1) == s2.charAt(i2)) {
            return editdistances(s1, s2, i1 - 1, i2 - 1);

        } else {
            return 1 + Math.min(editdistances(s1, s2, i1 - 1, i2), Math.min(editdistances(s1, s2, i1, i2 - 1), editdistances(s1, s2, i1 - 1, i2 - 1)));
        }

    }
}
