package OOPS.principles.polymorphism;

public class School {

//    final members can not be overridden because final methods can not be changed
/*    final is actually used to prevent overriding to enhance performance. because it will eliminate the confusion
*     between which one to pick between two instances */
//    known as Early Binding -
//    final void status(){
//        System.out.println("I'm inside school");
//    }

    void status(){
        System.out.println("I'm inside school");
    }

    void greeting(){
        System.out.println("greeting from school");
    }

    static void greeting2(){
        System.out.println("I'm inside School");
    }

}
