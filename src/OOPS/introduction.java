package OOPS;

import java.util.Arrays;

public class introduction {
    public static void main(String[] args) {
        // Basic data type
        int[] number = new int[5];

        /* Creating our own datatype i.e.
         Creating Object in by giving some rules i.e.
         ex. defining primitives datatype inside the class */

        Student[] students = new Student[5];

        //just declaring Object
        Student tarun = new Student();

        /* it can be achieved By Default Constructor. */
//        tarun.rollno = 10;
//        tarun.name = "Tarun M";

        /* Getting values from Objects and printing values */
//        System.out.println(tarun.rollno);
//        System.out.println(tarun.name);
//        System.out.println(tarun.marks);

        /* new Student();
         "new" is used to allocate memory dynamically.
         Constructor is special type of function
         this "Student()" is the constructor. */

        // create a new student using Special Constructor.
        Student student2 = new Student(86, "Superhero", 90.0f);

        tarun.greetings();

        student2.print();

        Student student3 = new Student(tarun);
        student3.print();

        students[0] = tarun;
        students[1] = student2;
        students[2] = student3;
//        for(Student object : students){
//            if(object != null){
//                object.print();
//            }
//        }


    }


    //Creates class
    //For every Single Student
    //This is a template of object with rules
    static class Student{
        int rollno;
        String name;
        float marks = 86.28f;

        // this is the By Default Constructor
        Student(){
            // "this" is Keyword used to manipulate objects individually.
            this.rollno = 10;
            this.name = "Tarun M";

            /* --- OR we can use the below statement --- */
            // this(10, "Default Name ", 86.28f)
        }


        //As functions, even Constructors have Overloading i.e. No. of Constructors can be created in single class
        // this is a Special Constructor
        Student(int rollno, String naam, float marks){
            this.rollno = rollno;
            this.marks = marks;
            name = naam; //we can write w/o using "this" but the naming of Reference Variables should be different.
        }

        Student(Student other){
            this.rollno = other.rollno;
            this.marks = other.marks;
            name = other.name; // it changes values but it's a bad practice
        }

        // these are all properties inside class
        void print(){
            System.out.println("------------------------------------");
            System.out.println("rNo. --- name --- marks");
            System.out.println(this.rollno + " --- " + this.name + " --- " + this.marks);
            System.out.println("------------------------------------");
        }

        void greetings(){
            System.out.println("Hello World "+this.name);
        }

    }
}
