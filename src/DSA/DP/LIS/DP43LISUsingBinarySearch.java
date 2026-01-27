package src.DSA.DP.LIS;

public class DP43LISUsingBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 4, 11, 1, 16, 8};
        int n = arr.length;

        int[] temp = new int[n];
        int len = 0; // length of LIS

        for (int i = 0; i < n; i++) {
            int pos = lowerBound(temp, 0, len - 1, arr[i]);
            temp[pos] = arr[i];

            if (pos == len) {
                len++;
            }
        }

        System.out.println(len);

    }

    // Finds first index where arr[index] >= target
    private static int lowerBound(int[] arr, int left, int right, int target) {
        int ans = right + 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
