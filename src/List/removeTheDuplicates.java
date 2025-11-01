package src.List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class removeTheDuplicates {

    public static void main(String[] args) {

//        List<Integer> abc = Arrays.asList(1,2,3,1,1,1,2,3,3,4,5,6,7,8,9,0);
//
//        int slow = 0;
//        int fast = 1;
//        int n = abc.size();
//        while(fast <n){
//            if (abc.get(slow) == abc.get(fast)){
//               abc.remove(fast);
//                fast+=1;
//
//            }
//            else {
//                slow+=1;
//                fast+=1;
//            }
//        }
//        System.out.println(abc);

        int[] nums = {1,1,2,2,3};
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];   // k++ => first assign the value then increment.// nums[k] = nums[i]; k+=1;

            }
        }

        System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));




        String abc = "HELLO";

        System.out.println(abc.chars().mapToObj(a->String.valueOf(a)).map(String::toLowerCase).collect(Collectors.joining()));


        //System.out.println(abc.toLowerCase());

        List<String> frits = Arrays.asList("Apple","Coconut");
        Stream<String> streamFrits = frits.stream().map(a->a.toLowerCase());



        //.forEach(a-> System.out.println(a));





















        String hjk = "AbhijitJoshi";

        System.out.println(hjk.chars().mapToObj(a->String.valueOf((char)a)).map(p->p.toLowerCase()).collect(Collectors.groupingBy(j->j,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(l->l.getValue()==1)
                        .map(f->f.getKey())
                .collect(Collectors.toList()));





    }
}
