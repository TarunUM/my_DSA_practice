package OOPS.principles.polymorphism;

public class InClass extends School{
    @Override // It's an annotation to simply check whether the method is going to be overridden at the run-time.
    void status(){
        System.out.println("I'm inside a Class");
    }

    /* --- ERROR ---*/
//    @Override // Since the Super class of this class doesn't have the greeting method in it. so, it will show error.
    void greeting(){
        System.out.println("I'm inside a Class");
    }

    static void greeting2(){
        System.out.println("I'm inside a Class");
    }

}
