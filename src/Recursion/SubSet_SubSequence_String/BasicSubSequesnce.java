package Recursion.SubSet_SubSequence_String;

import java.util.ArrayList;

public class BasicSubSequesnce {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list = subSeqAscii("","abc");
        System.out.println(list);

        subSeqAndASCII("","abc");
    }

    // Printing answer in Recursion w/o returning
    static void subSeq(String p, String input){
        if(input.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = input.charAt(0);
        // Either take the char or leave it
        subSeq(p+ch, input.substring(1));
        subSeq(p, input.substring(1));
    }

    // return list With list in the Argument
    static void subSeqWithListInArg(String p, String input, ArrayList<String> list){
        if(input.isEmpty()){
            list.add(p);
            return;
        }
        char ch = input.charAt(0);

        // Either take the char or leave it
        subSeqWithListInArg(p+ch, input.substring(1), list);
        subSeqWithListInArg(p, input.substring(1) , list);

    }


    // return list Without list in the Argument
    static ArrayList<String> subSeqWithoutInArg(String p, String input){
        if(input.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = input.charAt(0);

        // Either take the char or leave it
        ArrayList<String> left = subSeqWithoutInArg(p+ch, input.substring(1) );
        ArrayList<String> right = subSeqWithoutInArg(p, input.substring(1) );

        right.addAll(left);
        return right;
    }

    // Printing answer in Recursion w/o returning
    static void subSeqAndASCII(String p, String input){
        if(input.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        char ch = input.charAt(0);
        // Either take the char or leave it
        subSeqAndASCII(p+ch, input.substring(1));
        subSeqAndASCII(p+(ch+0), input.substring(1));
        subSeqAndASCII(p, input.substring(1));
    }

    static ArrayList<String> subSeqAscii(String p, String input){
        if(input.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = input.charAt(0);

        // Either take the char or leave it
        ArrayList<String> first = subSeqAscii(p+ch, input.substring(1) );
        ArrayList<String> second = subSeqAscii(p, input.substring(1) );
        ArrayList<String> third = subSeqAscii(p+(ch+0), input.substring(1) );
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
