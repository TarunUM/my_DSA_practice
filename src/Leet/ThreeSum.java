package Leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// GOAL -a = b+c //
public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {0,0,0};
//      Output:  [ [-1,-1,2] , [-1,0,1] ]
        List<List<Integer>> ans = threeSum(nums);
        System.out.println(ans);
    }

//    sort input,
//    for each first element, find next two where -a = b+c,
//    if a=prevA, skip a, if b=prevB skip b to elim duplicates;
//    to find b,c use two pointers, left/right on remaining list;
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        // nums = {-4,-1,-1,0,1,2};


        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            int l=i+1, r=len-1;
            int a = nums[i];
            if(i > 0 && a == nums[i-1] ){
                continue;
            } else {
                while(l<r){
                    int threeSum = nums[i]+nums[l]+nums[r];
                    if(threeSum>0){
                        r -=1;
                    } else if(threeSum<0) {
                        l+= 1;
                    } else {
                        List<Integer> subSet = new ArrayList<>();
                        subSet.add(nums[i]);
                        subSet.add(nums[l]);
                        subSet.add(nums[r]);
                        ans.add(subSet);
                        l+= 1;
                        while (nums[l] == nums[l-1] && l<r){
                            l+= 1;
                        }
                    }
                }
            }
        }
        return ans;

    }
}
