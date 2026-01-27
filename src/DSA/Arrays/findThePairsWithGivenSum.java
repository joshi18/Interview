package DSA.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class findThePairsWithGivenSum {
    public static void main(String[] args) {
        List<Integer> mn = Arrays.asList(1, 2, 3, 7, 3, 1, 8, 654, 8, 9, 75);
        int targetSum = 10;
        findThePairs(mn, targetSum);
    }

    public static void findThePairs(List<Integer> mn, int sum) {
//        HashSet<Integer> integerHashSet = new HashSet<>(mn);
//        HashMap<String,List<Integer>> hashMap = new HashMap<>();
        int n = mn.size();
//        for (int i=0;i<n;i++){
//            int number2 = sum-mn.get(i);
//            if (integerHashSet.contains(number2)){
//                System.out.println("Found one pair "+number2+" "+ mn.get(i));
//            }
//
//        }

        // Native Approach O(n2)
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (mn.get(i) + mn.get(j) == sum) {
                    count += 1;
                }
            }
        }
        //System.out.println(count);


        // Using Sorting and Binary Search O(n log n)
        // mn.sort((a,b )-> a-b);
//        int count1 = 0;
//        for (int i = 0 ;i<n;i++){
//            int complement = sum- mn.get(i);
//            if (binarySearch(mn,complement,i+1)){
//                count1+=1;
//            };
//        }
        // System.out.println(count1);


        // Using 2 pointer technique
        int count2 = 0;
        int i = 0;
        int j = mn.size() - 1;
        while (i < j) {
            if (mn.get(i) + mn.get(j) == sum) {
                count2 += 1;
                i += 1;
                j -= 1;
            } else if (mn.get(i) + mn.get(j) < sum) {
                i += 1;

            } else {
                j -= 1;
            }
        }
        System.out.println(count2);


        // Using HashSet O(n) TIME and O(n) SPACE

        HashSet<Integer> bo = new HashSet<>();
        int count3 = 0;
        for (int l = 0; l < n; l++) {
            int complement = sum - mn.get(l);
            if (bo.contains(complement)) {
                count3 += 1;
            }
            bo.add(mn.get(l));


        }
        System.out.println(count3);


    }

    public static boolean binarySearch(List<Integer> jk, int elementoFound, int start) {
        int i = start;
        int j = jk.size() - 1;
        //int mid = i+j / 2;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (jk.get(mid) < elementoFound) {
                i = mid + 1;
            } else if (jk.get(mid) > elementoFound) {
                j = mid - 1;
            } else {
                return true;
            }

        }
        return false;

    }
}
