package src.DSA.Arrays.TwoPointers;

public class L88MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int[] nums2 = {1, 2, 3};


        int n1 = nums1.length;
        int n2 = nums2.length;


        int i = 0;
        int j = 0;
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j] && nums1[i] != 0) {
                i += 1;
            } else if (nums1[i] < nums2[j] && nums1[i] == 0) {
                nums1[i] = nums2[j];
                i += 1;
                j += 1;

            } else if (nums1[i] > nums2[j]) {
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums1[i + 1] = temp;
                i += 1;
                j += 1;
            } else {
                i += 1;
            }
        }
        for (int l = 0; l < n1; l++) {
            System.out.println(nums1[l]);
        }
    }
}
