package Leetcode;

//https://leetcode.com/problems/counting-bits/

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }

//    For O(n) time complexity;
    public static int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0] = 0;
        int offset = 1;
        for(int i=1; i<n+1; i++){
            if(offset * 2 == i){
                offset = i;
            }
            ans[i]=1+ans[i-offset];
        }
        return ans;
    }



//    For O(n^2) time complexity;
//    public static int[] countBits(int n) {
//        int arrSize=n+1;
//        int[] ans = new int[arrSize];
//        for(int i =0; i<=n; i++){
////            System.out.println(i);
//            ans[i]=hammingWeight(i);
//            System.out.println(ans[i]);
//        }
//        return ans;
//    }
//
//    public static int hammingWeight(int n) {
//        int count = 0;
//        while(n!=0){
//            count += (n & 1);
//            n = n >>> 1;
//        }
//        return count;
//    }
}
