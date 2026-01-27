package src.DSA.Arrays.TwoPointers;

import java.util.*;

public class L15ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(nums);
        List<List<Integer>> abc = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            //int reuiredSum = - nums[i];
            while (left < right) {
                //List<Integer> abcd = new ArrayList<>();
                if (nums[i] + nums[left] + nums[right] == 0) {
                    List<Integer> abcd = new ArrayList<>();
                    abcd.add(nums[i]);
                    abcd.add(nums[left]);
                    abcd.add(nums[right]);
                    abc.add(abcd);
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // skip duplicates for right
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;

                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left += 1;

                } else {
                    right -= 1;
                }


            }


        }
        System.out.println(abc);

    }
}
