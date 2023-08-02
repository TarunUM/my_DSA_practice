package OOPS.principles.polymorphism;

public class Main {
//    polymorphism - It's a way of representing data in many ways,
//    hence the name poly(many), morphism(ways to represent)
    /* Types Of PolyMorphism :- 1. Static / Compile Time PolyMorphism
                                        - Achieved by method overloading

    *                           2. Dynamic / Run Time PolyMorphism
                                        - Achieved by method overriding */


    int square(int a, int b){
        return a*b;
    }

//    // return type doesn't matter if the data members are same, it will give error
//    void square(int a, int b){
//        System.out.println(a * b);
//    }

    float square(float r){
        return (r * r) / 2;
    }

    public static void main(String[] args) {
//        1. Static / Compile Time PolyMorphism
//              --- two method have same name as square, but the data-members are different,
//                    - and the checking and which method to run is actually happens at compile time.

        Main obj = new Main();
        obj.square(12);
        obj.square(8 , 10 );

//        2. Dynamic / Run Time PolyMorphism
//                ---
        School obj1 = new School();
//        obj1.status();

        School obj2 = new InClass();
        /* though we are using child class constructor, the super class 'School' also has status method in it.
           - but we are getting answers from child class because upcasting which is done at the runtime time.
           - the concept of the whole this function is known as how overriding works.
        * And the methods which we are using must be inside the base / parent class.

        * Parent object = new Child();
        * upcasting - which method will be called is based on the type of child class;
                        (Using Dynamic Method Dispatch - DMD)

        *  and since the checking happens at the compile time the super class must have the attribute */
//        obj2.status();

        School obj3 = new InGround();
        obj3.status();
        obj3.greeting();
        System.out.println("---");
        obj3.greeting2();  // greeting2() is static method

//        Static Does not depend on Object
//        Overriding depend on Object

//        System.out.println(obj3.toString());

    }

}
