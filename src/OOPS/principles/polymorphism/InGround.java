package OOPS.principles.polymorphism;

public class InGround extends School{
    void status(){
        System.out.println("I'm inside Ground");
    }

     void greeting(){
        System.out.println("I'm inside a InGround");
    }

//    @Override // it will not work because no matter the object class the static will not depend on it
    static void greeting2(){
        System.out.println("I'm inside a InGround");
    }

    @Override // Overrides the main Java Object Class's toString Method
    // Before Output - OOPS.principles.polymorphism.InGround@378bf509
    public String toString() {
        return "InGround{} hello";
    }
}
