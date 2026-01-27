package src.DSA.Arrays.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L18FourSum {
    public static void main(String[] args) {
        int[] nums = {-2, -1, -1, 1, 1, 2, 2};
        int target = 0;
        long Neewtar = (long) target;

        Arrays.sort(nums);


        //  int sum4 = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     sum4 += nums[i];
        // }
        List<List<Integer>> ans = new ArrayList<>();
        // if(nums.length < 4) return ans;
        // if (nums.length == 4 && sum4 == Neewtar) {
        //     ans.add(Arrays.asList(nums[0], nums[1], nums[2], nums[3]));

        //     return ans;
        // }

        //List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int left = j + 1;
                int right = n - 1;
                while (left < right) {
                    List<Integer> abc = new ArrayList<>();
                    int sum = nums[left] + nums[right] + nums[i] + nums[j];
                    if (Neewtar > sum) {
                        left += 1;
                    } else if (Neewtar < sum) {
                        right -= 1;

                    } else {
                        abc.add(nums[left]);
                        abc.add(nums[right]);
                        abc.add(nums[i]);
                        abc.add(nums[j]);
                        ans.add(abc);
                        while (left < right && nums[left] == nums[left + 1]) {
                            left += 1;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right -= 1;
                        }
                        left += 1;
                        right -= 1;

                    }
                }
            }
        }
        System.out.println(ans);
    }
}
