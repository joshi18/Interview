package src.DSA.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheSecondListElement {


    public static void main(String[] args) {

        List<Integer> abc = new ArrayList<>();
        abc.add(1);
        abc.add(2);
        abc.add(3);
        abc.add(4);
        abc.add(4);
        abc.add(3);
        System.out.println(findtheSecondLargesteleement(abc));
        System.out.println(findtheSecondLargesteleementUsingStramApi(abc));
    }

    public static int findtheSecondLargesteleement(List<Integer> listOfIntegers) {
        int n = listOfIntegers.size();
        int max1 = -1;
        int max2 = -1;
        for (int i = 0; i < n; i++) {
            if (listOfIntegers.get(i) > max1) {
                max2 = max1;
                max1 = listOfIntegers.get(i);
            } else if (listOfIntegers.get(i) > max2 && listOfIntegers.get(i) < max1) {
                max2 = listOfIntegers.get(i);

            }
        }
        return max2;


    }

    public static int findtheSecondLargesteleementUsingStramApi(List<Integer> listofIntegers) {
        if (listofIntegers.size() == 0) return -1;
        List<Integer> ListofIntegrs = listofIntegers.stream().sorted((a, b) -> b - a).distinct().toList();
        return ListofIntegrs.get(1);


//        Integer abc = listofIntegers.stream().sorted((a,b)->b-a).skip(1).findFirst().orElse(null);
//        return abc;
// alternative and better approach.
// }
    }
}
