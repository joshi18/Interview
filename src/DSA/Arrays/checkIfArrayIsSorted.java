package src.DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class checkIfArrayIsSorted {

    public static void main(String[] args) {
        List<Integer> abc = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        checkarrayIsSorted(abc);
    }

    public static void checkarrayIsSorted(List<Integer> sortedArray) {
        for (int i = 0; i < sortedArray.size() - 1; i++) {
            if (sortedArray.get(i) > sortedArray.get(i + 1)) {
                System.out.println("Array is not sorted");
            }
        }
        System.out.println("Sorted Array");

    }
}
