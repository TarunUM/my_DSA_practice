package OOPS.abstractClasses;

public class Child2 extends Parent{
    public Child2(String s) {
        super(123);
    }

    @Override
    void greeting(String greeting, int age) {
        System.out.println("Greeting from child2: " + greeting + ", age: " + age);
    }

//    public void greeting(String greeting) {
//        System.out.println(greeting + "child2");
//    }
}
