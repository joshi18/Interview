package src.DSA.Arrays.TwoPointers;

import java.util.Arrays;

public class L16ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2};
        int target = 3;
        int n = nums.length;
        int difference = Integer.MAX_VALUE;
        int ans = 0;
        // should be minimum

        Arrays.sort(nums);
        for (int i = 0; i < n - 1; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                if (difference > Math.abs(target - sum)) {
                    difference = Math.abs(target - sum);
                    ans = sum;
                }
                if (sum < target) {
                    left += 1;
                } else if (sum > target) {
                    right -= 1;
                } else {
                    System.out.println(sum);
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
