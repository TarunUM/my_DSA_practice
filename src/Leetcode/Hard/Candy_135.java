package Leetcode.Hard;

import java.util.*;

public class Candy_135 {
    public static void main(String[] args) {
        System.out.println(candy(new int[]{1,0,2}));
        System.out.println(candy(new int[]{1,2,1}));
        System.out.println(candy(new int[]{1,2,87,87,87,2,1}));
    }
    public static int candy(int[] ratings) {
        int ans = 0;
        int n = ratings.length;
        int[] arr = new int[n];
        Arrays.fill(arr, 1);

        for(int i = 1; i < n; i++){
            if (ratings[i] > ratings[i-1]){
                arr[i] = arr[i-1] + 1;
            }
        }

        for (int i = n-2; i > -1; i--) {
            if (ratings[i] > ratings[i+1]){
                arr[i] = Math.max(arr[i], arr[i+1] + 1);
            }
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < n; i++) {
            ans += arr[i];
        }

        return ans;
    }
}
