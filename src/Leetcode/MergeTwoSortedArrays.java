package Leetcode;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = new int[]{4,0,0,0,0,0};
        int[] nums2 = new int[]{1,2,3,5,6};
        merge(nums1,1,nums2,5);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        int last = m+n+1 ;
        while(m>=0 && n>=0){
            if(nums1[m] > nums2[n]){
                nums1[last] = nums1[m];
                m--;
            } else {
                nums1[last] = nums2[n];
                n--;
            }
            last--;
        }

        while(n>=0){
            nums1[last]=nums2[n];
            n--;
            last--;
        }
    }
}
