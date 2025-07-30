package DSA.Recursion;

public class palindronmcheck {

    public static void main(String args[]){
        String abc = "abcbaaaa";
        int i = 0;
        int j = abc.length();
        System.out.println(checkpalindome(abc,i,j-1));

    }

    public static boolean checkpalindome(String a,int i,int j){
        if (j==0){
            return true;
        }
        if (i==j){
            return a.charAt(i) == a.charAt(j);
        }

        return a.charAt(i)== a.charAt(j) && checkpalindome(a,i+1,j-1);



    }
}
