package DSA.Arrays;

import java.util.Arrays;
import java.util.List;

public class TapWaterProblem {

    public static void main(String[] args) {
        List<Integer>  arr =Arrays.asList(1,8,6,2,5,4,8,3,7);
        int n= arr.size();
       // int min = -1;
        int maximumuWter = -1;
        for (int i=0;i<n;i++){
            int tappedWater = 0 ;
            for (int j=i+1;j<n;j++){
                int minimumOfNumbers = Math.min(arr.get(i),arr.get(j)*(j-i));
                tappedWater+=minimumOfNumbers;
            }
            maximumuWter =Math.max(maximumuWter,tappedWater);

        }
        System.out.println(maximumuWter);

    }
}
