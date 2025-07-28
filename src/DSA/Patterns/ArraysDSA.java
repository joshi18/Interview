package DSA.Patterns;

import java.util.ArrayList;
import java.util.List;

public class ArraysDSA {


    public static void main(String args[]){
       // System.out.println(binaryserch(90));  Time complexity = log n (if sorted array is given) if not then it is (n log n)
        leftshiftthearray(3);
    }
    public static int  binaryserch(int p) {
        List<Integer> abc = new ArrayList<>();
        abc.add(10);
        abc.add(20);
        abc.add(90);
        abc.add(11);
        abc.add(32);
        abc.sort((a, b) -> a - b);
        int t = abc.size();
        int index = -1;
        int l=0;
        while (l <= t) {
            int middle = (l+t)/2;
            if (abc.get(middle) > p) {
                 t=middle-1;
            } else if (abc.get(middle) < p) {
                l=middle+1;

            } else {
                index=  middle;
                break;
            }
        }
        return index;
    }

    public static void leftshiftthearray(int p){
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
       int n =  arr.length;
        for(int i=0;i<n+p;i++){
            if (i>n){
                arr[i-n] = arr[i-n];
            }
            else {
            arr[i]= arr[i+p];}

        }
        System.out.println(arr);

     }





}
