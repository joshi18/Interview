package src.DSA.DP.StringMatching;

public class DP34WildCardMatching {
    public static void main(String[] args) {
        String s1 = "ab*cd";
        String s2 = "abdefcd";
        int i1 = s1.length();
        int i2 = s2.length();
        boolean[][] dp = new boolean[i1 + 1][i2 + 1];
        for (int i = 1; i <= i2; i++) {
            dp[0][i] = false;
        }
        for (int i = 1; i <= i1; i++) {
            dp[i][0] = dp[i - 1][0] && s1.charAt(i - 1) == '*';
        }
        dp[0][0] = true;

        // CODE
        for (int i = 1; i <= i1; i++) {
            for (int j = 1; j <= i2; j++) {
                boolean starMark = false;
                boolean sameChar = false;
                boolean questionMark = false;
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) sameChar = dp[i - 1][j - 1];
                else if (s1.charAt(i - 1) == '?') {
                    questionMark = dp[i - 1][j - 1];

                } else if (s1.charAt(i - 1) == '*') {
                    starMark = dp[i][j - 1] || dp[i - 1][j];
                } else dp[i][j] = false;
                dp[i][j] = sameChar || starMark || questionMark;
            }
        }
        System.out.println(dp[i1][i2]);
        //System.out.println(wildCardMatching(s1, s2, i1 - 1, i2 - 1));
    }

    public static boolean wildCardMatching(String s1, String s2, int i1, int i2) {
        if (i1 < 0 && i2 < 0) return true;
        if (i1 < 0 && i2 >= 0) return false;
        if (i1 >= 0 && i2 < 0) {
            for (int i = 0; i <= i1; i++) {
                if (s1.charAt(i) != '*') return false;
            }
            return true;
        }

        boolean starMark = false;
        boolean sameChar = false;
        boolean questionMark = false;
        if (s1.charAt(i1) == s2.charAt(i2)) {
            sameChar = wildCardMatching(s1, s2, i1 - 1, i2 - 1);
        } else if (s1.charAt(i1) == '?') {
            questionMark = wildCardMatching(s1, s2, i1 - 1, i2 - 1);

        } else if (s1.charAt(i1) == '*') {
            starMark = wildCardMatching(s1, s2, i1, i2 - 1) || wildCardMatching(s1, s2, i1 - 1, i2);

        } else {
            return false;
        }
        return sameChar || questionMark || starMark;

    }
}
