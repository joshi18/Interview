package DSA.Strings;

public class CheckPalindrome {
    public static void main(String[] args) {
        String s= "abcddcba";
        int i =0;
        int j = s.length()-1;
        boolean flag = true;
        while(i<=j){
            if (s.charAt(i)==s.charAt(j)){
                i+=1;
                j-=1;
            }
            else {
                flag = false;
                break;
            }
        }
        System.out.println("String is palimdome or not "+flag);
    }
}
