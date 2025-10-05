package src.DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoveZeroToOneEnd {
    public static void main(String[] args) {



        int [] arr = {1,2,0,3,0,0,4,20,40,2,0,2,0};
        intheOneGo(arr);
//        int index = 0;
//        for (int i=0 ; i<arr.length;i++){
//            if (arr[i] != 0){
//                arr[index] = arr[i];
//                index+=1;
//            }
//        }
//        while (index< arr.length){
//            arr[index] = 0;
//            index+=1;
//        }

    }
    public static  void intheOneGo(int [] arr){

        int lastnonzeroElement = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[lastnonzeroElement];
                arr [lastnonzeroElement] = temp;
                lastnonzeroElement+=1;
            }
        }
        for (int num:arr){
            System.out.println(num);
        }


    }
}
