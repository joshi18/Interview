package src.DSA.Arrays.TwoPointers;

public class L27RemoveElement {
    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] == val) {
                nums[left] = nums[right];
                right -= 1;
            } else {
                left += 1;
            }
        }
        System.out.println(left);

    }
}
