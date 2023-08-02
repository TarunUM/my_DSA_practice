package OOPS.abstractClasses;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Child1 child1 = new Child1("abc");
        child1.greeting("child1", 15);
        Parent child2 = new Child2("bcd");
        child2.greeting("child2", 15);
        ArrayList<Integer> children = new ArrayList<Integer>();
        int i = 0;
        while(i < 10000000) {
            children.add(i);
            i++;
        }
        System.out.println(children.size());
        child2.greeting("hello ");
    }
}
