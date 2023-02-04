package HackerRank;

import java.util.*;

public class Hourglasses {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> one = Arrays.asList(1, 1, 1, 0, 0, 0);
        List<Integer> t = Arrays.asList(0, 1, 0, 0, 0, 0);
        List<Integer> th = Arrays.asList(1, 1, 1, 0, 0, 0);
        List<Integer> fr = Arrays.asList(0, 0, 2, 4, 4, 0);
        List<Integer> fi = Arrays.asList(0, 0, 0, 2, 0, 0);
        List<Integer> si = Arrays.asList(0, 0, 1, 2, 4, 0);
        arr.add(one);
        arr.add(t);
        arr.add(th);
        arr.add(fr);
        arr.add(fi);
        arr.add(si);
        System.out.println(hourglassSum(arr));
    }
    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int max = Integer.MIN_VALUE;

        for(int i =0; i< arr.size() - 2; i++){
            int left = 0;
            int sum = 0;

            List<Integer> first = arr.get(i);
            List<Integer> second = arr.get(i+1);
            List<Integer> third = arr.get(i+2);

            while(left < first.size() - 2){
                int right = left+2, mid = left+1;
                sum = first.get(left) + first.get(mid) + first.get(right) + second.get(mid) + third.get(left) + third.get(mid) + third.get(right);

                if(max < sum ){
                    System.out.println(sum + "  " + max);
                    max = sum;
                }

                left++;
            }
        }
        return max;
    }


}
