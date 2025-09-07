package DSA.SortingAlgo;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int [] arr = {1,67,2,3,8,9,53,68,99,1234,7,10};
        int n= arr.length;
        mergeSort(arr,0,n-1);
    }

    public static  void mergeSort(int[] arr , int left ,int right){
        if (left<right){
            int mid = (right+left)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            System.out.println(Arrays.toString(merge(arr, left, mid, right)));
        }

    }
    public static int[] merge(int[] arr ,int left ,int mid,int right ){
        int i = left;
        int j = mid+1;
        int k = 0;
        int [] temp = new int [right-left+1];

        while (i<= mid && j<= right){
            if (arr[i]<arr[j]){
                temp[k] = arr[i];
                k+=1;
                i+=1;
            }
            else {
                temp[k] = arr[j];
                j+=1;
                k+=1;
            }
        }
        while(i<= mid){
            temp[k] = arr[i];
            i+=1;
            k+=1;
        }
        while (j<= right){
            temp[k] = arr[j];
            k+=1;
            j+=1;
        }

        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
        return arr ;

    }
}
