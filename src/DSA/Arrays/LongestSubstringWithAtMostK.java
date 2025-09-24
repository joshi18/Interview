package src.DSA.Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMostK {
    public static void main(String[] args) {
        String av = "aabbccdd";
        int k = 2;
        findLongestSubstringwithMostKdifferentCharacters(av,k);
    }
    public  static void findLongestSubstringwithMostKdifferentCharacters(String av , int k){
        int left = 0;
        int MaxCount = 0;
        Map<Character,Integer> abc = new HashMap<>();
        for(int right=0;right<av.length();right++){
            abc.put(av.charAt(right),abc.getOrDefault(av.charAt(right),0)+1);
            if (abc.size()>k){
                while (abc.size()>k){
                    abc.put(av.charAt(left), abc.get(av.charAt(left))-1);
                    if (abc.get(av.charAt(left))==0){
                        abc.remove(av.charAt(left));
                    }
                    left+=1;

                }


            }
            MaxCount= Math.max(right-left+1,MaxCount);

        }
        System.out.println(MaxCount);

    }
}
