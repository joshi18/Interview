package streamapi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicToAdvancedStreamApi {
    public static void main(String[] args) {

        // Intermediate operations in java

        //Map()  => Takes one input and returns on output . It returns the calculated values
        // FlatMap() =>  Takes one input and returns on output same like  map but it returns the stream<Integer> etc. It  takes only one input.Only a function
        // filter() => predicate condition based (true or false)
        // distinct () => Removes duplicate. No input and return the Steam api. where we can  use again intermediate operations.
        // limit() => Truncates the stream .limit(5) => means only first 5 elements are printed. Returns a stream consisting of the remaining elements of this stream after discarding the first n elements of the stream. If this stream contains fewer than n elements then an empty stream will be returned.
        // skip() => Skip first n elements.
        // sorted() =>  sorts  in natural order
        // sorted((a,b)=>a-b) => sorts the elements in custom order. Takes input as comparator. Comparator's compare methods is executed which takes  two  arguments.
        // peek() => return void. Takes one input but returns void. It can be only use dfor debugging and logging purposes.
        // mapToObj() => takens function as input. return stream .Converts primitives (IntStream, LongStream, DoubleStream) back to objects.


        // Intstream =>  It is for primitive datatype (int). methods which we can use are sum(),average(),range(),rangeClosed() etc . these can not be used with on stream.
        // Steam => Generic it holds the object<T>. It has map(),filter() these are different methods.

        //mapToInt() => It takes input as a function .it return Intstream.
        //chars() => returns Intstream. Does not take any input
        // mapToLong() => same like mapToInt(). it returns Intstream.


        // Terminal operations
        //collect() => takes Collectors input and returns lisy/set/map.
        //Collectors.toMap()  => keyMapper(Function),valueMapper(Function),mergeFunction,Map factory
        // Collectors.groupingBy() => classifier(Function), Map factory,downstream collector(Again collector)
        // forEach() => Takes Consumer as input.
        // findFirst() => finds  first element from the List
        // sum() => It applicable only on IntStream
        //reduce() =>   It takes the binary operator as input. Gives a single value.  reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner)


        List<Integer> okBye = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> listOfevenNumbers = okBye.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(listOfevenNumbers);


        List<List<Integer>> listoflistIntegers = Arrays.asList(Arrays.asList(1, 2, 3, 4), Arrays.asList(9, 7, 0, 35), Arrays.asList(2, 9, 10, 3000));
        List<Integer> ListOfintegres = listoflistIntegers.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println(ListOfintegres);

//        listoflistIntegers.stream().distinct()
        List<Integer> n = okBye.stream().limit(5).collect(Collectors.toList());
        System.out.println(n);
        //okBye.stream().peek(a-> System.out.println(a)).collect(Collectors.toList());


        // Find the non repeating charters in a String . this is using by grouping by terminal operator
        String abc = "AAbbccfgghj";
        Map<Character, Long> map = abc.chars().mapToObj(a -> (char) a)
                .map(a -> Character.toUpperCase(a))
                .collect(Collectors.groupingBy(a -> a, LinkedHashMap::new, Collectors.counting()));
        System.out.println(map);
        Optional<Character> findtheFirstelement = map.entrySet().stream().filter(a -> a.getValue() == 1).map(a -> a.getKey()).findFirst();
        System.out.println(findtheFirstelement.get());

        // using to toMap()
        Optional<Character> nok = abc.chars()
                .mapToObj(a -> (char) a)
                .map(a -> Character.toUpperCase(a))
                .collect(Collectors.toMap(a -> a, a -> 1, (c, d) -> c + d, LinkedHashMap::new))
                .entrySet()
                .stream()
                .filter(a -> a.getValue() == 1)
                .map(a -> a.getKey())
                .findFirst();
        System.out.println(nok.get());


        // without both

        Optional<Character> firstNonRepeating = abc.chars()
                .mapToObj(c -> Character.toUpperCase((char) c))
                .filter(ch -> abc.toUpperCase().indexOf(ch) == abc.toUpperCase().lastIndexOf(ch))
                .findFirst();

        System.out.println(firstNonRepeating.orElse(null));


        // sum of numbers
        List<Integer> lp = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> abcd = lp.stream().reduce((a, b) -> a + b);
        int abcde = lp.stream().reduce(0, (a, b) -> a + b);
        System.out.println(abcde);

        // Sum of Length of Strings
        List<String> opi = Arrays.asList("Abhijit", "Joshi");
        int sumofStrinfs = opi.stream().reduce(0, (a, b) -> a + b.length(), (v, b) -> v + b);
        // First one is default value , addition of default value + lenght of first string, combiner where adding the sum of elementes
        System.out.println(sumofStrinfs);

        //opi.stream().map(a->a.length()).reduce(0,(a,b)->a+b);
        //without using reduce

        Integer k = opi.stream().mapToInt(a -> a.length()).sum();
        System.out.println(k);


    }
}
