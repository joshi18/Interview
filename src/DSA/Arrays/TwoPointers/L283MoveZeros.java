package src.DSA.Arrays.TwoPointers;

public class L283MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int n = nums.length;
        int slow = 0;
        int fast = 1;
        while (fast < n) {
            if (nums[fast] != 0 && nums[slow] == 0) {
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow += 1;
                fast += 1;
            } else if (nums[slow] == 0 && nums[fast] == 0) {
                fast += 1;
            }

        }
        System.out.println(nums);
    }
}
