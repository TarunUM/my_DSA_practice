package OOPS.abstractClasses;

  abstract class Parent {
      String s = "123";

//      public Parent(String s) {
//          this.s = s;
//          System.out.println(s);
//      }

      /* Abstract classes are meant to be overridden by subclasses.
          so they cannot be final, static or protected
          variables can not be finals,
          can not write abstract constructor,

          But Abstract classes can have static methods, declared variables but can not modify them in the same class,
     */

      final int val;

      public Parent(int val) {
          this.val = val;
      }

      abstract void greeting(String greeting, int age);

     void greeting(String greeting) {
        System.out.println(greeting + "parent");
    }

}
