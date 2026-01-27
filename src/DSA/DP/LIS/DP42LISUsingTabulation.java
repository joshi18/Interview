package src.DSA.DP.LIS;

import java.util.Arrays;

public class DP42LISUsingTabulation {
    public static void main(String[] args) {
        // Tabulation method by using 1D DP Array.
        int[] arr = {5, 4, 11, 1, 16, 8};
        int n = arr.length;

        int[] dp = new int[n]; // LIS Till index at i.
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        for (int index = 0; index < n; index++) {
            for (int prevIndex = 0; prevIndex < index; prevIndex++) {
                if (arr[prevIndex] < arr[index]) {
                    dp[index] = Math.max(1 + dp[prevIndex], dp[index]);
                }
            }
        }
        System.out.println(Arrays.stream(dp).max().getAsInt());


    }
}
