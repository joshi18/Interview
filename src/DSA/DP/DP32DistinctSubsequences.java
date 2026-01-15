package src.DSA.DP;

public class DP32DistinctSubsequences {
    public static void main(String[] args) {
        String s1 = "bagbag";
        String s2 = "bag";
        int i1 = s1.length();
        int i2 = s2.length();
        int[][] dp = new int[i1 + 1][i2 + 1];

        // Base Case
        for (int i = 0; i <= i1; i++) {
            dp[i][0] = 1;
        }

        for (int i = 0; i <= i2; i++) {
            dp[0][i] = 0;
        }
        dp[0][0] = 1;

        // CODE
        for (int i = 1; i <= i1; i++) {
            for (int j = 1; j <= i2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[i1][i2]);

        System.out.println(distinctsubsequebces(s1, s2, i1 - 1, i2 - 1));
    }

    public static int distinctsubsequebces(String s1, String s2, int i1, int i2) {
        if (i2 < 0) return 1;
        if (i1 < 0) return 0;

        if (s1.charAt(i1) == s2.charAt(i2)) {
            return distinctsubsequebces(s1, s2, i1 - 1, i2 - 1) + distinctsubsequebces(s1, s2, i1 - 1, i2);
        }

        return distinctsubsequebces(s1, s2, i1 - 1, i2);


//        Golden Rule (Memorize This)
//        If two recursive calls can generate the same subsequence → never add both
//        Your “simplified” version violates this rule.

//        🔁 Compare with Subset Sum / Knapsack
//        Problem	Goal	Add 1?
//                Subset sum count	Count ways	❌ No
//            Coin change count	Count ways	❌ No
//        LCS	Max length	✅ Yes
//        Longest substring	Max length	✅ Yes
//🧠 Key Mental Rule (VERY IMPORTANT)
//        If DP returns “length / max / min” → add 1
//        If DP returns “number of ways” → NEVER add 1


    }
}
