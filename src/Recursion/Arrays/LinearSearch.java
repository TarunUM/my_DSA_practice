package Recursion.Arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {45,2,45,7,5,6,3,45};
        int target = 45;

        System.out.println("Linear Search -  "+LS(arr, target, 0));

        System.out.println("Linear Search Boolean -  "+LSBoolean(arr, target, 0));

        System.out.println("Linear Search Reverse Flow -  "+LSRev(arr, target, arr.length-1));

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Linear Search Multiple Occurance -  "+LSMultipleOccurance(arr,target, list,0));


        System.out.println("Linear Search Multiple Occurance -  "+LSMultipleOccurance2(arr,target, 0));


    }
    static int LS(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return LS(arr,target,index+1);
    }

    static int LSRev(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return LSRev(arr,target,index-1);
    }

    static boolean LSBoolean(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || LSBoolean(arr,target,index+1);
    }

    static ArrayList<Integer> LSMultipleOccurance(int[] arr, int target, ArrayList<Integer> list, int index){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return LSMultipleOccurance(arr, target, list, index+1);
    }


//    This is not a Optimised Solution because it uses 2 lists
    static ArrayList<Integer> LSMultipleOccurance2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        //  This will contain for that function call only
        if(arr[index] == target){
            list.add(index);
        }

        // new ansFromBelowCalls will be created and added into a previous list using addAll method
        ArrayList<Integer> ansFromBelowCalls = LSMultipleOccurance2(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
