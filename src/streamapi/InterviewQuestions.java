package src.streamapi;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewQuestions {

    public static void main(String[] args) {




        // sort the string
        String [] arr = {"eat","ten","qus","suw","eta"};

        System.out.println(Arrays.stream(arr)
                .collect(Collectors.groupingBy(a->{
                    char [] abc = a.toCharArray();
                    Arrays.sort(abc);
                    return new String(abc);
                }))
                .entrySet()
                .stream()
                .map(a->a.getValue())
                .collect(Collectors.toList()));



        String arr1 = "Abhjit joshi here only here. Joshi here";
        String word = "here";
        Map<String, Long> wordCount = Arrays.stream(arr1.split("\\s+"))
                .map(String::toLowerCase)  // optional: ignore case
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(wordCount);


    }
}
