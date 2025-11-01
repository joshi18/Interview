package src.List;

public class MaximumSubarray {
    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int n= nums.length;
        int Maxsum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum1 = nums[i];
            for(int j=i+1;j<n;j++){
                 sum1 = sum1+nums[j];
                Maxsum = Math.max(Maxsum,sum1);
            }
        }
        System.out.println(Maxsum);
    }
}
