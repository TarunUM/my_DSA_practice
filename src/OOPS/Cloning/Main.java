package OOPS.Cloning;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        String name = "Tarun";
        String name1 = name;
        System.out.println(name==name1);
        System.out.println();


        Student S1 = new Student(24, "tarun");
        Student S2 = (Student) S1.clone();
        System.out.println(S2.equals(S1));
        System.out.println(S1.getAge() +", "+ S1.getName()+", "+ Arrays.toString(S1.getArr()));
        System.out.println(S2.getAge() +", "+ S2.getName()+", "+ Arrays.toString(S2.getArr()));
        S1.name = "Dayum";
        S2.arr[0] = 100;
        System.out.println(S1.getAge() +", "+ S1.getName()+", "+ Arrays.toString(S1.getArr()));
        System.out.println(S2.getAge() +", "+ S2.getName()+", "+ Arrays.toString(S2.getArr()));
    }
}
