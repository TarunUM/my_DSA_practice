package Recursion.SubSet_SubSequence_String;

import java.util.Scanner;

public class SkipACharacter {
    public static void main(String[] args) {
        skip("", "Avaroaaatar", 'a');
        Scanner input = new Scanner(System.in);
        System.out.println(skipReturn("Avaroaaatar", 'a'));
    }

    static void skip(String p, String input, char removed){
        if(input.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = input.charAt(0);
        if(ch == removed || ch == removed-32){
            skip(p,input.substring(1),removed);
        } else {
            skip(p + ch, input.substring(1), removed);
        }
    }

    static String skipReturn(String input, char removed){
        if(input.isEmpty()){
            return "";
        }

        char ch = input.charAt(0);
        if(ch == removed || ch == removed-32){
            return skipReturn(input.substring(1),removed);
        } else {
            return ch + skipReturn(input.substring(1), removed);
        }
    }
}
