package Recursion.Arrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        int target = 2;
        System.out.println(rotatedBinSearch(arr, target, 0, arr.length-1));
    }

    static int rotatedBinSearch(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = start + (end - start)/2;

        if (arr[mid]==target){
            return mid;
        }

        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target <= arr[mid]){
                return rotatedBinSearch(arr, target, start, mid-1);
            } else {
                return rotatedBinSearch(arr, target, mid+1, end);
            }
        }

        if(target >= arr[mid] && target <= arr[end]){
            return rotatedBinSearch(arr, target, mid+1, end);
        }
        return rotatedBinSearch(arr, target, start, mid-1);
    }
}
