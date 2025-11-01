package src.List;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithKUniqueCharacters {
    public static void main(String[] args) {
       String s = "aabacbebebe";
        int k = 3;
        int n = s.length();
        int longest = Integer.MIN_VALUE;
        int left = 0;
        HashMap<Character,Integer> abc = new HashMap<>();
        for (int right=0;right<n;right++){
             char b =s.charAt(right);
             abc.put(b,abc.getOrDefault(b,0)+1);
             while (abc.size()>k){
                 char op = s.charAt(left);
                 abc.put(op,abc.get(op)-1);
                 if (abc.get(op)==0) {
                     abc.remove(s.charAt(left));
                 }
                 left+=1;
             }
            if(abc.size()==k){
                longest=Math.max(longest,right-left+1);
            }

        }

        System.out.println(longest);

//        for (int right=0;right<n;right++){
//            abc.add(s.charAt(right));
//            for ( left = right+1;left<n;left++){
//                abc.containsKey(s.charAt(left))
//
//            }
//        }
    }
}
