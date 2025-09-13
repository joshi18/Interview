package QuestionsAskedInterview;

import java.util.*;

public class ArrayQuestions {

    public static void main(String[] args) {


        List<Integer> abc = Arrays.asList(3, 1, 4, 1, 5);
        int k = 2;

        Collections.sort(abc); // [1,1,3,4,5]
        int n = abc.size();

        Set<List<Integer>> sg = new HashSet<>();

        int i = 0, j = 1;
        while (i < n && j < n) {
            if (i == j) {
                j++;
                continue;
            }

            int diff = abc.get(j) - abc.get(i);

            if (diff == k) {
                sg.add(Arrays.asList(abc.get(i), abc.get(j))); // always sorted since abc is sorted
                i++;
                j++;
            } else if (diff < k) {
                j++;
            } else {
                i++;
            }
        }

        System.out.println(sg); // [[1, 3], [3, 5]]
        System.out.println("Count: " + sg.size()); // 2


    }
}
