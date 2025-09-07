package List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListabc {

    public static void main(String[] args) {

       // List<Integer> abc  =  new ArrayList();
        ArrayList<Integer> abc = new ArrayList();

        abc.add(1);
        abc.add(2);
        abc.add(5);
        abc.add(1);
        abc.add(null);
        System.out.println(abc);

        abc.add(1,200);
        abc.addLast(300);
        abc.add(null);
        System.out.println(abc);
        Collections.sort(abc); //  while sorting null values are not allowed.
        System.out.println(abc);

//        for(int i=0 ; i < abc.size(); i++){
//            System.out.println(abc.get(i));
//        }



        //ArrayList is a implementation of List Interface. It Allows null and duplicate values. It can have many null values.
        // It is stored in the ordered format.

        // Internal working => Default capacity of the array is 10.
        // If the default capacity is  full. Then array seizing's happens with Multiplication factor of 1.5.
        // It copies the all the elements in the new array then add the new element in the array.
        // Time complexity => O(n).


        // Remove the element

        abc.remove(Integer.valueOf(500));
        System.out.println(abc);

//        List<String> list = Arrays.asList("ABC", "BCD", "WIRMF", "OLAP");
//        System.out.println(list);
//
//        List<Integer> abcd = List.of(1,2,3,4,5,7);
//        abcd.sort((a,b)->b-a);
//        //abcd.remove(3);
//        abcd.add(200);
//        System.out.println(abcd);
//
//        // we can modify Arrays.asList and List.of methods. means we can not remove and add the element.


        // Time Complexity
        //add the element in the array = O(n)  // resizing th earray and (worst case  time)
        // removing the element in the  arraya = O(n)  // resizing and shifting the elemetns


    }
}
