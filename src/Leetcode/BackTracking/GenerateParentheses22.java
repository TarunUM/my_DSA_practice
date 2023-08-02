package Leetcode.BackTracking;


import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/generate-parentheses/
public class GenerateParentheses22 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        backTrackEff(3,3,sb,list);
        System.out.println(list);
    }

    public static List<String> backTrack(String p, int n, int open) {
        if(n == 0){
            List<String> list = new ArrayList<>();
            p = p + ")".repeat(Math.max(0, open));
            list.add(p);
            return list;
        }

        List<String> ans = new ArrayList<>();
        List<String> left = backTrack(p+"(",n-1, open + 1);
        if(open > 0){
            List<String> close = backTrack(p+")",n, open-1);
            ans.addAll(close);
        }

        ans.addAll(left);
        return ans;

    }

    public static void backTrackEff(int open,int close,StringBuilder op,List<String> list) {
        if(open==0 && close==0)
        {
            list.add(op.toString());
            return ;
        }

        if(open!=0)
        {
            // StringBuilder op1=new StringBuilder(op);
            // op1.append('(');
            // solve(open-1,close,op1,list);
            op.append('(');
            backTrackEff(open-1,close,op,list);
            op.deleteCharAt(op.length()-1);
        }

        if(close>open)
        {
            // StringBuilder op2=new StringBuilder(op);
            // op2.append(')');
            // solve(open,close-1,op2,list);
            op.append(')');
            backTrackEff(open,close-1,op,list);
            op.deleteCharAt(op.length()-1);
        }

    }
}
