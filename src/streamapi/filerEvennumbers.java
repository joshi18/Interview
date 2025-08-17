package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class filerEvennumbers {

    public void getnumbersList() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] + 1;
        }
        System.out.println(arr);
    }

    public void getListOfIntegers() {
        List<Integer> abc = new ArrayList<>();
        abc.add(1);
        abc.add(2);
        abc.add(3);
        abc.add(2);
        abc.add(4);
        //System.out.println(abc);
        List<Integer> evenNumbers = abc.stream().filter(x -> x % 2 == 0).distinct().collect(Collectors.toList());
        System.out.println(evenNumbers);
    }

    public void getListtOfOddnumbers() {
        List<Integer> abc = new ArrayList<>();
        abc.add(1);
        abc.add(2);
        abc.add(10);
        abc.add(17);
        abc.add(20);

        List<Integer> listOfOddNumbers = abc.stream().filter(x -> x % 2 != 0).distinct().collect(Collectors.toList());
        System.out.println(listOfOddNumbers);
    }
}