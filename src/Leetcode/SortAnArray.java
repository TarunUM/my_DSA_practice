package Leetcode;

import java.util.Arrays;

// 912 - https://leetcode.com/problems/sort-an-array/
public class SortAnArray {
    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6,7,0,1,2};
        int[] ans = sortArray(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] sortArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        return mergesort(nums);
    }

    public static int[] mergesort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] arr = new int[left.length + right.length];
        int start = 0;
        int end = 0;
        int pointer = 0;
        while (start < left.length && end < right.length) {
            if(left[start] < right[end]) {
                arr[pointer] = left[start++];
            } else {
                arr[pointer] = right[end++];
            }
            pointer++;
        }
        while(start < left.length) {
            arr[pointer++] = left[start++];
        }

        while(end < right.length) {
            arr[pointer++] = right[end++];
        }

        return arr;
    }

}
