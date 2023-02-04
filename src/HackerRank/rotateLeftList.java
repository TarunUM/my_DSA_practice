package HackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class rotateLeftList {
    public static void main(String[] args) {
        List<Integer> arr2 = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(rotateLeft(4, arr2));
    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
//        1, 2, 3, 4, 5, 6
//        3, 4, 5, 6, 1, 2

//        2, 3, 4, 5, 6, 1
//        4, 5, 6, 1, 2, 3

        Collections.rotate(arr, arr.size()-d);

//        int size = arr.size();
//        for (int i = 0; i<d; i+=1){
//            for (int j =0; j < size - 1 ; j++){
//                Collections.swap(arr, j, j+1);
//            }
//        }

        return arr;
    }
}
