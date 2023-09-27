package Leetcode;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1,2,1,-4}, 1));
        System.out.println(threeSumClosest(new int[]{1,1,1,1}, 4));
        System.out.println(threeSumClosest(new int[]{0,0,0}, 1));
        System.out.println(threeSumClosest(new int[]{1,1,1,0}, 100));
    }

    public static int threeSumClosest(int[] nums, int target) {
        if (nums.length < 4){
            return nums[0]+nums[1]+nums[2];
        }
        Arrays.sort(nums);
        int ans = nums[0]+nums[1]+nums[2];

        for (int i = 0; i < nums.length-2; i++){
            int l = i+1, r= nums.length-1;
            while (l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if (Math.abs(target-sum) < Math.abs(target-ans)){
                    ans = sum;
                }
                if (target == sum){
                    return target;
                } else if (target > sum){
                    l++;
                } else {
                    r--;
                }
            }
        }

        return ans;
    }
}
