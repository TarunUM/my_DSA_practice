package OOPS;

public class WrapperClassAndFinalAndGarbageCollector {
    public static void main(String[] args) {
        /* Wrapper Classes */
        /* Using Primitives as Object i.e.*/
            // int num = 10;
        Integer num = 10; /* It gives us more properties in this Object*/

        int a = 10;
        int b = 20;

        swap(a,b);
        /* Java uses PassByValues,
        (PassByReference is not applicable in java hence it's not changing the values) */
        /* The Immutability of changing value is only true for Primitive Datatypes*/
        /* Same goes for Wrapper Classes too (Integer) */
        System.out.println(a +  "  " + b);

        /* Because "Integer" class has "final" in it */
//        final int c = 12;
//        c = 24; (not POSSIBLE)

        final Student student1 = new Student("st1");
        final Student student2 = new Student("st2");

        /* We can change the values of object but we can not change whole object reference*/
        student1.name = "diffname";
//        student1 = student2; /* Because it is a Final Variable */

        /* Garbage Collector by creating no. of objects */
        /* "Finalize()" class destroys objects i.e. DE-CONSTRUCTOR */
        for (int i = 0; i < 371991; i++) {
            Student student = new Student("st2");
        }
        
    }

    static class Student{
        // final int a (Note Possible);
        String name;

        public Student(String name) {
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                System.out.println("item is Destroyed");
            } finally {
                super.finalize();
            }
        }
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
