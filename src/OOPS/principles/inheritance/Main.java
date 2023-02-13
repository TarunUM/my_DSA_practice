package OOPS.principles.inheritance;

public class Main {
    public static void main(String[] args) {
        // calling other classes variables into this class
        Box box1 = new Box();
//        box1.greeting(); // it works but the static method doesn't depend on objects
        Box.greeting();

        Box box2 = new Box(8, 9, 10);
        Box box3 = new Box(box2);
//        System.out.println("[" + box3.l + ", "+box3.w + ", "+box3.h + "]");



        // Inheritance - ('extend' - used to inherit the other class, 'super' - used to call constructor of that class)
        BoxWeight box4 = new BoxWeight(8, 9, 10, 11);
//        System.out.println("[" + box4.l + ", "+box4.w + ", "+box4.h + ", "+box4.weight + "]");



        // using child constructor in base class
        Box box5 = new BoxWeight(8, 9 , 10, 11);
        // it dependent on what type of ref variable is, not on object type (i.e. constructor we have used here)
//        System.out.println("[" + box5.l + ", "+box5.w + ", "+box5.h + ", " + box5.weight + "]");
        /* we can not access the childClass attributes even-though we have used the constructor of child class
        * because the ref. variable is of BaseClass, and it doesn't have access. hence the 'box5.weight' is error */



        // using base constructor in child class
//        ChildClass box6 = new Baseclass(8, 9, 10);
        /* this isn't work because the ref variable is of type Child, and both have many attributes in it.
        * but the constructor is of type Base Class, and it doesn't have any knowledge of this child classes attributes.
        * this means the weight attributes is never going to be initialized.
        * and the one's we are trying to access should be initialized */


//  -----     Multi-Level inheritance    -----
        BoxPrice box7 = new BoxPrice();
//        System.out.println(box7.price + " " + box7.weight + " " + box7.l);

        BoxPrice box8 = new BoxPrice(8, 10, 21);
//        System.out.println(box8.price + " " + box8.weight + " " + box8.l);

//  -----     Multiple inheritance    -----
//        - using more than one class to inherit the properties ( more than 1 parent class to one child class)
//         it's not supported by the java because of naming conventions i.e. ambiguity,
//         but we can implement it by manually using interfaces.



//  -----    Hierarchical inheritance    -----
//        - one class to inherited to the more than one class ( one(1) parent class to more than one child class)
        BoxWeight2 box9 = new BoxWeight2(8, 9);
        System.out.println(box9.weight2 + " " + box9.l);

        BoxWeight box10 = new BoxWeight(8, 9);
        System.out.println(box10.weight + " " + box10.l);




//  -----    Hybrid inheritance    -----
//        - Combination of Single and Multiple Inheritance. -- Not Supported because of multiple inheritance.

    }
}
