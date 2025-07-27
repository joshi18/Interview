import StrategeyDesignPattern.TransportVechicle;
import StrategeyDesignPattern.Vechicle;
import streamapi.OperationsOnEmployee;
import streamapi.employeeStartingA;
import streamapi.filerEvennumbers;
import streamapi.freanquencyOfNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//        filerEvennumbers eventDistictNumbers = new filerEvennumbers();
//        eventDistictNumbers.getListOfIntegers();
//
//        freanquencyOfNumbers frenquencyOfNumbers =  new freanquencyOfNumbers();
//        frenquencyOfNumbers.getFrenquencyOfNumbers();
//
//        eventDistictNumbers.getnumbersList();

//        Vechicle vechicle = new TransportVechicle();
//        vechicle.drive();

//        employeeStartingA namesOfEmployee = new employeeStartingA();
//        List<String> abc = namesOfEmployee.getListOfnamesStratingwithA();
//        System.out.println(abc);

//        OperationsOnEmployee abc = new OperationsOnEmployee();
//        abc.SortontheEmployeeonSalary();

        //Function => work for you
        Function<Integer,Integer> doubleIt =  x->x*2;
        Function<Integer,Integer>  tripleIt = y-> y*3;
        System.out.println(doubleIt.andThen(tripleIt).apply(100)); // first double it get excutec
        System.out.println(doubleIt.compose(tripleIt).apply(200));// first triple it will get executed
        System.out.println(doubleIt.apply(100));
        Function<Integer,Integer>  abc= Function.identity();
        System.out.println(abc.apply(100));


        List<Integer> abcd = Arrays.asList(1,2,3,4,5,6);
//        System.out.println(abcd.stream().map(x->x+1).collect(Collectors.toList()));
//        System.out.println(abcd.stream().mapMulti((a,b)->a+2));
//        System.out.println(abcd.stream().filter(x-> x%2 == 0));
//        System.out.println(abcd.stream().sorted();
//        System.out.println(abcd.stream().distinct());
//        System.out.println(abcd.stream().peek());

//        List<List<String>> listOfLists = Arrays.asList(
//                Arrays.asList("apple", "banana"),
//                Arrays.asList("orange", "kiwi"),
//                Arrays.asList("pear", "grape")
//        );
//        System.out.println(listOfLists.stream().flatMap(x->x.stream().map(String::toUpperCase)).collect(Collectors.toList()));
//        listOfLists.stream().map(x->x.stream().map(y->y.toUpperCase())).forEach(x-> System.out.println(x));
//

        abcd.stream().reduce((x,y)->x+y);
        abcd.stream().forEach(a-> System.out.println(a));
        abcd.stream().findFirst();

        List<String> listofString = Arrays.asList("Abhijit","okBye","nahi");
        System.out.println(listofString.stream().collect(Collectors.groupingBy(x->x.startsWith("A"))));

        List <Integer> abcdf =  Arrays.asList(1,2,3,4,1,2,3,4,5,1,2,3,5);
        System.out.println(abcdf.stream().collect(Collectors.toMap(k->k,v->1,(a,b)->a+b)));
        System.out.println(abcdf.stream().collect(Collectors.groupingBy(x->x,Collectors.counting())));







        //quetions fro  practice
        List<Integer> q1 = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(q1.stream().filter(x->x%2 ==0).toList());

        List<String> q2 = Arrays.asList("abcd","sdfgh","oiuytb");
        System.out.println(q2.stream().map(x->x.toUpperCase()).toList());

        List<String> q3 = Arrays.asList("abcd","fghjkl","abcd","ghjkl","ok");
        System.out.println(q3.stream().collect(Collectors.toMap(k->k,v->1, Integer::sum)));
        System.out.println(q3.stream().collect(Collectors.groupingBy(x->x,Collectors.counting())));

        List<Integer> q4 = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(q4.stream().sorted((a,b)->b-a).toList());

        String q5  = "abcdabcdfdabcd";
        System.out.println(Arrays.stream(q5.split(", ")).toList().stream().collect(Collectors.groupingBy(a->a,Collectors.counting())));
        //System.out.println(Arrays.stream(q5.split(",")).toList().stream().iterator(s->s.));
        //q5.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(c->c)
        List <String>  q6 = Arrays.asList("abcd","abcd","jfhs","ooo");
        System.out.println(q6.stream().distinct().sorted().collect(Collectors.toList()));
        System.out.println(q6.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList()));


        List<String> q7 = Arrays.asList("abcd","qoe","abcd","OkBye");
        System.out.println(q7.stream().sorted().collect(Collectors.toMap(k->k,v->1,(a,b)-> a+b)));

        List<Integer> q8 = Arrays.asList(1,2,3,4,5,6,7,8,1010);
        System.out.println(q8.stream().collect(Collectors.partitioningBy(x->x%2==0)));

        System.out.println(q8.stream().filter(x->x%2==0).map(y->y*y).map(a->a+a).collect(Collectors.toList()));
        System.out.println(q8.stream().filter(x->x%2==0).map(y->y*2).reduce((a,b)->a+b));
    }
}