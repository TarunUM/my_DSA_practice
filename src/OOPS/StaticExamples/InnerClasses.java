package OOPS.StaticExamples;

// Static variables, method are executed at compile time
// and objects are created at tun time, that's the reason static are not dependent on instances/objects

// Only nested classes can be static
// because the outer class is itself not dependent on anything
// but a nested class can be dependent so we use static for inner classes


public class InnerClasses {
    static class exm{
        String name;

        void print(){
        System.out.println(this.name);
            // the answer will be the diff for each object because "name" variable is not static, the class is
            // and each object can have their own static methods
            // OUTPUT -- ('obj1' , 'obj2')
        }

        public exm(String name) {
            this.name = name;
        }

        // before using to-string method output is "OOPS.StaticExamples.InnerClasses$exm@6d03e736"
        // "6d03e736" is a hashcode of the object
        @Override
        public String toString() {
            return "exm{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        exm obj1 = new exm("obj1");
        exm obj2 = new exm("obj2");

        obj1.print();
        obj2.print();

        System.out.println(obj1);
    }
}

//class exm{
//    static String name;
//
//    void print(){
////        System.out.println(this.name);
//        System.out.println(exm.name);
          // OUTPUT -- ('obj2' , 'obj2')
//        // the answer will be the last input name because "name" is static variable which is same for all objects
//    }
//
//    public exm(String name) {
//        exm.name = name;
//    }
//}
