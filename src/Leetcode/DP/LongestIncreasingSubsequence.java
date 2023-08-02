package Leetcode.DP;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3};
        System.out.println(lengthOfLIS(arr));
    }

    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            dp[i] = 1;
        }
        for(int i=nums.length-1; i>=0; i--){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] < nums[j]){
                    dp[i] = Math.max(dp[i],1+dp[j]);
                }
            }
        }
        int max = dp[0];
        for(int i : dp){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
}
