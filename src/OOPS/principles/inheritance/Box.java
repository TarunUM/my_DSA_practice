package OOPS.principles.inheritance;

// public final class Box { --- // final is used to prevent inheritance,
// all the member of this class will also become final implicitly.
public class Box {
    int l;
    int w;
    int h;

    public static void greeting(){
        System.out.println("hello from Box Class.");
    }

    public Box() {
        super();
        /* Class Object is the root of the class hierarchy. Every class has Object as a superclass.
        All objects, including arrays, implement the methods of this class.*/
        this.l = this.h = this.w = -1;
    }

    public Box(int sides) {
        this.l = sides;
        this.w = sides;
        this.h = sides;
    }

    public Box(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    // this is how "using child constructor in base class" works
    public Box(int l, int w, int h, int weight) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public Box(int l, int w) {
        this.l = l;
        this.w = w;
        this.h = -1;
    }

    public Box(Box other) {
        this.l = other.l;
        this.w = other.w;
        this.h = other.h;
    }

    void information(){
        System.out.println("hello from Base/Super Class");
    }
}
