package src.DSA.Arrays;

import java.util.Arrays;
import java.util.List;

public class ChecktheMissingNumber {

    public static void main(String[] args) {
        List<Integer> abc = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 8, 9, 10);
        checkIfArrayIsSorted(abc);
    }

    public static void checkIfArrayIsSorted(List<Integer> missingNumber) {
        int sum = missingNumber.stream().mapToInt(a -> a).sum();
        int exceptedSum = missingNumber.size() * (missingNumber.size() + 1) / 2;
        System.out.println(exceptedSum - sum);

    }


}
