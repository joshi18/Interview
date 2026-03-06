package src.DSA.InterviewPractise;

import java.util.HashSet;

public class PractiseQustions {
    public static void main(String[] args) {

        // SUBARRAY With MAXIMUM SUM
        // NATIVE Approach O(n2)
        int[] arr = {7, 8, -3, 9, -10, 4, 9};
        int sum = 0;
//        int Maxi = Integer.MIN_VALUE;
//        // Find the maximum sum from the subarray given
//
//        for (int i = 0; i < arr.length; i++) {
//            sum = arr[i];
//            if (sum > Maxi) {
//                Maxi = sum;
//            }
//            for (int j = i + 1; j < arr.length; j++) {
//                sum = sum + arr[j];
//                if (sum > Maxi) {
//                    Maxi = sum;
//                }
//            }
//        }
//        System.out.println(Maxi);


        // KADANES Algorithm

//        int CurrentSum = arr[0];
//        int MaxSum = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            CurrentSum = Math.max(arr[i], CurrentSum + arr[i]);
//            MaxSum = Math.max(MaxSum, CurrentSum);
//        }
//        System.out.println(MaxSum);


        // Maximum Subaaray with sum K

        int[] nums = {1, 1, 1};
        int k = 2;
        int count = 0;
        int sum1 = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum1 = nums[i];
//            if (sum1 == k) {
//                count += 1;
//            }
//            for (int j = i + 1; j < nums.length; j++) {
//                sum1 += nums[j];
//                if (sum1 == k) {
//                    count += 1;
//                }
//
//
//            }
//        }
//        System.out.println(count);

        /// Optimised Version : Prefix sum . Add the elements in the currSum and check (currSum - k) this value is persent the map. If present add the value to the count.


//        Map<Integer, Integer> abc = new HashMap<>();
//        abc.put(0, 1);
//        int currSum = 0;
//        int count1 = 0;
//        for (int i = 0; i < nums.length; i++) {
//            currSum += arr[i];
//            if (abc.containsKey(currSum - k)) {
//                count1 += abc.get(currSum - k);
//            }
//            abc.put(currSum, abc.getOrDefault(currSum, 0) + 1);
//        }
//        System.out.println(count1);


        /// This problem can be sloved using sliding window pattern also . but for this there should not be negative numbers

//        int[] nums2 = {1, 2, 1, 0, 1, 3};
//        int sum2 = arr[0];
//        int k2 = 3;
//        int left = 0;
//        int count2 = 0;
//        for (int right = 1; right < nums2.length; right++) {
//            sum2 += arr[right];
//            while (sum2 > k2 && left < right) {
//                sum2 -= arr[k2];
//                left -= 1;
//            }
//            if (sum2 == k) count2 += 1;
//        }
//        System.out.println(count2);

        /// 2461 . Maximum sum of subarray with size k
        /// SLIDING WINDOW PATTERN WITH FIX SIZE K
        ///  Maximum sum of fixed size k

//        int[] nums3 = {1, 5, 4, 2, 9, 9, 9};
//        int k3 = 3;
//        int Maxi = Integer.MIN_VALUE;
//        int currSum = 0;
//        int left = 0;
//        for (int right = 0; right < nums3.length; right++) {
//            currSum += nums3[right];
//            if (right - left + 1 == k3) {
//                Maxi = Math.max(currSum, Maxi);
//                currSum -= nums3[left];
//                left += 1;
//            }
//
//
//        }
//        System.out.println(Maxi);

//        String s = "abcabcabc";
//        String p = "ab";
//        List<Integer> abc = new ArrayList<>();
//        int[] freq1 = new int[26]; // p sathi
//        int[] freq2 = new int[26]; // S sathi
//        if (p.length() > s.length()) System.out.println(abc);
//        ;
//
//        for (int i = 0; i < p.length(); i++) {
//            freq1[p.charAt(i) - 'a']++;
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            freq2[s.charAt(i) - 'a']++;
//            if (i >= p.length()) {
//                freq2[s.charAt(i - p.length()) - 'a']--;
//            }
//            if (Arrays.equals(freq2, freq1)) {
//                abc.add(i - p.length() + 1);
//            }
//        }
//        System.out.println(abc);
//
//        int count4 = 0;
//        String s = "abcbabc";
//        int[] freq = new int[26];
//        for (int i = 0; i < 3; i++) {
//            freq[s.charAt(i) - 'a']++;
//        }
//        count4 = check(freq, count4);
//        for (int i = 3; i < s.length(); i++) {
//            freq[s.charAt(i) - 'a']++;
//            freq[s.charAt(i - 3) - 'a']--;
//            check(freq, count4);
//        }
//        ret count4;


        ///  Variable size window
        ///  Maximum length of substring without repeating characters
//        String s = "abghftabghft";
//        int left = 0;
//        HashSet<Character> abc = new HashSet<>();
//        int MaxLen = 0;
//        for (int right = 0; right < s.length(); right++) {
//
//            while (abc.contains(s.charAt(right))) {
//                abc.remove(s.charAt(left));
//                left += 1;
//            }
//
//            abc.add(s.charAt(right));
//            MaxLen = Math.max(MaxLen, right - left + 1);
//
//        }
//        System.out.println(MaxLen);

        String s = "abcabc";

        int Maxi = 0;
        int count5 = 0;
        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> abcd = new HashSet<>();
            abcd.add(s.charAt(i));
            // count5 += 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (!abcd.contains(s.charAt(j))) {
                    abcd.add(s.charAt(j));
                    //count5 += 1;
                    Maxi = Math.max(j - i + 1, Maxi);
                } else {
                    //count5 = 0;
                    break;
                }
            }

        }
        System.out.println(Maxi);


    }

    public static int check(int[] freq, int count) {
        int elementCount = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1) {
                elementCount += 1;
            }
        }
        if (elementCount == 3) {
            count += 1;
        }
        return count;

    }
}
