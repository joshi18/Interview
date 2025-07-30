package DSA.Recursion;

public class print1tonNumbers {


    public static void main(String args[]){
        printnumbers(10);
    }

    public static void printnumbers(int n){
        if (n<=1){
            System.out.println(1);
            return;

        }
        printnumbers(n - 1); ///  for 1 to n numbers.
        System.out.println(n);
        //printnumbers(n - 1); // for n to 1 numbers.

    }
}
