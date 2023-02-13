package OOPS.principles.encapsulation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Encapsulation - Wrapping up the Implementation of the data-members and the method in a class.

        // the internal implementation ArrayList is hidden from this class and wrapped in different class.
        ArrayList<Integer> arr1 = new ArrayList<Integer>();

        // the method methods and data-members which are provided to us (ex. clear()) which is useful is abstraction.
        arr1.clear();
    }
}
