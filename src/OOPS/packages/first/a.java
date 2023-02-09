package OOPS.packages.first;

import OOPS.packages.second.b;

// it imports whole package
import OOPS.packages.second.c;

//it imports specific method from package
import static OOPS.packages.second.c.message;

public class a {
    // Packages are just Folders
    public static void main(String[] args) {
        b obj1 = new b("obj1");
        obj1.greetings();

        c.message();
        message();
    }
}
