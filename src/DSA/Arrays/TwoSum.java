package DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        //List<Integer> abc = new ArrayList<>();
        // ITS O(n2)
        List<Integer> abc = Arrays.asList(8, 0, 20, 10, 20, 44, 34, 9);
        int targetSum = 17;
//        for (int i=0;i<abc.size();i++){
//            for (int j = i+1;j<abc.size();j++){
//                 if (abc.get(i)+abc.get(j) == targetSum){
//                     System.out.println(i+","+j);
//                     break;
//                 }
//            }
//        }

        HashMap<Integer, Integer> abcd = new HashMap<>();
        for (int i = 0; i < abc.size(); i++) {
            int complemnt = targetSum - abc.get(i);
            if (abcd.containsKey(complemnt)) {
                System.out.println(abcd.get(complemnt) + ", " + i);
                break;
            }
            abcd.put(abc.get(i), i);
        }

        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        int target = 11;
        //int left = 0;
        // int right = nums.length-1;
//        if(nums.length==1 && nums[0]==target){
//            return 0;
//        }
//        if(nums.length == 0){
//            return 0;
//        }
        int left = 0;
        int n = nums.length;
        int sum1 = nums[0];
        int sum2 = nums[0];
        int minimumLength = Integer.MAX_VALUE;
        for (int right = 1; right < n; right++) {
            sum1 += nums[right];
            sum2 += nums[right];
            while (sum1 > target) {
                if (sum1 > target) {
                    left += 1;
                    sum1 -= nums[left];
                }
            }
            minimumLength = Math.min(minimumLength, right - left + 1);
        }
        if (sum2 < target) {
            System.out.println(0);
        } else {
            System.out.println(minimumLength);
        }

//        1 Implement a login and signup flow using React, node Js and MongoDB
//
//        2. Implement server side Pagination in a fullstack application.
//
//        create a REST API with authentication using spring boot
//
//        create a react component that fetch and display data from API using useEffects.
//
//                Implement a simple todo list app with add, edit and delete funcationality
//
//        create a react app that uses context Api to manage a theme(light/dark)


        String s = "axc";
        String t = "ahbgdc";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int flag = 0;
            for (int j = i; j < t.length(); j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                count += 1;
            }
        }
        if (count == s.length()) {
            System.out.println(true);
        } else {
            System.out.println(false);


        }
    }
}
