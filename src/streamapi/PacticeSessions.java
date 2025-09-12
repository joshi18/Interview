package streamapi;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class PacticeSessions {

    public static void main(String[] args) {
        String firstNumber = "abcnshdfhsja";
        Character  abc = firstNumber.chars()
                .mapToObj(a->(char)a)
                .map(a->Character.toUpperCase(a))
                //.collect(Collectors.toMap(a->a,v->1,(a,b)->a+b,LinkedHashMap::new))
                .collect(Collectors.groupingBy(a->a, LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(a->a.getValue()==1)
                .map(a->a.getKey())
                .findFirst()
                .orElseThrow(NullPointerException::new);
        System.out.println(abc);






        List<Integer> abcd = Arrays.asList(1,2,3,4,5,6,7,8,9,0);

        System.out.println(
                abcd
                        .stream()
                        .collect(Collectors.partitioningBy(a->a%2==0))
                        .entrySet()
                        .stream()
                        .collect(Collectors.toMap(a->a.getKey()?"even":"odd",c->c.getValue()))
                );


        List<String> newStrings = Arrays.asList("Abhijit","joshi","OkBye");
        System.out.println(
                newStrings
                        .stream()
                        .collect(Collectors.toMap(a->a,v->v.length()))
        );


//        String k = "JoshiSaheb";
//        k
//                .chars()
//                .mapToObj(a->String.valueOf(char)a)
//                .sorted((a,b)->b-a)
//                .reduce("",(a,v)->a+v);

    }
}
