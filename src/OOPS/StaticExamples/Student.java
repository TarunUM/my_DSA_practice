package OOPS.StaticExamples;

public class Student {
    int rno;
    String name;
    boolean passed;
    static int classStrength;

    static void greet(){
        System.out.println("Hello ");
        // Static does not allow us to use this inside its method because it's this dependent on instances
        // System.out.println(this.rno);
    }

    public Student(int rno, String name, boolean passed) {
        this.rno = rno;
        this.name = name;
        this.passed = passed;

        greet();
//        Student.greet();
        // this.greet();

        // it directly checks in class template
        Student.classStrength += 1;

        // though it works we should use class name because static doesn't depend on class instances(objects)
        /* it checks whether the object has "classStrength",
            since static variables do not depend on object of class so returns and shows warning,
            then it checks if class has "classStrength" return true warning is removed */
        // this.classStrength += 1;
    }
}
