package src.DSA.Arrays.TwoPointers;

public class L80RemoveDuplicatesFromSortedARRAY {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int n = nums.length;

        int slow = 0;
        int fast = 1;
        int count = 1;
        int k = 2;
        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k += 1;
            }
        }
        System.out.println(k);
    }
}
