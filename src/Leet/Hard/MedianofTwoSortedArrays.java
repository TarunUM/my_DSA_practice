package Leet.Hard;

import java.util.Arrays;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = new int[]{3};
        int[] b = new int[]{-2,-1};
        System.out.println(findMedianSortedArrays(a, b));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0, j=0 , k = 0;
        int[] newArray = new int[nums1.length + nums2.length];
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]) {
                newArray[k++] = nums1[i++];
            } else if(nums1[i] >= nums2[j]) {
                newArray[k++] = nums2[j++];
            }
        }
        while(i < nums1.length){
            newArray[k++] = nums1[i++];
        }
        while(j < nums2.length){
            newArray[k++] = nums2[j++];
        }
        int mid = newArray.length / 2;
        if(newArray.length % 2 == 0){
            return ((double) newArray[mid]  + (double) newArray[mid-1]) / 2;
        }
        return newArray[mid];
    }
}
