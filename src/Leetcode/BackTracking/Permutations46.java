package Leetcode.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations46 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = permute(nums);
        System.out.println(ans);
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> p = new ArrayList<>();
        List<Integer> up = new ArrayList<>();
        for (int number: nums) {
            up.add(number);
        }
        System.out.println(up);
        ans = permuteList(p, up);
        return ans;
    }

//        p=Processed and up = unProcessed
    public static List<List<Integer>> permuteList(List<Integer> p , List<Integer> up){
        if (up.isEmpty()){
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        List<List<Integer>> list = new ArrayList<>();

        int firstEle = up.get(0);
        int size = p.size();

        for (int i = 0; i <= size; i++) {
            List<Integer> left = p.subList(0,i);
            List<Integer> right = p.subList(i,size);
//            new p
            List<Integer> newP = new ArrayList<>(left);
            newP.add(firstEle);
            newP.addAll(right);
            list.addAll(permuteList(newP, up.subList(1, up.size())));
        }
        return list;
    }


}
