package src.DSA.Arrays;

import java.util.*;

public class findtheNLargestElement {

    public static void main(String[] args) {
        List<Integer> abc = new ArrayList<>();
        abc.add(1);
        abc.add(2);
        abc.add(3);
        abc.add(4);
        abc.add(5);
        abc.add(6);
        int u = 5;
        System.out.println(findtheNLargestElementusingStreamApi(abc, u));
        System.out.println(findtheNLargestElementusingpriorityQueue(abc, u));
    }

    public static int findtheNLargestElementusingStreamApi(List<Integer> listofInteger, int n) {

        Integer v = listofInteger
                .stream().sorted((a, b) -> b - a).skip(n).findFirst().orElse(null);
        return v;


    }

    public static int findtheNLargestElementusingpriorityQueue(List<Integer> kl, int b) throws NullPointerException {
        Set<Integer> unique = new HashSet<>(kl);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(unique);
        int n = priorityQueue.size() - b - 1;
        while (n > 0) {
            n -= 1;
            priorityQueue.poll();

        }
        return priorityQueue.peek();

//        priorityQueue.addAll(kl);
//        System.out.println(priorityQueue);
//       // priorityQueue.
//       // System.out.println(priorityQueue.peek());
//        for(int element: priorityQueue){
//            if(b==0){
//
//                return priorityQueue.peek();
//            }
//            b-=1;
//        }
//        return -1;
    }
}
