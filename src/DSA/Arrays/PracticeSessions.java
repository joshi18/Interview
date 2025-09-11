package DSA.Arrays;

import java.util.*;
// ONLY 3 SUM PROBLEM VARIATIONS ARE HERE;
public class PracticeSessions {
    public static void main(String[] args) {
        List<Integer> abc = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 19, 15);
        int sum = 19;
        System.out.println(getsum(abc, sum));

        List<Integer> v = Arrays.asList(-1, 0, 1, 2, -1, -4);
        int[] qwe = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(v));
        System.out.println(getTwoSum(v, sum));
        System.out.println(getOptimizedSoluntionfor3SUM(qwe));
    }

    public static boolean getsum(List<Integer> abc, int sum) {
        for (int i = 0; i < abc.size(); i++) {
            for (int j = i + 1; j < abc.size(); j++) {
                if (abc.get(i) + abc.get(j) == sum) {
                    return true;
                }
            }
        }
        return false;

    }

    public static List<List<Integer>> threeSum(List<Integer> op) {
        int n = op.size();
        List<List<Integer>> abc = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    List<Integer> nnn = new ArrayList<>();
                    if (op.get(i) + op.get(j) + op.get(k) == 0) {
                        nnn.add(op.get(i));
                        nnn.add(op.get(j));
                        nnn.add(op.get(k));
                        Collections.sort(nnn);
                        if (!abc.contains(nnn)) {
                            abc.add(nnn);
                        }

                    }

                }
            }
        }
        return abc;


    }

    public static List<List<Integer>> getTwoSum(List<Integer> op1, int sum) {
        int n = op1.size();
        List<List<Integer>> abcd = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            HashSet<Integer> abc = new HashSet<>();
            List<Integer> nop = new ArrayList<>();
            for (int j = i + 1; j < n; j++) {
                int elementInHashSet = op1.get(i) + op1.get(j);
                if (abc.contains(-elementInHashSet)) {
                    nop.add(op1.get(i));
                    nop.add(op1.get(j));
                    nop.add(-elementInHashSet);
                    Collections.sort(nop);

                }
                abc.add(op1.get(j));
                if (!nop.contains(nop)) {
                    abcd.add(nop);
                }

            }
        }
        return abcd;

    }

    public static List<List<Integer>> getOptimizedSoluntionfor3SUM(int[] nums) {
//
//        Set<List<Integer>> abdec =  new HashSet<>();
//        Collections.sort(abc);
//        int n = abc.size();
//        for (int i=0;i<n-2;i++){
//            int left = i+1;
//            int right = n-1;
//            List<Integer> abv = new ArrayList<>();
//            while(left<right){
//                if (abc.get(left)+abc.get(right)+abc.get(i)==0){
//                    abv.add(abc.get(left));
//                    abv.add(abc.get(right));
//                    abv.add(abc.get(i));
//                    Collections.sort(abv);
//                    left+=1;
//                    right-=1;
//                } else if (abc.get(left)+abc.get(right)+abc.get(i) < 0) {
//                    left+=1;
//
//                }
//                else {
//                    right-=1;
//                }
//            }
//            abdec.add(abv);
//
//        }
//        System.out.println(abdec);
//        return abdec;


        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Step 1: Sort the array

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicates for nums[i]

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for left and right
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Need bigger sum
                } else {
                    right--; // Need smaller sum
                }
            }
        }
        return result;
    }



    }
