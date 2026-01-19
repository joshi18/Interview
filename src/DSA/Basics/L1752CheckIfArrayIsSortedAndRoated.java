package src.DSA.Basics;

import java.util.Arrays;

public class L1752CheckIfArrayIsSortedAndRoated {
    public static void main(String[] args) {
        int[] nums = {6, 10, 6};
        int mini = (int) 1e9;
        int index = 0;

        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count += 1;
            }

        }
        System.out.println(count);
        if (count >= 2) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
//        int n = nums.length;
//        int x = n - index;
//        int[] A = Arrays.copyOf(nums, nums.length);
//        Arrays.sort(nums);
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != A[((i + n - x) % A.length)]) {
//                //System.out.println("False");
//            }
//        }
        //System.out.println("True");
    }
}
