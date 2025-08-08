package streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class FindTheFirstOccurance {

    public static void main(String[] args) {
        getfirstoccuranceofcharacter();
        sampleUseofPartionBy();
    }

    public static void  getfirstoccuranceofcharacter(){
        String s = "Abhijit Here";
        List<Integer> abc = Arrays.asList(1,2,34,5,6,7,8,90,88,34);
         Map<Boolean,List<Integer>> p =abc.stream().collect(Collectors.groupingBy(x->x%2==0));
        System.out.println(p.get(true));
        System.out.println(p);
        // Group by function in java return map of <T><String,Integer>  or other various types
        // Group by takes on classifer function as input(1 st parameter) => classifier → A function that maps each stream element to a key (how you want to group).
        // 2nd parameter as mapfactory MEANS => mapFactory → Which Map implementation to use (e.g., LinkedHashMap, TreeMap).
        // 3RD Parameter => downstream → What to do with the elements in each group (e.g., collect into list, count, sum).



        Map<String ,Long> k =  abc.stream().collect(Collectors.groupingBy(x->(x%2 == 0) ? "EVEN":"ODD",Collectors.counting()));
        System.out.println(k);// here ternary operator and downstream collector is used. (Counting)

        Map<Boolean, Long> cv  = abc.stream().collect(Collectors.groupingBy(x->x.equals(x),Collectors.counting()));
        System.out.println(cv);

        // MAIN CODE

        String pa = "Abhijit Joshi Ab";
         Map<Character, Long> mapof = pa.chars()
                .mapToObj(c->Character.toLowerCase((char) c)) // coverts to lowercase
                .filter(Character::isLetter)
                .collect(Collectors.groupingBy(x->x, LinkedHashMap::new,Collectors.counting()));
        System.out.println(mapof);
         Character  Firstono = mapof.entrySet().stream().filter(a->a.getValue() == 1)
                 .map(i->i.getKey())
                 .findFirst()
                 .orElseThrow(null);

        System.out.println(Firstono);

    }

    public static void sampleUseofPartionBy(){
        List<Integer> k = Arrays.asList(1,2,3,4,5,6,7,8,9,0,9,8,7,7,77777,24,900);
       Map<Boolean,List<Integer>> ho = k.stream().collect(Collectors.partitioningBy(x->x%2==0,Collectors.toList()));
        System.out.println(ho);// partionBy first it takes predicated and 2 nd doswnstream collector. And return the map
    }
}
