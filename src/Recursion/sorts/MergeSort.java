package Recursion.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6,6,5,5,4,4,3,3,2,2,1,1};
        int[] ans= mergeSort(arr);
        System.out.println("New array = "+Arrays.toString(ans));

        // The main array will remain same because we are creating & returning the new arrays
        System.out.println("old array = "+Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr){
        if(arr.length ==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int i=0; // for the left array
        int j=0; // for the right array
        int k=0; // for the merged array
        while(i< left.length && j< right.length){
            if(left[i]<right[j]){
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++; // keep on moving forward in the mixed array
        }

        // For copying remaining Elements in either arrays
        // only one loop will be executed
        while(i < left.length){
            mix[k] = left[i];
            i++;
            k++; // keep on moving forward in the mixed array
        }
        while(j < right.length){
            mix[k] = right[j];
            j++;
            k++; // keep on moving forward in the mixed array
        }
        return mix;
    }
}
