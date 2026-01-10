package src.DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {2, 4, 2, 1, 6, 9, 5, 3, 0, 9};
        int right = arr.length - 1;
        int left = 0;
        mergeSort(arr, left, right);
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }
        int mid = (right + left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        mergeTheArray(arr, left, right, mid);

    }

    public static void mergeTheArray(int[] arr, int left, int right, int mid) {
        List<Integer> temp = new ArrayList<>();
        int low = left;
        int high = mid + 1;
        while (low <= mid && high <= right) {
            if (arr[low] < arr[high]) {
                temp.add(arr[low]);
                low += 1;
            } else {
                temp.add(arr[high]);
                high += 1;

            }

        }
        while (low <= mid) {
            temp.add(arr[low]);
            low += 1;
        }
        while (high <= right) {
            temp.add(arr[high]);
            high += 1;
        }
        for (int i = 0; i < temp.size(); i++) {
            arr[left + i] = temp.get(i);
        }

    }
}
