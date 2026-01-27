package src.DSA.Arrays.TwoPointers;

public class L11ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int slow = 0;
        int fast = height.length - 1;
        int maxi = 0;

        while (slow < fast) {
            int area = (fast - slow) * Math.min(height[slow], height[fast]);
            maxi = Math.max(maxi, area);

            if (height[slow] < height[fast]) {
                slow++;
            } else {
                fast--;
            }
        }
        System.out.println(maxi);
    }
}
