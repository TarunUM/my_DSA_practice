package Recursion.SubSet_SubSequence_String;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        ArrayList<String> ans = permuteList("","abc");
        System.out.println(ans);
//        double ans = 1;
//        for(int i = 10; i > 0; i--) {
//            ans = ans * i;
//        }
//        System.out.println(ans);
        System.out.println(ans.get(1));
    }

//    p=Processed and up = unProcessed
    static void permute(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int size = p.length();
        char ch = up.charAt(0);
        for (int i = 0; i <= size; i++) {
            String left = p.substring(0 , i);
            String right = p.substring(i , size);
            permute(left + ch + right , up.substring(1));
        }
    }

    static ArrayList<String> permuteList(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // local to this call
        ArrayList<String> ans = new ArrayList<>();

        int size = p.length();
        char ch = up.charAt(0);
        for (int i = 0; i <= size; i++) {
            String left = p.substring(0 , i);
            String right = p.substring(i , size);
            ans.addAll(permuteList(left + ch + right , up.substring(1)));
        }
        return ans;
    }
}
