package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

        var arr2 = arr.stream();

        arr2.filter(e->e%2==0).peek(System.out::println)
                .map(e->Math.pow(e,2))
                .forEach(System.out::println);


        int[] array = {1,2,3,4,5,6,7,8,9,10};

        var array2 = Arrays.stream(array);
        array2.forEach(e -> System.out.print(e + " "));
    }
}
