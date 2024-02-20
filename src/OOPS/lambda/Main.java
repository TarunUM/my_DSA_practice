package OOPS.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;


public class Main {
    public static void main(String[] args){

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(5);

        Consumer<Integer> printer = item -> System.out.println(2*item);
        arr.forEach(printer);
        System.out.println("-------------------");
        arr.forEach(e -> System.out.println(e));
        System.out.println("-------------------");

        operations sum = Integer::sum;
        operations diff = (a, b) -> a-b;
        operations mul = (a, b) -> a*b;
        operations div = (a, b) -> a/b;
        operations mod = (a, b) -> a%b;

        Main myCalc = new Main();
        int x=10, y=5;
        System.out.println(myCalc.op(x,y,sum));
        System.out.println(myCalc.op(x,y,diff));
        System.out.println(myCalc.op(x,y,mul));
        System.out.println(myCalc.op(x,y,div));
        System.out.println(myCalc.op(x,y,mod));
    }

    private int op(int a, int b, operations op){
        return op.operate(a,b);
    }
}

interface operations {
    int operate(int a, int b);
}