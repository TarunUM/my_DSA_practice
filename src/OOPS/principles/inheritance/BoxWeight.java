package OOPS.principles.inheritance;

public class BoxWeight extends Box {
    int weight;

    // "super()" is the keyWord which is to access the parent/base class of which it is extended.

    public BoxWeight() {
        // this will call super() by default i.e. By Default Constructor
        this.weight = -1;
    }

    public BoxWeight(int sides, int weight) {
        super(sides);
        this.weight = weight;
    }

    public BoxWeight(int weight) {
        // this will call super() by default if we do not mention it,
        super();
        this.weight = weight;
    }

    public BoxWeight(int l, int w, int h, int weight) {
        super(l, w, h);
//        System.out.println(this.l); // though it works sometimes if we need specific to baseclass output we use super.
//        System.out.println(super.l);
        this.weight = weight;
    }

    public BoxWeight(Box other, int weight) {
        super(other);
        this.weight = weight;
    }

    //this constructor won't work because the child class has to complete all the initialisation of parent class first.
//    public ChildClass(Baseclass other, int weight) {
//        this.weight = weight;
//        super(other); **** ERROR ****
//    }

    public BoxWeight(BoxWeight other) {
        // Even-though the other is of ChildClass object, it works as "using child constructor in base class"
        // it's dependent on ref variable type not on the object type
        super(other);
        this.weight = other.weight;
    }
}
