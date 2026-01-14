package src.DSA.DP;

import java.util.stream.Stream;

public class DP26PrintLCS {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "bdgek";

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

        String ans = "";
        while (i1 > 0 && i2 > 0) {
            if (s1.charAt(i1 - 1) == s2.charAt(i2 - 1)) {
                ans += s1.charAt(i1 - 1);
                i1 -= 1;
                i2 -= 1;

            } else {
                if (dp[i1 - 1][i2] < dp[i1][i2 - 1]) {
                    i2 -= 1;
                } else {
                    i1 -= 1;
                }
            }

        }
        System.out.println(ans);
        String finalans = "";
        for (int i = ans.length() - 1; i >= 0; i--) {
            finalans += ans.charAt(i);
        }
        System.out.println(finalans);


    }
}
