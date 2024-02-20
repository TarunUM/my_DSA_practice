package Recursion.sorts;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        int[] arr = {6,6,5,5,4,4,3,3,2,2,1,1};

        System.out.print("arr2 == ");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();

// BUBBLE SORT (keep on checking if the current element is greater that next number "After first iteration the max number will be at the last index")
        bubble(arr, arr.length-1,0);
        System.out.println("After Sorting using Bubble Sort    = "+Arrays.toString(arr));

// SELECTION SORT (In given range find max Number and put it at the last index)
//        selection(arr, arr.length, 0, arr[0]);
//        System.out.println("After Sorting using Selection Sort = "+Arrays.toString(arr));
    }

    static void bubble(int[] arr, int row, int col){
        if(row == 0){
            return ;
        }
        if(col < row){
            if(arr[col]>arr[col+1]){
                swap(arr,col,col+1);
            }
            bubble(arr,row,col+1);
        }
        else{
            bubble(arr,row-1,0);
        }
    }


//    max is index of maximun element in an arrays
    static void selection(int[] arr, int row, int col, int max){
        if(row == 0){
            return ;
        }
        if(col < row) {
            if (arr[col] > arr[max]) {
                selection(arr, row, col + 1, col);
            } else {
                selection(arr, row, col + 1, max);
            }
        } else{
            swap(arr,row-1,max);
            selection(arr,row-1,0,0);
        }
    }

//    to swap two numbers in array with given indexes
    static void swap(int[] arr, int num1, int num2){
        int temp = arr[num2];
        arr[num2] = arr[num1];
        arr[num1] = temp;
    }
}
