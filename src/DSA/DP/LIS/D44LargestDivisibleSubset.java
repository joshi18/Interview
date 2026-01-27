package src.DSA.DP.LIS;

public class D44LargestDivisibleSubset {
    public static void main(String[] args) {
        // Subset => not follwing a order . Means cab be any order.
        int[] arr = {1, 4, 8, 7, 16};
        // Subset => (1,4,16) OR (1,16,4) etc

        int n = arr.length;
        System.out.println(largestDivisiblesubset(arr, n, 0, -1));
    }

    public static int largestDivisiblesubset(int[] arr, int n, int CurrIndex, int prevIndex) {
        // this is for just calculating the Max length. Not for the Printing the subsequences

        if (CurrIndex == n) return 0;

        int take = 0;
        if (prevIndex == -1 || arr[CurrIndex] % arr[prevIndex] == 0) {
            take = 1 + largestDivisiblesubset(arr, n, CurrIndex + 1, CurrIndex);
        }
        int notTake = largestDivisiblesubset(arr, n, CurrIndex + 1, prevIndex);
        return Math.max(take, notTake);

    }
}
