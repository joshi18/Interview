package src.DSA.Basics;

import src.Main;

import java.util.Arrays;
import java.util.Collections;

public class L189LeftRotate {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        int k = 7;
        int refinedK = k;
        if (nums.length < k) {
            refinedK = k % nums.length;
        }

//        int[] ansArray = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            ansArray[i] = nums[(nums.length - refinedK + i) % nums.length];
//        }
//        for (int i = 0; i < ansArray.length; i++) {
//            nums[i] = ansArray[i];
//        }

        // 2nd Solution
        // 7,6,5  , 4,3,2,1
        int i = 0;
        int n = nums.length;
        reverse(nums, 0, n - 1);

        reverse(nums, 0, refinedK - 1);

        reverse(nums, k, n - 1);

        Arrays.toString(nums);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }

    }
}
