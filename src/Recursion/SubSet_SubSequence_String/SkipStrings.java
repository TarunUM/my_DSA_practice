package Recursion.SubSet_SubSequence_String;

public class SkipStrings {
    public static void main(String[] args) {
        String ans = skipString2("devpdogdgdoogsfse", "doog", "dog");
        System.out.println(ans);
    }
    static String skipString(String input, String removed){
        if(input.isEmpty()){
            return "";
        }
        int len = removed.length();
        if(input.startsWith(removed)){
            return skipString(input.substring(len),removed);
        } else {
            return input.charAt(0) + skipString(input.substring(1), removed);
        }
    }
    static String skipString2(String input, String removed, String notRemoved){
        if(input.isEmpty()){
            return "";
        }
        int len = removed.length();
        if(input.startsWith(removed) && !input.startsWith(notRemoved)){
            return skipString2(input.substring(len),removed, notRemoved);
        } else {
            return input.charAt(0) + skipString2(input.substring(1), removed, notRemoved);
        }
    }
}
