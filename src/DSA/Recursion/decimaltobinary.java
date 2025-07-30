package DSA.Recursion;

public class decimaltobinary {

    public static void main (String args[]){
        int n = 20;
        System.out.println(converdecimaltobinary(n));
    }
    public static String  converdecimaltobinary(int n){
        if(n==0){
            return "0";
        }
        if (n==1){
            return "1";
        }
        return  converdecimaltobinary(n/2)+ (n%2);
    }
}
