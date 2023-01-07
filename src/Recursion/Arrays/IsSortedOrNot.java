package Recursion.Arrays;

public class IsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,4,5};
        System.out.println(sortChecker(arr,0));
    }

    static boolean sortChecker(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && sortChecker(arr, index+1);
    }
}
