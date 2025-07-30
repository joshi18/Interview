package DSA.Recursion;

public class sumofNaturalNumbers {


    public static void main (String args[]){

        int n = 20;
        System.out.println(sumofNNatturalnumbers(n));
    }
    public static int sumofNNatturalnumbers(int n){
        if (n==0){
            return 0;
        }
        return n+sumofNNatturalnumbers(n-1);

    }
}
