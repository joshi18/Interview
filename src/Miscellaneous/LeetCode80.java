package src.Miscellaneous;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode80 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        Map<Integer, Integer> abc = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (abc.containsKey(nums[i])) {
                abc.put(nums[i], abc.get(nums[i]) + 1);
            } else {
                abc.put(nums[i], 1);
            }
        }
        //System.out.println(abc);
        int slow = 0;
        int fast = 1;
        while (fast < nums.length) {
            if (nums[slow] == nums[fast]) {
                if (abc.get(nums[slow]) > 2) {
                    slow += abc.get(nums[slow]) - 2;
                    fast += abc.get(nums[fast]) - 2;
                }
            } else {
                nums[slow] = nums[fast];

            }
            slow += 1;
            fast += 1;

        }
        System.out.println(nums.length);
        Arrays.stream(nums).forEach(System.out::println);

    }
}
