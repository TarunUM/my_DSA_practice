package Recursion.sorts;

import java.util.Arrays;

public class InPlaceMergeSort {

    public static void main(String[] args) {
        int[] arr = {6,6,5,5,4,4,3,3,2,2,1,1};
        mergeSort(arr,0,arr.length);
        System.out.println("New array = "+Arrays.toString(arr));

        // The main array will remain same because we are creating & returning the new arrays
        System.out.println("old array = "+Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int start, int end){
        if(end - start == 1){
            return;
        }
        int mid = (start+end)/2;

        mergeSort(arr,start,mid);
        mergeSort(arr, mid, end);

        inPlacemerge(arr, start , mid ,end);
    }

    private static void inPlacemerge(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];
        int i=start; // for the left array
        int j=mid; // for the right array
        int k=0; // for the merged array
        while(i< mid && j< end){
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++; // keep on moving forward in the mixed array
        }

        // For copying remaining Elements in either arrays
        // only one loop will be executed
        while(i < mid){
            mix[k] = arr[i];
            i++;
            k++; // keep on moving forward in the mixed array
        }
        while(j < end){
            mix[k] = arr[j];
            j++;
            k++; // keep on moving forward in the mixed array
        }

        for (int l = 0; l < mix.length; l++) {
            arr[start+l] = mix[l];
        }
    }
}
