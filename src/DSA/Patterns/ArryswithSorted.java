package DSA.Patterns;

public class ArryswithSorted {
    // find the element in the rotated sorted array.
    public static void main(String args[]){
        int [] arr = {4,5,6,1,2,3};
        int p = arr.length;
        int elementtofind = 2;
        int povoitindex = getpivoteelement(arr,0,5);
        if(povoitindex!=-1){
            int foundcheck = binaryserch(arr,0,povoitindex,elementtofind);
            //System.out.println(foundcheck);
            if(foundcheck==-1){
                System.out.println(binaryserch(arr,povoitindex+1,p-1,elementtofind));

            }

        }



    }

    public static int getpivoteelement(int arr[], int l, int r){

        while(l<=r){
            int mid = (l+r)/2;
            if (arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]>arr[mid-1]){
                return mid-1;
            } else if (arr[mid]<arr[mid-1]) {
                l= mid+1;

            }
            else {
                r=mid-1;
            }
        }
        return -1;

    }

    public static int binaryserch(int [] arr,int i,int j,int p){

        while(i<=j){
            int mid = (i+j)/2;
            if (arr[mid]>p){
                j = mid-1;
            } else if (arr[mid]<p) {
                i = mid+1;

            }
            else {
                return mid;
            }
        }
        return -1;

    }
}
