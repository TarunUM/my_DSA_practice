package Recursion.sorts;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {6,6,5,5,4,4,3,3,2,2,1,1};
        System.out.println("Old Array = "+Arrays.toString(arr));
        sort(arr, 0 , arr.length-1);
        System.out.println("New Array = "+Arrays.toString(arr));
    }

    static void sort(int[] numbs, int low, int high) {
        if(high <= low){
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start)/2;
        int pivot = numbs[mid];

        while(start <= end){

            // it will not swap if array is already sorted
            while(numbs[start] < pivot){
                start++;
            }
            while(numbs[end] > pivot){
                end--;
            }

            if(start <= end){
                int temp = numbs[end];
                numbs[end] = numbs[start];
                numbs[start] = temp;
                start++;
                end--;
            }
        }

        sort(numbs, low, end);
        sort(numbs, high, start);
    }
}
