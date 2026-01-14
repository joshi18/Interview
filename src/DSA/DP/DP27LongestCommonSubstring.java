package src.DSA.DP;

public class DP27LongestCommonSubstring {
    public static void main(String[] args) {

        String s1 = "abcjklp";
        String s2 = "acjkp";
        int i1 = s1.length();
        int i2 = s2.length();


        int[][] dp = new int[i1 + 1][i2 + 1];
        // Base case
        for (int i = 0; i <= i2; i++) {
            dp[0][i] = 0;
        }
        for (int i = 0; i <= i1; i++) {
            dp[i][0] = 0;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= i1; i++) {
            for (int j = 1; j <= i2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    max = Math.max(max, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        System.out.println(max);
        // Traverse inside the dp
//        int max = Integer.MIN_VALUE;
//        for (int i = 1; i <= i1; i++) {
//            for (int j = 1; j <= i2; j++) {
//                max = Math.max(max, dp[i][j]);
//            }
//        }
//        System.out.println(max);

        //System.out.println(lcsSubstringRec(s1, s2, i1, i2, 0));
    }

    public static int lcsSubstringRec(String s1, String s2, int i, int j, int count) {

        if (i == 0 || j == 0) return count;

        int c1 = count;

        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            c1 = lcsSubstringRec(s1, s2, i - 1, j - 1, count + 1);
        }

        int c2 = lcsSubstringRec(s1, s2, i - 1, j, 0);
        int c3 = lcsSubstringRec(s1, s2, i, j - 1, 0);

        return Math.max(c1, Math.max(c2, c3));
    }

}
