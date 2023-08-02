package OOPS.abstractClasses;

public class Child1 extends Parent {
    public Child1(String s) {
        super(123);
        this.s = s;
    }

    @Override
    void greeting(String greeting, int age) {
        System.out.println("Greeting from child1: " + greeting + ", age: " + age);
    }


    void greeting(String greeting) {
        System.out.println(greeting + "child1");
    }
}
