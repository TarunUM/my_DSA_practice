package OOPS.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonClass obj4 = SingletonClass.getInstance(1);
        SingletonClass obj1 = SingletonClass.getInstance(5);
        // after the 1st instance/object is created it is going to return the same reference
        SingletonClass obj2 = SingletonClass.getInstance(6);
        SingletonClass obj3 = SingletonClass.getInstance(7);

        // all 3 reference variables are pointing same object

        System.out.println(obj1.num);
        System.out.println(obj2.num);
        System.out.println(obj3.num);
        // output is obj1.num = 5, because only once the object is created and returns it to all the instances in this class

    }
}
