package List;

import java.util.HashSet;

public class LongestSubStringwithoutReptingChacters {
    public static void main(String[] args) {
        String s= "abcabcbb";
//        HashSet<Character> abc = new HashSet<>();
//        int LonesstSubstring = Integer.MIN_VALUE;
//        for(int i=0;i<s.length();i++){
//            abc.add(s.charAt(i));
//            int counter = 1;
//            for(int j=i+1;j<s.length();j++){
//                if(abc.add(s.charAt(j))){
//                    abc.add(s.charAt(j));
//                    counter+=1;
//                }
//                else{
//                    break;
//                }
//
//
//            }
//            LonesstSubstring = Math.max(counter,LonesstSubstring);
//        }
//        System.out.println(LonesstSubstring);

        int n = s.length();
        int left = 0;
        HashSet<Character> abc = new HashSet<>();
        int LongestSubstring = Integer.MIN_VALUE;
        for(int right = 0;right<n;right++){
            while(!abc.add(s.charAt(right))){
                abc.remove(s.charAt(left));
                left+=1;
            }
            if(abc.add(s.charAt(right))){
                abc.add(s.charAt(right));
            }
            LongestSubstring = Math.max(LongestSubstring,right-left+1);

        }
        System.out.println(LongestSubstring);

    }
}
