package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,22,33,44,54,69,76,85,94,103};
        System.out.println(binaryserachfunc(arr,0,arr.length,54));
    }

    static int binaryserachfunc(int[] arr, int low,int high, int target){
        if(low > high){
            return -1;
        }
        int mid = low + (high-low) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] < target){
            return binaryserachfunc(arr, mid+1, high, target);
        }
        return binaryserachfunc(arr, low, mid-1, target);
    }
}
