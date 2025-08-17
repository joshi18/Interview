package streamapi;

import java.util.*;
import java.util.stream.Collectors;


//🔹 Medium-Level Stream Questions
//
//Find the second largest number in a list.
//
//Find the first non-repeating character in a string.
//
//Group words by their length.
//
//Find the most frequent element in a list.
//
//Count the number of distinct elements in a list.
//
//Reverse each word in a list while keeping the order of words intact.
//
//Find all duplicate elements in a list.
//
//Merge two lists into one without duplicates.
//
//        Check if a string is an anagram of another string using Streams.

//Find the average length of words in a list.
public class MediumAndAdvancedQuestions {
    public static void main(String[] args) {
        List<Integer> abc = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 9);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String stringABC = "AaBBCCdwqA";
        List<String> groupofString = Arrays.asList("Abhijit", "Joshi", "alskwih", "hsdfr", "lkjhg", "lkcod");
        List<Integer> k = Arrays.asList(3, 3, 4, 5, 6, 7, 3, 2, 2, 3, 4, 5, 6, 7, 78, 8, 8, 88, 90);
        List<String> q6 = Arrays.asList("Abhijit", "Joshi", "ZWES", "rtyuio");
        List<Integer> q7 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 9);

        // Q1
        Optional<Integer> c = abc.stream().sorted((a, b) -> b - a).distinct().skip(1).findFirst();
        System.out.println(c.get());

        Optional<Integer> d = Arrays.stream(arr).mapToObj(a -> a).sorted((a, b) -> b - a).skip(1).findFirst();
        System.out.println(d.get());


        // Q2
        Optional<Character> firstStringnumber = stringABC.chars()
                .mapToObj(a -> (char) a)
                .map(a -> Character.toUpperCase(a))
                //.collect(Collectors.toMap(k->k,v->1,(a,b)->a+b,LinkedHashMap::new)
                .collect(Collectors.groupingBy(a -> a, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(a -> a.getValue() == 1)
                .map(a -> a.getKey())
                .findFirst();
        System.out.println(firstStringnumber.get());


        // Q3

        Map<Integer, List<String>> Groupbylenght = groupofString.stream()
                .collect(Collectors.groupingBy(a -> a.length()));
        //.collect(Collectors.toMap(k->k,v->v.length()));
        System.out.println(Groupbylenght);


        // Q4

        Optional<Integer> m = k.stream()
                .collect(Collectors.toMap(p -> p, v -> 1, (a, b) -> a + b, LinkedHashMap::new)) // by using linked hashmap order is maintained
                .entrySet()
                .stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .map(a -> a.getKey())
                .findFirst();

        System.out.println(m.get());


        // Q5

        List<Integer> das = abc.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(das);

        // Q6
        List<String> huy = q6.stream()
                .map(a -> a.chars().mapToObj(h -> String.valueOf((char) h))
                        .reduce("", (p, b) -> b + p))
                .collect(Collectors.toList());
        System.out.println(huy);


        // Q7
        List<Integer> listofIntegers = q7.stream()
                .collect(Collectors.toMap(a -> a, v -> 1, (w, t) -> w + t))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(a -> a.getKey())
                .collect(Collectors.toList());
        System.out.println(listofIntegers);


    }
}
