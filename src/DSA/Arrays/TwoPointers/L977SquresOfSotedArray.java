package src.DSA.Arrays.TwoPointers;

public class L977SquresOfSotedArray {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int n = nums.length;
        int[] newarray = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                newarray[index] = nums[left] * nums[left];
                left += 1;
                index -= 1;
            } else {
                newarray[index] = nums[right] * nums[right];
                right -= 1;
                index -= 1;
            }
        }
        for (int i = 0; i < newarray.length; i++) {
            System.out.println(newarray[i]);
        }


    }
}
