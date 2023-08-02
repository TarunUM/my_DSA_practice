package Leetcode.subarrays;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum {
    public static void main(String[] args) {
        System.out.println(checkSubarraySum(new int[]{2,4,3},6));
    }

    static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            int r = total % k;
            if (!map.containsKey(r)){
                map.put(r, i);
            } else if(i - map.get(r) > 1) {
                return true;
            }
        }
        return false;


// BootForce = Time Limit Exceeded
//        for (int i = 0; i < nums.length; i++) {
//            int total = 0;
//            for (int j = i; j < nums.length; j++){
//                total += nums[j];
//                if(total % k == 0 && j-i >= 1){
//                    return true;
//                }
//            }
//        }
//        return false;
    }
}
