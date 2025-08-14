package streamapi;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Top3MostFrequestWords {
    public static void main(String[] args) {
        top3MostFrequestWords();
    }
    public static void top3MostFrequestWords(){
        String s = "apple banana apple orange banana apple mango";
        Map<String,Long> mapof = Arrays.stream(s.split("\\s+"))
                .collect(Collectors.groupingBy(z->z, LinkedHashMap::new,Collectors.counting()));
        System.out.println(mapof);
         List<String> top3words = mapof.entrySet().stream()
                        .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
                .map(a->a.getKey())
                .limit(3)
                .toList();

         
        System.out.println(top3words);
    }
}
