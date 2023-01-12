package Recursion.SubSet_SubSequence_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class UsingIterations {
    public static void main(String[] args) {
        String[] arr = {"a","b","b"};
        List<List<String>> ans = subsetsNoDups(arr);
        for(List<String> n : ans){
            System.out.println(n);
        }
    }

    static List<List<String>> subsets(String[] arr){
        List<List<String>> main = new ArrayList<>();

        // adding the empty element []
        main.add(new ArrayList<>());

        for (String i: arr) {
            int size = main.size();
            for (int j = 0; j < size; j++) {
                List<String> subset = new ArrayList<>(main.get(j));
                subset.add(i);
                main.add(subset);
            }
        }

        return main;
    }

    static List<List<String>> subsetsNoDups(String[] arr){

        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        // creating main output List
        List<List<String>> main = new ArrayList<>();

        // adding the empty element []
        main.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            //so the duplicates are avoided
            if (i > 0 && Objects.equals(arr[i], arr[i - 1])) {
                start = end + 1;
            }
            end = main.size() - 1;
            int size = main.size();
            for (int j = start; j < size; j++) {
                List<String> subset = new ArrayList<>(main.get(j));
                subset.add(arr[i]);
                main.add(subset);
            }
        }
        return main;
    }
}
