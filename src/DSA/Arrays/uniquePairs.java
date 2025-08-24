package DSA.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class uniquePairs {
        public static void main(String[] args) {
            List<Integer> mn = Arrays.asList(1,2,3,7,3,1,8,654,8,9,75);
            int target = 10;

            Set<String> uniquePairs = new HashSet<>();
            Set<Integer> seen = new HashSet<>();

            for (int num : mn) {
                int complement = target - num;

                if (seen.contains(complement)) {
                    // Always store smaller first to avoid duplicates (e.g. (1,9) same as (9,1))
                    int a = Math.min(num, complement);
                    int b = Math.max(num, complement);
                    uniquePairs.add("(" + a + "," + b + ")");
                }
                seen.add(num);
            }

            System.out.println("Unique pairs: " + uniquePairs);
            System.out.println("Count: " + uniquePairs.size());
        }

}
