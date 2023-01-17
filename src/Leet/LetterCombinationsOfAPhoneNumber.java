package Leet;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        String input = "29";
        List<String> list = new ArrayList<>();
        list = LetterCombinations(input);
        System.out.println(list);
    }

    public static List<String> LetterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        Combinations("",digits,list);
        return list;
    }

    static void Combinations(String p, String up ,List<String> list){
        if(up.isEmpty()){
            list.add(p);
            return ;
        }

        int digit = up.charAt(0) - '0';

        if(digit < 7) {
            for (int i = (digit - 2) * 3; i < (digit-1) * 3; i++) {
                char ch = (char) ('a' + i);
                Combinations(p + ch, up.substring(1), list);
            }
        }

        if(digit == 7) {
            for (int i = (digit - 2) * 3; i <= (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                Combinations(p + ch, up.substring(1), list);
            }
        }

        if(digit == 8){
            for (int i = (((digit-2) * 3)+1); i < (((digit-1) * 3)+1) ; i++) {
                char ch = (char) ('a' + i);
                Combinations(p + ch, up.substring(1), list);
            }
        }

        if(digit == 9){
            for (int i = (((digit-2) * 3)+1); i <= (((digit-1) * 3)+1) ; i++) {
                char ch = (char) ('a' + i);
                Combinations(p + ch, up.substring(1), list);
            }
        }

    }
}
