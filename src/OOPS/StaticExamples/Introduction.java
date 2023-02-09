package OOPS.StaticExamples;

public class Introduction {

    /* Main is Static because we can use this class w/o creating an object of the Class */
    // And since the main is the 1st method to run, and we do not create object of this class, static is mandatory
    // by putting static it allows us to run the main method
    public static void main(String[] args) {
        Student st1 = new Student(10, "st1", true);
        Student st2 = new Student(10, "st2", false);

        System.out.println(st1.classStrength);

        Student st3 = new Student(10, "st3", false);

        // Correct ways to use static variables from classes
        System.out.println(Student.classStrength);

        Introduction diffObj = new Introduction();
        diffObj.greeting2();
    }

    void greeting(){
        System.out.println("Hey");
        funGreeting();
    }

    void greeting2(){
        System.out.println("Hey greet1");
        greeting();
        // everything will be static at the i.e. main (for ex.)
        // so there we will be creating an instance of class, so it runs here.
    }

    static void funGreeting(){
        System.out.println("Hello Static");

        // Since "greeting();" is non-static member of class we can't use in static member
        // greeting(); //
        // so we have to create object/Instance of this class and then use it in static member
        Introduction obj = new Introduction();
        // and here we are referencing the object
        obj.greeting();
    }
}
