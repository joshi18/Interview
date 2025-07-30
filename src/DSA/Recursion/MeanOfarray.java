package DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class MeanOfarray {

    public static void main (String args[]){

        List<Integer> abc = new ArrayList<>();
        abc.add(1);
        abc.add(4);
        abc.add(8);
        abc.add(7);
        abc.add(0);
        abc.add(4);
        int n = abc.size();
        System.out.println(getmeanofArray(abc,n-1)/n);
    }
    public  static int getmeanofArray(List<Integer> v, int n){
        if (n==0){
            return v.get(0);
        }
        //int sum = sum+ v.get(n);
        return v.get(n) + getmeanofArray(v, n - 1);


    }
}
