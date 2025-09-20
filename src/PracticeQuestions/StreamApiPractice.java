package src.PracticeQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamApiPractice {
    public static void main(String[] args) {
        String input = "swiss";

        Optional <Character> abc = input.chars().mapToObj(a->(char) a)
                .collect(Collectors.groupingBy(a->a,LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(a->a.getValue() == 1)
                .map(a->a.getKey())
                .findFirst();
        System.out.println(abc.get());

        List<Integer> nums = Arrays.asList(3,1,4,1,5,6,7,2);
        int k = 6;

        System.out.println(IntStream.range(0,nums.size())
                .boxed()
                .flatMap(i->IntStream.range(i+1,nums.size()).mapToObj(j->new int[]{nums.get(i),nums.get(j)}))
                .filter(pair->pair[0]+pair[1]==k)
                .map(pair-> {
                    int a = Math.min(pair[0],pair[1]);
                    int b = Math.max(pair[0],pair[1]);
                    return a+","+b;
                })
                .collect(Collectors.toSet()));

        System.out.println(nums.stream().count());
        System.out.println(nums.stream().mapToInt(a->(Integer) a).summaryStatistics());






//        List<Integer> nums2 = Arrays.asList(5,1,7,3,9,12,11,15,2);
//        nums2.stream().

    }
}
