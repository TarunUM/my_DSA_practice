package Leet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingStarsFromAString {
    public static void main(String[] args) {
        String ans = removeStars2("abb*cdfg*****x*");
        System.out.println(ans);
    }
    public static String removeStars(String s) {
        List<String> ans=new ArrayList<String>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '*'){
                if(!ans.isEmpty()){
                    ans.remove(ans.size()-1);
                }
            }
            else {
                ans.add(String.valueOf(s.charAt(i)));
            }
        }
        return String.join( "", ans);
    }

//    abb*cdfg*****x*

    public static String removeStars2(String s) {
        int len = s.length();
        char[] chars = new char[len];
        int index = len, count = 0;

        for (int i = len - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '*') {
                count++;
            } else {
                if (count > 0) {
                    count--;
                } else {
                    chars[--index] = c;
                }
            }
        }
        return String.valueOf(chars, index, len - index);
    }
}
