package src.DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseAnArray {
    public static void main(String[] args) {
        List<Integer> abc = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        reverseAnArray(abc);
    }

    public static void reverseAnArray(List<Integer> reverseArray) {
        int j = reverseArray.size() - 1;
        int i = 0;
        while (j >= i) {
            int temp = reverseArray.get(i);
            reverseArray.set(i, reverseArray.get(j));
            reverseArray.set(j, temp);
            i += 1;
            j -= 1;
        }
        System.out.println(reverseArray);
    }
}
