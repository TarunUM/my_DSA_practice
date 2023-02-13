package OOPS.principles.EncapsulationAbstraction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Encapsulation - Wrapping up the Implementation of the data-members and the method in a class.

        // the internal implementation Box is hidden from this class and wrapped in different class.
        // this is an implementation issue.
        Box obj = new Box();
        obj.setL(12);
        obj.setW(15);

//      Data-Hiding - is used to secure data whereas encapsulation used hide the Implementation.

//        Abstraction - Hiding the unnecessary details ant showing the valuable information

        // the method methods and data-members which are provided to us (ex. clear()) which is useful is abstraction.
        // this is a design issue.
        // it is a process of gaining information.
        System.out.println(obj.getL() + " " + obj.getW());


    }
}
