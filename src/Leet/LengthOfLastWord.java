package Leet;
import java.util.Stack;

// 58 - https://leetcode.com/problems/length-of-last-word/

import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        int ans = lengthOfLastWord("   fly me   to   the moon  ");
        System.out.println(ans);
    }

    public static int lengthOfLastWord(String s) {
//        String[] arrS = s.split(" ");
//        return arrS[arrS.length-1].length();
        int count = 0;
        for(int i = s.length()-1; true; i--) {
            if(s.charAt(i) == ' '){
                if(count == 0){
                    continue;
                } else {
                    return count;
                }
            } else {
                count++;
            }
        }
    }
}