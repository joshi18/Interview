package src.DSA.DP;

import java.util.HashMap;
import java.util.Map;

public class DP52EveluateBooleanExpressionToTrue {
    public static void main(String[] args) {
        String s = "abcdabc";
//        Map<Character,Integer>  map = new HashMap<>();
//
//        for (int i=0;i<s.length();i++){
//            if (map.containsKey(s.charAt(i))){
//                map.put(s.charAt(i),map.get(s.charAt(i))+1);
//            }
//            else {
//                map.put(s.charAt(i),1);
//            }
//        }
//        int p = map.size();
//        int n = s.length();
//        for (int k=0;k<map.size();k++){
//            if ( != 0){
//                System.out.println("False");
//            }
//        }
//        System.out.println("True");
//    }

        int slow = 0;
        int fast = 1;
        int stringLength = 0;
        while (fast < s.length()) {
            if (s.charAt(slow) != s.charAt(fast)) {
                fast += 1;
            } else if (s.charAt(slow) == s.charAt(fast)) {
                slow += 1;
                fast += 1;

            }
        }
        //System.out.println(stringLength);
//        if (s.length() % stringLength == 0) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }
    }
}
