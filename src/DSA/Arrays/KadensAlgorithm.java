package src.DSA.Arrays;

import java.util.Arrays;
import java.util.List;

public class KadensAlgorithm {
    public static void main(String[] args) {
        int maxSum = 0;
        List<Integer> arr = Arrays.asList(2, 3, -8, 7, -1, 2, 3);
        for (int i=0;i<arr.size();i++){
            int sumforInteration = 0;
            for (int j=i+1;j<arr.size();j++){
                sumforInteration+=arr.get(j);
                maxSum =  Math.max(sumforInteration,maxSum);
            }

        }
        System.out.println(maxSum);

        effiecintApproach(arr);
    }
    public static void effiecintApproach(List<Integer> abc){

        int maxTillNow = abc.get(0);
        int result = abc.get(0);
        for (int i=1;i<abc.size();i++){
            maxTillNow =  Math.max(abc.get(i),maxTillNow+ abc.get(i));
             result =Math.max(result,maxTillNow);

        }

        System.out.println(result);



    }
}

